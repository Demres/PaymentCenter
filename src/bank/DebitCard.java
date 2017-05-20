package bank;


import exceptions.AccountBalanceException;
import serviceCenter.RecipientOfService;
import serviceCenter.Transaction;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Locale;

public class DebitCard extends Card implements Serializable {

    private Account account;

    public DebitCard(Locale locale, int prefix) {
        super(prefix);
        account = new Account(locale);
    }

    public DebitCard(int prefix) {
        this(new Locale("pl_PL"), prefix);
    }

    @Override
    public void charge(BigDecimal amount, RecipientOfService requester) throws AccountBalanceException {
        Transaction transaction = new Transaction(amount, requester);

        try {
            account.charge(amount);
        }
        catch (AccountBalanceException e) {
            throw e;
        }
        addTransaction(transaction);
    }

    public void deposit(BigDecimal money) {
        account.deposit(money);
    }

    public String getBalanceWithCurrency() {
        return account.getBalanceWithCurrency();
    }
}
