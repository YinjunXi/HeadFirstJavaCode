package abstractClass;

/**
 * Created by yangxi on 2017/5/10.
 */
public class Circle extends Shape {
    double r = 2;
    @Override
    public void calculateArea() {
        System.out.println("圆 面积是：" + 3.14*r*r);
    }

    @Override
    public void calculatePrimeter() {
        System.out.println("圆 周长是：" + 3.14*2*r);
    }
}
