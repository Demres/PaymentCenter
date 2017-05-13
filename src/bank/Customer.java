package bank;


import java.io.Serializable;
import java.util.ArrayList;

public class Customer implements Serializable {

    private String name;
    private String lastname;
    private ArrayList<Card> cards = new ArrayList<>();

    public Customer() {

    }

    public Customer(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void addCard(Card card) {
        cards.add(card);
    }
}
