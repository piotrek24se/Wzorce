package Factory.pizzapasta.pasta;

import Factory.pizzapasta.Pasta;

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
