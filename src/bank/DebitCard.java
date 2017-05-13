package bank;


import exceptions.AccountBalanceException;
import serviceCenter.Transaction;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Locale;

public class DebitCard extends Card implements Serializable {

    private Account account;

    public DebitCard(Locale locale) {
        account = new Account(locale);
        number = "1234";
    }

    public DebitCard() {
        this(new Locale("pl_PL"));
    }

    @Override
    public void charge(BigDecimal amount) throws AccountBalanceException {
        Transaction transaction = new Transaction(amount);

        try {
            account.charge(amount);
        }
        catch (AccountBalanceException e) {
            transaction.setPaymentRealised(false);
            addTransaction(transaction);
            throw e;
        }

        transaction.setPaymentRealised(true);
        addTransaction(transaction);
    }

    public void deposit(BigDecimal money) {
        account.deposit(money);
    }

    public String getBalanceWithCurrency() {
        return account.getBalanceWithCurrency();
    }
}
