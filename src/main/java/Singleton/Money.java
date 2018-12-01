package Singleton;

import java.util.Objects;

public class Money {

    //moje rozwiazanie

//    private float amount;
//    private Singleton.Currency currency;
//
//    public enum Singleton.Currency {
//        EUR, DOL, PLN
//    }
//
//    public Singleton.Money(float amount, Singleton.Currency currency) {
//        this.amount = amount;
//        this.currency = currency;
//    }
//
//    public float getAmount() {
//        return amount;
//    }
//
//    public Singleton.Currency getCurrency() {
//        return currency;
//    }
//
//    @Override
//    public String toString() {
//        return "" + currency + " " + amount;
//    }
//
//    //metoda equals do sprawdzenia (moze byc zle napisana)
//    @Override
//    public boolean equals(Object o) {
//        if (!(o instanceof Singleton.Money)) return false;
//        else if (this.getAmount() == ((Singleton.Money) o).getAmount() && this.getCurrency() == ((Singleton.Money) o).getCurrency())
//            return true;
//        else return false;
//    }

    //rozwiazanie z zajec

    private float amount;
    private Currency currency;

    public static Money parse(String moneyInString) {

        String[] splitted = moneyInString.split(" ");
        return new Money(Float.parseFloat(splitted[1]), Currency.valueOf(splitted[0]));
    }

    public Money(float amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public float getAmount() {
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    @Override
    public String toString() {
        return currency + " " + amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return Float.compare(money.amount, amount) == 0 &&
                currency == money.currency;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, currency);
    }

}
