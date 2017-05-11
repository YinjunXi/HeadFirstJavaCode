package abstractClass;

/**
 * Created by yangxi on 2017/5/10.
 */
public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.calculatePrimeter();
        shape.calculateArea();

        Shape shape1 = new Rectangle();
        shape1.calculatePrimeter();
        shape1.calculateArea();


    }
}
