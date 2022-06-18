import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SimpleNamesCollection {
    private static final String [] PHONES = new String[] {
            "Сергей",
            "Олег",
            "Александра",
            "Алена",
            "Алина",
            "Алиса",
            "Алла",
            "Анастасия",
            "Олег",
            "Олег",
            "Анастасия",
            "Алина",
            "Александра",
            "Сергей",
            "Алла",
            "Алиса",
            "Сергей",
            "Сергей",
            "Алена",
            "Алена",
            "Алена"
    };

    public static void counter() {
        Map<String, Integer> counter = Arrays
                .stream(PHONES)
                .collect(Collectors.toMap(Function.identity(), s -> 1, Integer::sum));
        System.out.println(counter);
    }
}
