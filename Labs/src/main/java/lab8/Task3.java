package lab8;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Task3 {

    public static void main(String[] args) {
        int[] values = {1, 4, 9, 16};
        Stream<?> stream = Stream.of(values);
        System.out.println(stream.collect(Collectors.toList())); // Получается поток из полученного массива int[]

        Integer[] val = {1, 4, 9, 16};
        stream = Stream.of(val);
        System.out.println(stream.collect(Collectors.toList()));

        stream = Stream.of(1, 4, 9, 16);
        System.out.println(stream.collect(Collectors.toList()));

        IntStream intStream = IntStream.of(values);
        System.out.println(intStream.boxed().collect(Collectors.toList()));

        intStream = Arrays.stream(values);
        System.out.println(intStream.boxed().collect(Collectors.toList()));
    }
}
