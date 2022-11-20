package pl.comarch.funkcyjny;

import java.util.function.*;

public class App {
    public static void main(String[] args) {
        Function<Integer, String> funkcja = new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                return integer+"";
            }
        };

        String s1 = funkcja.apply(5);
        System.out.println(s1);

        String s2 = funkcja.apply(10);
        System.out.println(s2);

        Function<Integer, String> sposob1 = x -> x+"";

        Function<Integer, String> sposob2 = new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                return integer+"2";
            }
        };

        BiFunction<Double, Double, String> biFunkcja;
        biFunkcja = new BiFunction<Double, Double, String>() {
            @Override
            public String apply(Double aDouble, Double aDouble2) {
                return (aDouble + aDouble2) + "";
            }
        };

        BiFunction<Double, Double, String> biFunkcja2 = (x, y) -> x+y+"";
        biFunkcja2.apply(4.4, 7.7);

        System.out.println(biFunkcja.apply(3.3, 6.7));
        System.out.println(biFunction(3.3, 6.7));

        UnaryOperator<Integer> unaryOperator = new UnaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer + 20;
            }
        };

        UnaryOperator<Integer> unaryOperator2 = x -> x + 20;

        System.out.println(unaryOperator.apply(20));

        Predicate<Double> predicate = new Predicate<Double>() {
            @Override
            public boolean test(Double aDouble) {
                return aDouble > 5.5;
            }
        };
        Predicate<Double> predicate2 = x -> x > 5.5;

        System.out.println(predicate.test(6.6));
        System.out.println(predicate.test(5.3));
        System.out.println(predicate.test(99.0));

        Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                return "default";
            }
        };

        Supplier<String> supplier2 = () -> "default";
        Supplier<String> supplier3 = () -> {
            int a = 5;
            int b = 7;
            if(a+b > 8) {
                return "abc";
            }
            return "def";
        };
        System.out.println("------------------");
        System.out.println(supplier3.get());
        System.out.println("------------------");

        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());

        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        consumer.accept("abc");
        consumer.accept("cos");
        consumer.accept(supplier.get());

        Consumer<String> consumer2 = x -> System.out.println(x);
    }

    public static void jakas(int a, Function f) {
        f.apply(a);
    }

    public static String biFunction(Double a, Double b) {
        return (a + b) + "";
    }
}
