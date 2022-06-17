import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class genericMethod {
    public static <T> void change(T[] array, int fstIndex, int sndIndex) {
        if (fstIndex >= array.length || sndIndex >= array.length) {
            throw new IndexOutOfBoundsException("индексы должны быть меньше длины массива");
        }
        T tmp = array[fstIndex];
        array[fstIndex] = array[sndIndex];
        array[sndIndex] = tmp;
    }

    public static <T> List<T> arrayToList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }

}
