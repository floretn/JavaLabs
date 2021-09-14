package lab7.task11;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Task11 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("file.txt")); //TODO Был перенесён в ресурсы, надо изменить, чтобы работало
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(sc.nextLine().split(" ")));
        Collections.shuffle(arrayList.subList(1, arrayList.size() - 1));
        System.out.println(arrayList);
    }
}
