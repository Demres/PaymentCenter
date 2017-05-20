package serviceCenter;


public abstract class RecipientOfService {

    private String name;
    private int recipientId;

    private static int nextRecipientId = 1;

    public RecipientOfService(String name) {
        this.name = name;
        this.recipientId = nextRecipientId;
        nextRecipientId++;
    }
}
