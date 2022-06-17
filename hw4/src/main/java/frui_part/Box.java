package frui_part;

import java.util.ArrayList;
import java.util.List;


public class Box<T extends Fruit> {
    private final Double precision = 0.000001;
    private final List<T> capacity = new ArrayList<>();


    public void addFruit(T el) {
        capacity.add(el);
    }

    public Double getWeight() {
        return capacity.stream().map(Fruit::getWeight).reduce(Double::sum).orElse(0.0);
    }

    public <Z extends Fruit> Boolean compare(Box<Z> anotherBox) {
        return getWeight() - anotherBox.getWeight() < precision;
    }

    private List<T> getCapacity() {
        return capacity;
    }

    private void clean() {
        capacity.clear();
    }

    public void takeFruits(Box<T> anotherBox) {
        capacity.addAll(anotherBox.getCapacity());
        anotherBox.clean();
    }
}
