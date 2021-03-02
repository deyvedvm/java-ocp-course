package dev.deyve.ocp;

import java.util.function.BiPredicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class CertificationTests {

    public static void main(String[] args) {

        UnaryOperator<Integer> modTen = x -> x % 10;
        System.out.println(modTen.apply(15));

        Supplier<String> hello = () -> "Hello";
        System.out.println(hello.get());

//        BiPredicate<Integer, Integer> func = (x, y) -> x.equals(y);
        BiPredicate<Integer, Integer> func = Integer::equals;
        System.out.println(func.test(5, 10));
    }
}
