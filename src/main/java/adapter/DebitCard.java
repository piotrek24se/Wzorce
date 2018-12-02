package adapter;

public class DebitCard {

    private static final int AVAILABLE = 1000;

    public boolean takeMoney(Float amount) {
        return amount <= AVAILABLE;
    }

}
