package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(101, "Dhoni");
        map.put(102, "Virat");
        map.put(103, "Rohit");
        map.put(104, "Jadeja");
        map.put(105, "Bumrah");
        map.put(102, "David");  // This will check for existing keys, and overwrites this value over the previous value
        System.out.println(map);
    }
}
