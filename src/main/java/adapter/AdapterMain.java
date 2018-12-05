package adapter;

public class AdapterMain {

    public static void main(String[] args) {
        DebitCard debitCard = new DebitCard();
        debitCard.takeMoney(100);

        PaybackCard paybackCard = new PaybackCard();
        paybackCard.payByPoints(900);

        CardAdapter card = new DebitCardAdapter();
        card.take(100);
    }

}
