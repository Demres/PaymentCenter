package bank;


import java.io.Serializable;
import java.util.Locale;

public class AtmCard extends DebitCard implements Serializable {

    public AtmCard(Currencies currency, int bankPrefix) {
        super(currency, bankPrefix);
    }
}
