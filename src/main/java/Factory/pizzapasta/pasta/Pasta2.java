package Factory.pizzapasta.pasta;

import Factory.pizzapasta.Pasta;

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
