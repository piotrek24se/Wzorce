package prototype;

import java.util.HashMap;
import java.util.Map;

public class CarMain {

    private static int a = 5;
    private static Map<String, String> mapa = new HashMap<>();

    static {
        mapa.put("A", "val a");
        mapa.put("B", "val b");
        mapa.put("C", "val c");
        mapa.put("D", "val d");
    }

    public static void main(String[] args) {

        Car car = new Car("CZERWONY", "FABIA");

        System.out.println(car);

        Car nibieskaFabia = car.clone();
        nibieskaFabia.setColor("NIEBIESKI");

        System.out.println(nibieskaFabia);
        System.out.println(car);

    }
}
