package factory;

public class FactoryMethod {

    public static void main(String[] args) {
        Factory fabryka = new FabrykaPaluszkow();
        Product product = fabryka.create();

        product.dodajSol(150);
    }

    interface Product {
        void dodajSol(int ileSoli);
    }

    static class Krakersy implements Product {
        @Override
        public void dodajSol(int ileSoli) {
            System.out.println("Dodano sól do Krakersów w ilości: " + ileSoli);
        }
    }

    static class Paluszki implements Product {
        @Override
        public void dodajSol(int ileSoli) {
            System.out.println("Dodano sól do Paluszków w ilości: " + ileSoli);
        }
    }

    interface Factory {
        Product create();
    }

    static class FabrykaKrakersow implements Factory {
        @Override
        public Product create() {
            return new Krakersy();
        }
    }

    static class FabrykaPaluszkow implements Factory {

        @Override
        public Product create() {
            return new Paluszki();
        }
    }
}
