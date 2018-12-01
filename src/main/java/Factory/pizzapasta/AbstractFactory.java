package Factory.pizzapasta;

import Factory.pizzapasta.Pasta;
import Factory.pizzapasta.Pizza;

public abstract class AbstractFactory {

    abstract Pizza orderPizza(String name);
    abstract Pasta orderPasta(String name);

}
