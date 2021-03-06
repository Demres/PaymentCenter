package serviceCenter;


import bank.Bank;
import exceptions.FundsException;
import exceptions.PaymentRefusedException;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;

public class ServiceCenter implements Serializable {

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

    public void chargeCard(int cardNumber, BigDecimal amount, RecipientOfService requester) {
        Bank bank = findBank(String.valueOf(cardNumber));
        if (bank != null) {
            try {
                bank.chargeCard(cardNumber, amount, requester);
            }
            catch (FundsException | PaymentRefusedException e) {
                e.printStackTrace();
            }
        }
    }

    private Bank findBank(String cardNumber) {
        for (Bank bank : banks) {
            if (cardNumber.startsWith(String.valueOf(bank.getBankPrefix())))
                return bank;
        }

        return null;
    }

    public void createCustomer() {}

    public void createCard() {}

}
