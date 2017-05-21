package bank;

import exceptions.AccountBalanceException;
import serviceCenter.Transaction;

import java.io.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Locale;


public class Main {

    public static void main(String[] args) throws IOException {
        /*
        Customer customer = new Customer("Andy", "McDonald");
        DebitCard debitcard = new DebitCard(Locale.US);
        debitcard.deposit(new BigDecimal("1234.60"));
        System.out.println(debitcard.getBalanceWithCurrency());
        try {
            debitcard.charge(new BigDecimal("65.50"));
            debitcard.charge(new BigDecimal("6500.50"));
        }
        catch (AccountBalanceException e) {
            System.out.println("fucked up");
           // e.printStackTrace();
        }
        System.out.println(debitcard.getBalanceWithCurrency());
        ArrayList<Transaction> list = debitcard.getTransactions();
        for (Transaction t : list) {
            System.out.println(t.getRequestedMoney());
        }
        customer.addCard(debitcard);

        FileOutputStream fout = new FileOutputStream("/home/kamil/Projects/Java/CardServiceCenter/object.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fout);
        oos.writeObject(customer);


        FileInputStream fin = new FileInputStream("/home/kamil/Projects/Java/CardServiceCenter/object.ser");
        ObjectInputStream ois = new ObjectInputStream(fin);

        Customer customer;
        try {
            customer = (Customer) ois.readObject();
            Card card = customer.getCards().get(0);
            for (Transaction t : card.getTransactions()) {
                System.out.println(t.isPaymentRealised());
            }
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        */

    }
}
