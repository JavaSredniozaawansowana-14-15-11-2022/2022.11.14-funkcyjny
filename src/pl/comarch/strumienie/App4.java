package pl.comarch.strumienie;

import java.util.*;

public class App4 {
    public static void main(String[] args) {
        List<Integer> collect = new Random()
                .ints(0, 100)
                .limit(1000)
                .boxed().toList();

        OptionalDouble average = new Random()
                .ints(0, 100)
                .limit(1000)
                .average();

        System.out.println(average.getAsDouble());

        List<String> list = new ArrayList<>();
        list.add("asdfkajhsdgk");
        list.add("tryjrtyj");
        list.add("rtdfgdf");
        list.add("rethefdghsd");

        OptionalDouble average1 = list.stream()
                .mapToInt(String::length)
                .average();

        System.out.println(average1);

        String s = "abcd";
        String s2 = s.replaceAll("c", "");
        System.out.println(s2);
    }
}
