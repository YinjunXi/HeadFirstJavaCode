package extend;

/**
 * Created by yangxi on 2017/5/10.
 */
public class Dog extends Animal {
    @Override
    public void eat() {
        super.eat();
        System.out.println("狗狗是要吃骨头的！");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return  true;
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;
        Dog dog = (Dog) obj;
        if (dog.age == this.age && dog.name == this.name)
            return true;
        return false;
    }
}
