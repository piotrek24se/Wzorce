package Factory.pizzapasta.pizza;

import Factory.pizzapasta.Pizza;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pizza3 implements Pizza {


    @Override
    public String getName() {
        return "Pizza1";
    }

    @Override
    public List<String> getIngredients() {
        return new ArrayList<>(Arrays.asList("onion", "cheese"));
    }
}
