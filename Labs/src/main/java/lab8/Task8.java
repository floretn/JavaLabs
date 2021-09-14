package lab8;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task8 {

    private static final char[] vowelLetters = {'a', 'e', 'i', 'o', 'u', 'y'};

    public static List<String> method(Stream<String> stream) {
        return stream.filter(s -> {
            int num = 0;
            char[] yet = new char[5];
            for (char c : s.toCharArray()) {
                for (char vl : vowelLetters) {
                    if (vl == c) {
                        for (char yt : yet) {
                            if (yt == c) {
                                num--;
                                break;
                            }
                        }
                        yet[num] = c;
                        num++;
                    }
                    if (num == 5) {
                        return true;
                    }
                }
            }
            return false;
        }).collect(Collectors.toList());
    }

    public static void main(String[] args) throws IOException {
        System.out.println(method(Files.lines(Paths.get((new File("file.txt")).getAbsolutePath())).
                flatMap(s -> Stream.of(s.split(" ")))));
    }
}
