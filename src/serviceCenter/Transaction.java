package serviceCenter;


import bank.Card;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.GregorianCalendar;

public class Transaction  implements Serializable {

    private BigDecimal requestedMoney;
    private boolean isPaymentRealised;
    private GregorianCalendar date;

    public Transaction() {
    }

    public Transaction(BigDecimal requestedMoney) {
        this.requestedMoney = requestedMoney;
        this.date = new GregorianCalendar();
    }

    public boolean isPaymentRealised() {
        return isPaymentRealised;
    }

    public void setPaymentRealised(boolean paymentRealised) {
        isPaymentRealised = paymentRealised;
    }

    public BigDecimal getRequestedMoney() {
        return requestedMoney;
    }

    public void setRequestedMoney(BigDecimal requestedMoney) {
        this.requestedMoney = requestedMoney;
    }

}
