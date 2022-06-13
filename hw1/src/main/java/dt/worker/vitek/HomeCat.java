package dt.worker.vitek;

public class HomeCat extends Catlike{

    public HomeCat(String name) {
        this.name = name;
    }

    @Override
    protected int runLimit() {
        return 200;
    }

    @Override
    protected int swimLimit() {
        return 0;
    }
}
