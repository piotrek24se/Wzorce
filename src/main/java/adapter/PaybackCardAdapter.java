package adapter;

public class PaybackCardAdapter implements CardAdapter {
    private PaybackCard paybackCard;

    public PaybackCardAdapter(DebitCard paybackCard) {
        this.paybackCard = new PaybackCard();

}

    @Override
    public boolean take(Float amount) {
        return paybackCard.payByPoints(amount);
    }
}
