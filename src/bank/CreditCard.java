package bank;


import exceptions.LoanLimitException;
import serviceCenter.RecipientOfService;
import serviceCenter.Transaction;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Locale;

public class CreditCard extends Card implements Serializable {

    private Loan loan;

    public CreditCard(Locale locale, int prefix) {
        super(prefix);
        loan = new Loan(locale, new BigDecimal(5000));
    }

    public void setLoan(BigDecimal loan) {
        this.loan.setLoan(loan);
    }

    @Override
    public void charge(BigDecimal amount, RecipientOfService requester) throws LoanLimitException {
        Transaction transaction = new Transaction(amount, requester);

        try {
            loan.charge(amount);
        }
        catch (LoanLimitException e) {
            throw e;
        }
        addTransaction(transaction);
    }

    public void resetBalance() {
        loan.resetBalance();
    }

}
