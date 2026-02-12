package optionalClass;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        String[] str =  new String[10];
        Optional<String> check = Optional.ofNullable(str[0]);
        if (check.isEmpty()) {
            System.out.println("String is empty");
        } else {
            String lowerCaseName = str[4].toLowerCase();
            System.out.println(lowerCaseName);
        }
    }
}
