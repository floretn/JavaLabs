package lab8;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task10 {

    public static List<String> method(Stream<String> stream) {
        int[] len = {0};
        return stream.sorted((s1, s2) -> -(s1.length() - s2.length())).filter(s -> {
            if (s.length() > len[0]) {
                len[0] = s.length();
            }
            return s.length() == len[0];
        }).collect(Collectors.toList());
    }

    public static void main(String[] args) throws IOException {
        System.out.println(method(Files.lines(Paths.get((new File("file.txt")).getAbsolutePath())).
                flatMap(s -> Stream.of(s.split(" ")))));
    }
}
