package factory.pizzapasta;

public class PizzaMain {

    public static void main(String[] args) {

        AbstractFactory factory =
                FactoryProducer.getFactory("torino");
        Pizza pizza = factory.orderPizza("margeritha");
        System.out.println(pizza.getName());

    }

}
