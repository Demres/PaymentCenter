package serviceCenter;


import bank.Bank;

import java.math.BigDecimal;
import java.util.ArrayList;

public class ServiceCenter {

    private ArrayList<Bank> banks = new ArrayList<>();
    private ArrayList<RecipientOfService> recipients = new ArrayList<>();

    public ArrayList<Bank> getBanks() {
        return banks;
    }

    public void setBanks(ArrayList<Bank> banks) {
        this.banks = banks;
    }

    public ArrayList<RecipientOfService> getRecipients() {
        return recipients;
    }

    public void setRecipients(ArrayList<RecipientOfService> recipients) {
        this.recipients = recipients;
    }

    public void chargeCard(int cardNumber, BigDecimal amount, RecipientOfService requester) {}


}
