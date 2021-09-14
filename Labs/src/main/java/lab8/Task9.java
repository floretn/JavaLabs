package lab8;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task9 {

    public static double method(Stream<String> stream) {
        return stream.collect(Collectors.summarizingInt(String::length)).getAverage();
    }

    public static void main(String[] args) throws IOException {
        System.out.println(method(Files.lines(Paths.get((new File("file.txt")).getAbsolutePath())).
                flatMap(s -> Stream.of(s.split(" ")))));
    }
}
