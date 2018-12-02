package factory.pizzapasta.pasta;

import factory.pizzapasta.Pasta;

public class Pasta1 implements Pasta {
    @Override
    public String getName() {
        return "Pasta1";
    }

    @Override
    public String getPastaType() {
        return "Type1";
    }
}
