package src.br.com.basic;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("John");
        names.add("Mary");

        names.forEach(System.out::println);

        names.forEach(name -> System.out.println("using forEach with lambda: " + name));

        for (String name : names) {
            System.out.println("using for: " + name);
        }

        for (int i = 0; i < names.size(); i++) {
            System.out.println("using classical for: " + names.get(i));
        }
    }
}
