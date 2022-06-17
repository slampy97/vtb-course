package frui_part;

abstract public class Fruit {
    private final Double weight;

    public Fruit(Double weight) {
        this.weight = weight;
    }

    public Double getWeight() {
        return weight;
    }
}
