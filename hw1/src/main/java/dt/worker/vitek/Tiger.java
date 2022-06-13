package dt.worker.vitek;

public class Tiger extends Catlike{

    public Tiger(String name) {
        this.name = name;
    }

    @Override
    protected int runLimit() {
        return 2000;
    }

    @Override
    protected int swimLimit() {
        return 100;
    }
}
