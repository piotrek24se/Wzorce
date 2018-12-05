package observer;

public class ObserverMain {

    // na git wersja z mapa

    public static void main(String[] args) {
        Button button = new Button();
        OnClickListener listener = new ClickListener();

        button.setListener(listener);
        button.click();
        button.removeListener();
        button.click();

        button.setListener(() -> {
            System.out.println("Click 2");
        });
        button.click();

//        wersja z lista dla >1 sluchacza
//
//        button.removeListener(listener);
//
//        OnClickListener listener2 = () -> {
//            System.out.println("Click 2");
//        };
//
//        button.setListener(() -> {
//            System.out.println("Click 2");
//        });
//
//        button.removeListener(() -> {
//            System.out.println("Click 2");
//        });
//
//        button.click();
//        System.out.println();
//
//
//        button.setListener(() -> {
//            System.out.println("Click 3");
//        });
//
//        button.click();
//        System.out.println();
//    }
    }
}
