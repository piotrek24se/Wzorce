package factory.pizzapasta;

import factory.pizzapasta.pasta.Pasta2;
import factory.pizzapasta.pizza.Pizza2;

public class TorinoFactory extends AbstractFactory {

    @Override
    Pizza orderPizza(String name) {
        if("PIZZA2".equalsIgnoreCase(name)) {
            return  new Pizza2();
        }
        return null;
    }

    @Override
    Pasta orderPasta(String name) {
        if("PASTA2".equalsIgnoreCase(name)) {
            return  new Pasta2();
        }
        return null;
    }
}
