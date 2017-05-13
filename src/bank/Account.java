package bank;


import exceptions.AccountBalanceException;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Currency;
import java.util.Locale;

public class Account implements Serializable {

    private BigDecimal balance;
    private Currency currency;

    public Account() {
        this(new Locale("pl_PL"));
    }

    public Account(Locale locale) {
        currency = Currency.getInstance(locale);
        balance = new BigDecimal(0);
    }

    public void deposit(BigDecimal money) {
        balance = balance.add(money);
    }

    public void charge(BigDecimal money) throws AccountBalanceException {
        if (balance.compareTo(money) < 0)
            throw new AccountBalanceException("Requested money exceeds account's balance " + getBalanceWithCurrency());

        balance = balance.subtract(money);
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public String getBalanceWithCurrency() {
        return balance.toString() + currency.getCurrencyCode();
    }
}
