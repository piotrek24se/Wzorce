import Singleton.Currency;
import Singleton.Money;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {

    //rozwiazanie z zajec

    //dobra praktyka - wyciaganie do zmiennych (zmieniajac wartosc zmiennej zmieniaja sie wszystkie pola i nie musimy kopiowac wartosci)
    private static final float TEST_AMOUNT = 5.56f;
    private static final Currency TEST_CURRENCY = Currency.PLN;

    private Money money;

    @BeforeEach
    void setUp() {
        money = new Money(TEST_AMOUNT, Currency.PLN);
    }

    @Test
    void testGetAmount() {
        Money money = new Money(TEST_AMOUNT, Currency.PLN);
        assertEquals(TEST_AMOUNT, money.getAmount());
    }

    @Test
    void testGetCurrency() {
        Money money = new Money(TEST_AMOUNT, Currency.PLN);
        assertEquals(Currency.PLN, money.getCurrency());
    }

    @Test
    void testToString() {
        assertEquals(TEST_CURRENCY + " " + TEST_AMOUNT, money.toString());
    }

    @Test
    void testEquals() {
        assertEquals(new Money(TEST_AMOUNT, TEST_CURRENCY), money);
    }

    @Test
    void testParse() {
        assertEquals(money, Money.parse(money.toString()));
    }

    //moje rozwiazanie

//    @Test
//    public void shouldReturn10AndPLN() {
//        //given
//        Singleton.Money money = new Singleton.Money(10, Singleton.Money.Singleton.Currency.PLN);
//        //when
//        float amount = money.getAmount();
//        Singleton.Money.Singleton.Currency currency = money.getCurrency();
//        //then
//        assertEquals(10, amount);
//        assertEquals(Singleton.Money.Singleton.Currency.PLN, currency);
//    }
//
//    @Test
//    public void shoulfReturnPLN556IfAmountIs10AndCurrencyIsPLN() {
//        //given
//        Singleton.Money money1 = new Singleton.Money(5.56f, Singleton.Money.Singleton.Currency.PLN);
//        //when
//        String string = money1.toString();
//        //then
//        assertEquals("PLN 5.56", string);
//    }


}