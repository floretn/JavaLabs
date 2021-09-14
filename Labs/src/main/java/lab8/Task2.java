package lab8;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task2 {

    public static void main(String[] args) {

        try (Stream<String> stream = Files.lines(Paths.get(new File("A_Farewell_to_Arms.txt").getAbsolutePath()))) {

            List<String> strings = stream.flatMap(s -> Arrays.stream(s.split("\\PL+"))).collect(Collectors.toList());

            for (int i = 0; i < 100; i++) {
                System.out.println("stream rez:");
                long rez;
                long t1 = System.currentTimeMillis();
                rez = strings.parallelStream().filter(s -> s.length() > 12).count();
                long t2 = System.currentTimeMillis();
                System.out.println(rez);
                System.out.println("stream time:");
                System.out.println(t2 - t1);

                System.out.println("parallelStream rez:");
                t1 = System.currentTimeMillis();
                rez = strings.parallelStream().filter(s -> s.length() > 12).count();
                t2 = System.currentTimeMillis();
                System.out.println(rez);
                System.out.println("parallelStream time:");
                System.out.println(t2 - t1);

                System.out.println("stream rez:");
                t1 = System.nanoTime();
                rez = strings.parallelStream().filter(s -> s.length() > 12).count();
                t2 = System.nanoTime();
                System.out.println(rez);
                System.out.println("stream nano time:");
                System.out.println(t2 - t1);

                System.out.println("parallelStream rez:");
                t1 = System.nanoTime();
                rez = strings.parallelStream().filter(s -> s.length() > 12).count();
                t2 = System.nanoTime();
                System.out.println(rez);
                System.out.println("parallelStream nano time:");
                System.out.println(t2 - t1);
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
