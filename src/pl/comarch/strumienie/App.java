package pl.comarch.strumienie;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);

        /*for(int i : list) {
            System.out.println(i);
        }*/

        Integer reduce = list.stream()
                .filter(x -> x > 4)
                .filter(x -> x < 8)
                .map(x -> x + " jest fajnie !!")
                .peek(System.out::println)
                .map(String::length)
                .reduce(0, Integer::sum);

        System.out.println(reduce);

        //add(3,6);
    }

    public static void add(int x) {
        System.out.println(x);
    }
}
