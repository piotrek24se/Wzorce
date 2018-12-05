package adapter;

public class DebitCard {

    private static final float AVAILABLE = 1000;

    public boolean takeMoney(float amount) {
        return amount <= AVAILABLE;
    }

}
