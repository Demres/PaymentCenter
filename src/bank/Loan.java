package bank;


import exceptions.LoanLimitException;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Locale;

public class Loan implements Serializable {

    private BigDecimal balance;
    private BigDecimal loan;
    private Currency currency;

    public Loan(Locale locale, BigDecimal loan) {
        this.balance = new BigDecimal(0);
        this.loan = loan;
        this.currency = Currency.getInstance(locale);
    }

    public Loan() {
        this(new Locale("pl_PL"), new BigDecimal(2000));
    }

    public void setLoan(BigDecimal loan) {
        this.loan = loan;
    }

    public void resetBalance() {
        balance = new BigDecimal(0);
    }

    public void charge(BigDecimal money) throws LoanLimitException {
        BigDecimal difference = new BigDecimal(loan.toString()).subtract(balance);
        if (money.compareTo(difference) > 0)
            throw new LoanLimitException("Requested money exceeds available founds "
                    + difference.toString() + currency.getCurrencyCode());

        balance.add(money);
    }

    public String getBalanceWithCurrency() {
        return balance.toString() + currency.getCurrencyCode();
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public String getLoanWithCurrency() {
        return loan.toString() + currency.getCurrencyCode();
    }

    public BigDecimal getLoan() {
        return loan;
    }
}
