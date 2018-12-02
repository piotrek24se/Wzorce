package factory.pizzapasta;

public abstract class AbstractFactory {

    abstract Pizza orderPizza(String name);
    abstract Pasta orderPasta(String name);

}
