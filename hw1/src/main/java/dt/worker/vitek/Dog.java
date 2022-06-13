package dt.worker.vitek;

public class Dog extends Animal{

    public Dog(String name) {
        this.name = name;
    }

    @Override
    protected int runLimit() {
        return 500;
    }

    @Override
    protected int swimLimit() {
        return 10;
    }
}
