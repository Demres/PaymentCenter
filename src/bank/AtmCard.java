package bank;


import java.io.Serializable;
import java.util.Locale;

public class AtmCard extends DebitCard implements Serializable {

    public AtmCard(Locale locale) {
        super(locale);
    }
}
