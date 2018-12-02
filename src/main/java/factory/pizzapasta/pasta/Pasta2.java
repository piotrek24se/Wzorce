package factory.pizzapasta.pasta;

import factory.pizzapasta.Pasta;

public class Pasta2 implements Pasta {
    @Override
    public String getName() {
        return "Pasta2";
    }

    @Override
    public String getPastaType() {
        return "Type2";
    }
}
