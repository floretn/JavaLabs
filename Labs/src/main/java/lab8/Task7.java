package lab8;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task7 {

    public static Stream<String> firstHundredOfWords(String path) throws IOException {
        return Files.lines(Paths.get(new File(path).getAbsolutePath())).
                flatMap(s -> Stream.of(s.split(" "))).filter(Task6::consistsOnlyOfLetters).limit(100);
    }

    public static List<String> listOfFrequentWords(String path) throws IOException {
        return Files.lines(Paths.get(new File(path).getAbsolutePath())).
                         flatMap(s -> Stream.of(s.split("\\PL+"))).filter(Task6::consistsOnlyOfLetters).
                         collect(Collectors.toMap(String::toString, s -> 1, Integer::sum)).entrySet().stream().
                        sorted((entry1, entry2) -> -(entry1.getValue().compareTo(entry2.getValue())))
                        .limit(10).collect(Collectors.toList()).stream().
                        flatMap(entry -> Stream.of(entry.getKey())).collect(Collectors.toList());
    }

    public static void main(String[] args) throws IOException {
        System.out.println(firstHundredOfWords("A_Farewell_to_Arms.txt").collect(Collectors.toList()));
        System.out.println(listOfFrequentWords("A_Farewell_to_Arms.txt"));
    }
}
