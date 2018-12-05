package adapter;

public class PaybackCardAdapter implements CardAdapter {

    private PaybackCard paybackCard;

    public PaybackCardAdapter() {
        this.paybackCard = new PaybackCard();
    }

    @Override
    public boolean take(float amount) {
        return paybackCard.payByPoints(amount);
    }
}
