package extend;

/**
 * Created by yangxi on 2017/5/10.
 */
public class DogTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
//        dog.name = "xiaobai";
//        dog.age = 18;
        Dog dog1 = new Dog();
        if (dog.equals(dog1)) {
            System.out.println("相等");
        }else {
            System.out.println("不相等");
        }
        dog.eat();
        System.out.println(dog);

    }
}
