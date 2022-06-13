package dt.worker.vitek.programStart;

import dt.worker.vitek.Animal;
import dt.worker.vitek.Dog;
import dt.worker.vitek.HomeCat;
import dt.worker.vitek.Tiger;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;


public class Task1 {
    public static void main(String[] arg) {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("бобик");
        animals[1] = new HomeCat("кися");
        animals[2] = new Tiger("тигр петрович");

        for (Animal animal : animals) {
            animal.run(50);
            animal.swim(50);
        }
        System.out.println(counter(animals));
    }

    public static  Map<String, Long> counter(Animal[] animals) {
        return Arrays.stream(animals)
                .map(Animal::getClass)
                .collect(Collectors.groupingBy(Class::getSimpleName, Collectors.counting()));
    }
}
