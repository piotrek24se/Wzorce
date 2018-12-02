package factory.pizzapasta;

import factory.pizzapasta.pasta.Pasta1;
import factory.pizzapasta.pizza.Pizza1;

public class SicilianFactory extends AbstractFactory {

    @Override
    Pizza orderPizza(String name) {
        if("PIZZA1".equalsIgnoreCase(name)) {
            return  new Pizza1();
        }
        return null;
    }

    @Override
    Pasta orderPasta(String name) {
        if("PASTA1".equalsIgnoreCase(name)) {
            return  new Pasta1();
        }
        return null;
    }
}
