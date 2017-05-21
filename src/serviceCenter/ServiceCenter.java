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

    public void addBank(Bank bank) {
        banks.add(bank);
    }

    public ArrayList<RecipientOfService> getRecipients() {
        return recipients;
    }

    public void addRecipient(RecipientOfService recipient) {
        recipients.add(recipient);
    }

    public void chargeCard(int cardNumber, BigDecimal amount, RecipientOfService requester) {}

    public void createCustomer() {}

    public void createCard() {}

}
