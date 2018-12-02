package factory.pizzapasta.pizza;

import factory.pizzapasta.Pizza;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pizza2 implements Pizza {


    @Override
    public String getName() {
        return "Pizza2";
    }

    @Override
    public List<String> getIngredients() {
        return new ArrayList<>(Arrays.asList("onion", "cheese"));
    }
}
