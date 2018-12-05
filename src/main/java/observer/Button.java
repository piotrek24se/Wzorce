package observer;

public class Button {

    private OnClickListener listener;

    public void setListener(OnClickListener listener) {
        this.listener = listener;
    }

    public void removeListener() {
        this.listener = null;
    }

    public void click() {
        if(listener != null)
        listener.onClick();
    }

    // wersja z lista dla >1 sluchacza

//    private List<OnClickListener> listeners = new LinkedList<>();
//
//    public void setListener(OnClickListener listener) {
//        this.listeners.add(listener);
//    }
//
//    public void removeListener(OnClickListener listener) {
//        this.listeners.remove(listener);
//    }
//
//    public void click() {
//        for (OnClickListener listener : listeners) {
//            listener.onClick();
//        }
//    }

}
