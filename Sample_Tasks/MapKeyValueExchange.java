package Sample_Tasks;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

// Using Streams
public class MapKeyValueExchange {

    public static void main(String[] args) {
        HashMap<Integer, String> keymap = new HashMap<>();
        keymap.put(1, "Maha");
        keymap.put(2, "Mohan");
        keymap.put(3, "Raj");

        for (Map.Entry<Integer, String> hm : keymap.entrySet()) {
            System.out.println(hm.getKey() + "      " + hm.getValue());
        }
        System.out.println();

        // Using streams exchange keys with values & vice versa
        Map<String, Integer> valuemap = keymap.entrySet()
                .stream()
                .collect(Collectors.toMap(entry -> (String) entry.getValue(),
                        entry -> (Integer) entry.getKey()));

        for (Map.Entry<String, Integer> hm : valuemap.entrySet()) {
            System.out.println(hm.getKey() + "      " + hm.getValue());
        }
    }
}
