package Collections;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        // More Write operations
        Set<String> set1 = new HashSet();
        set1.add("Dhoni");
        set1.add("Virat");
        set1.add("Rohit");
        set1.add("Jadeja");
        set1.add("Bumrah");
        set1.add("David");

        // More Read or Equal (Read and Write) operations
        Set<String> set2 = new TreeSet();
        set2.add("Dhoni");
        set2.add("Virat");
        set2.add("Rohit");
        set2.add("Jadeja");
        set2.add("Bumrah");
        set2.add("David");

        System.out.println(set1.toString());
        System.out.println(set2.toString());
    }
}
