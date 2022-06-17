import frui_part.Apple;
import frui_part.Box;
import frui_part.Orange;

import java.util.List;

public class TestMethods {

    public static void main(String[] args) {
        Integer array[] = new Integer[]{1, 2, 3, 4, 5};
        genericMethod.change(array, 1, 2);
        System.out.println(array[1]);

        List<Integer> res = genericMethod.arrayToList(array);
        System.out.println(res);

        Box<Orange> box1 = new Box<>();
        box1.addFruit(new Orange(1.5));
        box1.addFruit(new Orange(1.5));
        box1.addFruit(new Orange(1.5));
        box1.addFruit(new Orange(1.5));
        Box<Apple> box2 = new Box<>();
        box2.addFruit(new Apple(1.0));
        box2.addFruit(new Apple(1.0));
        box2.addFruit(new Apple(1.0));
        box2.addFruit(new Apple(1.0));
        box2.addFruit(new Apple(1.0));
        box2.addFruit(new Apple(1.0));
        System.out.println(box1.getWeight());
        System.out.println(box2.getWeight());
        System.out.println(box1.compare(box2));
        box2.addFruit(new Apple(1.0));
        System.out.println(box2.compare(box1));
        Box<Apple> box3 = new Box<>();
        box3.takeFruits(box2);
        System.out.println(box2.getWeight());
        System.out.println(box3.getWeight());
    }
}
