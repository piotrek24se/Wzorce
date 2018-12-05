package adapter;

public class PaybackCard {

    private static final float AVAILABLE = 500;

    public boolean payByPoints(float amount) {
        return amount <= AVAILABLE;
    }

}
