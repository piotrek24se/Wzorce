package builder;

public class HouseMain {

    public static void main(String[] args) {
        House house = new House.Builder()
                .withWindow("10 Windows")
                .withDoorsNumber(150)
                .withOpenDoors()
                .build();

        House.Builder builder = new House.Builder();

        House h = builder.withOpenDoors().withDoorsNumber(124324).build();
        builder.withWindow("fsfsdf");

        System.out.println(house);
        System.out.println(h);
    }
}
