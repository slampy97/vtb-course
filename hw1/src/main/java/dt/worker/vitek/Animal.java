package dt.worker.vitek;

abstract public class Animal {
    protected String name;

    /*
     * if runDistance < 0 than no limit, 0 -> can not do it, otherwise it is max distance to run
     */
    public void run(int runDistance) {
        int limit = runLimit();
        if (runDistance <= limit || limit == -1) {
            System.out.println(getName() + " пробежал " + runDistance + "м");
        } else if (limit == 0) {
            System.out.println(getName() + " не умеет бегать");
        } else {
            System.out.println(getName() + " пробежал " + limit + " и устал(");
        }
    }

    /*
     * if swimDistance < 0 than no limit, 0 -> can not do it, otherwise it is max distance to swim
     */
    public void swim(int swimDistance) {
        int limit = swimLimit();
        if (swimDistance < limit || limit == -1) {
            System.out.println(getName() + " проплыл " + swimDistance + "м");
        } else if (limit == 0) {
            System.out.println(getName() + " не умеет плыть");
        } else {
            System.out.println(getName() + " проплыл " + limit + " и утонул(");
        }
    }

    abstract protected int runLimit();
    abstract protected int swimLimit();

    protected String getName() {
        return name;
    }

}
