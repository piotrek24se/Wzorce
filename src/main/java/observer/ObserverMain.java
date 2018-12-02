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
    }

}
