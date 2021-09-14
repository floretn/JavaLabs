package lab1.ch11.task11;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        System.out.println("Enter string:");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] symArray = s.toCharArray();
        int number = s.length();
        for(int i = 0; i < number; i++){
            int ascii = (int) symArray[i];
            if ( ascii > 255) {
                System.out.printf("Number %d:\n", i);
                System.out.println(symArray[i]);
                int codePoint = s.codePointAt(s.offsetByCodePoints(0, i));
                System.out.println(codePoint);
            }
        }
    }
}
