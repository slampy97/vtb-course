package org.dt.worker_vitek.unility;

public class ConsoleWriter {
    public static boolean write(Activity activity, Double activityLimit, Double activityDistance, String name) {
        if (activityLimit == 0) {
            if (activity == Activity.RUN) {
                System.out.println(name + " не может бегать");
            } else {
                System.out.println(name + " не может прыгать");
            }
            return false;
        }

        if (activityLimit < 0) {
            if (activity == Activity.RUN) {
                System.out.println(name + " пробежал " + activityDistance + "м");
            } else {
                System.out.println(name + " прыгнул на " + activityDistance + "м");
            }
            return true;
        }

        if (activityLimit < activityDistance) {
            if (activity == Activity.RUN) {
                System.out.println(name + " пробежал " + activityLimit + "м" + " и не смог бежать больше");
            } else {
                System.out.println(name + " прыгнул на  " + activityLimit + "м" + " и не смог допрыгнуть до верху");
            }
            return false;
        }
        if (activity == Activity.RUN) {
            System.out.println(name + " пробежал " + activityDistance + "м");
        } else {
            System.out.println(name + " прыгнул на " + activityDistance + "м");
        }
        return true;
    }
}
