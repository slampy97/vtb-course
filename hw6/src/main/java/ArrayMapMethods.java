import java.util.Arrays;

public class ArrayMapMethods {
    static final int SIZE = 10_000_000;
    static final int HALF = SIZE / 2;

    public static void main(String[] args) {
        ArrayMapMethods arrayMapMethods = new ArrayMapMethods();
        arrayMapMethods.simpleForTransform();
    }

    public void simpleForTransform() {
        float[] newArray = new float[SIZE];
        Arrays.fill(newArray, 1);
        long initialTimestamp = System.currentTimeMillis();
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = (float) (newArray[i] * Math.sin(0.2f + i * 1.0 / 5) * Math.cos(0.2f + i * 1.0 / 5) *
                    Math.cos(0.4f + i * 1.0 / 2));
        }
        System.out.println(System.currentTimeMillis() - initialTimestamp);
    }

    public void threadArrayTransform() {
        float[] newArray = new float[SIZE];
        Arrays.fill(newArray, 1);
        float[] fstPart = new float[HALF];
        float[] sndPart = new float[HALF];
        System.arraycopy(newArray, 0, fstPart, 0, HALF);
        System.arraycopy(newArray, HALF, sndPart,0, HALF);
        Runnable fstTask = makeThreadCalculation(fstPart);
        Runnable sndTask = makeThreadCalculation(sndPart);
        fstTask.run();
        sndTask.run();

    }

    public static Runnable makeThreadCalculation(float[] array) {
        return () -> {
            for (int i = 0; i < array.length; i++) {
                array[i] = (float) (array[i] * Math.sin(0.2f + i * 1.0 / 5) * Math.cos(0.2f + i * 1.0 / 5) *
                        Math.cos(0.4f + i * 1.0 / 2));
            }
        };
    }


}
