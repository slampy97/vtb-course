import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimplePhoneDictionary {
    private Map<String, List<String>> storage = new HashMap<>();

    public void add(String secondName, String phone) {
        if (storage.containsKey(secondName)) {
            storage.get(secondName).add(phone);
        } else {
            List<String> init = new ArrayList<>();
            init.add(phone);
            storage.put(secondName, init);
        }
    }

    public List<String> get(String secondName) {
        return storage.getOrDefault(secondName, new ArrayList<>());
    }
}
