package abstractClass;

/**
 * Created by yangxi on 2017/5/10.
 */
public class Rectangle extends Shape {
    double width = 4;
    @Override
    public void calculatePrimeter() {
        System.out.println("矩形 周长是：" + width*4);
    }

    @Override
    public void calculateArea() {
        System.out.println("矩形 面积是:" + width*width);
    }
}
