package bank;


import exceptions.LoanLimitException;
import serviceCenter.Transaction;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Locale;

public class CreditCard extends Card implements Serializable {

    private Loan loan;

    public CreditCard(Locale locale) {
        loan = new Loan(locale, new BigDecimal(5000));
    }

    public void setLoan(BigDecimal loan) {
        this.loan.setLoan(loan);
    }

    @Override
    public void charge(BigDecimal amount) throws LoanLimitException {
        Transaction transaction = new Transaction(amount);

        try {
            loan.charge(amount);
        }
        catch (LoanLimitException e) {
            transaction.setPaymentRealised(false);
            addTransaction(transaction);
            throw e;
        }

        transaction.setPaymentRealised(true);
        addTransaction(transaction);
    }

    public void resetBalance() {
        loan.resetBalance();
    }

}
