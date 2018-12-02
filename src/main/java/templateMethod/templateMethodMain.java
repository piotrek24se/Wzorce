package templateMethod;

public class templateMethodMain {

    public static void main(String[] args) {

        AbstractDraw rectangleDraw = new RectangleDraw(5,8);
        AbstractDraw squareDraw = new SquareDraw(5);

        rectangleDraw.draw();
        System.out.println("---------------------");
        squareDraw.draw();

    }

}
