package qsh.learning.javaBeginner.primeNumber;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeNumber {

    public static void main(String[] args) {
        Stream.iterate(2, i -> i + 1)
                .filter(i -> IntStream.range(2, i).noneMatch(n -> i % n == 0))
                .limit(100)
                .forEach(System.out::println);
    }
}
