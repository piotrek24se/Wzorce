package templateMethod;

public class RectangleDraw extends AbstractDraw {

    private int width;
    private  int height;

    public RectangleDraw(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    int getWidth() {
        return this.width;
    }

    @Override
    int getHeight() {
        return this.height;
    }
}
