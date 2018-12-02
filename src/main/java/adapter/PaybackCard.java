package adapter;

public class PaybackCard {

    private static final int AVAILABLE = 500;


    public boolean payByPoints(Float amount) {
        return amount <= AVAILABLE;
    }

}
