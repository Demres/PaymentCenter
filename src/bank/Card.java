package bank;

import exceptions.FundsException;
import serviceCenter.Transaction;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;

public abstract class Card implements Serializable {

    protected String number;
    private ArrayList<Transaction> transactions = new ArrayList<Transaction>();

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public abstract void charge(BigDecimal amount) throws FundsException;
}
