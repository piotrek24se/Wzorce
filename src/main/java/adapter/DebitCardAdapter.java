package adapter;

public class DebitCardAdapter implements CardAdapter {

    private DebitCard debitCard;

    public DebitCardAdapter() {
        this.debitCard = new DebitCard();
    }

    @Override
    public boolean take(float amount) {
        return debitCard.takeMoney(amount);
    }
}
