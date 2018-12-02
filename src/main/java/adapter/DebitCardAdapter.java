package adapter;

public class DebitCardAdapter implements CardAdapter {

    private DebitCard debitCard;

    public DebitCardAdapter(DebitCard debitCard) {
        this.debitCard = new DebitCard();
    }

    @Override
    public boolean take(Float amount) {
        return debitCard.takeMoney(amount);
    }
}
