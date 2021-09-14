package lab8;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Task5 {

    public static Stream<String> letters(String s) {
        return IntStream.range(0, s.length()).mapToObj((i) -> s.substring(i, i + 1));
    }

    public static void main(String[] args) {
        System.out.println(letters("boat").collect(Collectors.toList()));
    }
}
