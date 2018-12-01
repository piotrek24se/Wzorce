package Factory.pizzapasta.pasta;

import Factory.pizzapasta.Pasta;

public class Pasta3 implements Pasta {
    @Override
    public String getName() {
        return "Pasta3";
    }

    @Override
    public String getPastaType() {
        return "Type3";
    }
}
