package org.dt.worker_vitek;

import org.dt.worker_vitek.unility.Activity;
import org.dt.worker_vitek.unility.ConsoleWriter;

public class Cat implements RunCreature, JumpCreature {
    private final String name;
    private final Double runLimit;
    private final Double jumpLimit;

    public Cat(String name, Double runLimit, Double jumpLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    @Override
    public boolean run(Double distance) {
        return ConsoleWriter.write(Activity.RUN, runLimit, distance, name);
    }

    @Override
    public boolean jump(Double distance) {
        return ConsoleWriter.write(Activity.JUMP, jumpLimit, distance, name);
    }
}
