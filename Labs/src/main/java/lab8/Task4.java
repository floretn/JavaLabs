package lab8;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task4 {

    public static Stream<Long> method(long x0, long a, long c, long m) {
        return Stream.iterate(x0, n -> (n*a + c) % m);
    }

    public static void main(String[] args) {
        System.out.println(method(0, 25214903917L, 11, (long) Math.pow(2, 48)).limit(10).collect(Collectors.toList()));
    }
}
