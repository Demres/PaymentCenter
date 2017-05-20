package bank;


import exceptions.FundsException;
import exceptions.PaymentRefusedException;
import serviceCenter.RecipientOfService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Random;

public class Bank {

    private String name;
    private final int bankPrefix;
    private ArrayList<Customer> customers = new ArrayList<>();
    private static int nextBankPrefix = 1000;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public Bank(String name) {
        this.name = name;
        bankPrefix = nextBankPrefix;
        nextBankPrefix++;
    }

    public void chargeCard(int cardNumber, BigDecimal amount, RecipientOfService requester)
            throws FundsException, PaymentRefusedException {
        if (new Random().nextInt(100) + 1 > 20) {
            Card card = findCard(cardNumber);
            if (card == null) throw new PaymentRefusedException("Card not found");
            card.charge(amount, requester);
        }
        else {
            throw new PaymentRefusedException("Bank has refused transaction");
        }
    }

    private Card findCard(int cardNumber) {
        for (Customer customer : customers) {
            for (Card card : customer.getCards()) {
                if (card.getCardNumber() == cardNumber) {
                    return card;
                }
            }
        }

        return null;
    }
}
