package factory.pizzapasta.pizza;

import factory.pizzapasta.Pizza;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pizza1 implements Pizza {
    @Override
    public String getName() {
        return "Pizza1";
    }

    @Override
    public List<String> getIngredients() {
        return new ArrayList<>(Arrays.asList("onion", "cheese"));
    }
}
