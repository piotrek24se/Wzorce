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

}
