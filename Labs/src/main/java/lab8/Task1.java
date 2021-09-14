package lab8;

import java.io.File;
import java.io.IOException;
import java.util.stream.Stream;

/**
 * TODO Не понял задания
 */

public class Task1 {

    public static String[] method(Stream<String> stream, String lastWord) {
        String[] strings = new String[5];
        for (int i = 0; i < 5; i++) {
            //strings[i] = stream.max()

        }
        return null;
    }

    public static void main(String[] args) throws IOException {
        File file = new File(System.getProperty("user.home") + "\\Downloads\\Picture_With_IMOEX_Data8530620134787174641.xlsx");
        boolean check = file.renameTo(new File(System.getProperty("user.home") + "\\Downloads\\Picture_With_IMOEX_Data.xlsx"));
        System.out.println(check);
        System.out.println(file.getName());
    }
}
