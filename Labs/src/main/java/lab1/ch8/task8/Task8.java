package lab1.ch8.task8;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        System.out.print("Enter String: " );
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int l = s.length();
        for(int i=0; i < l; i++){
            for(int j = i + 1; j <= l; j++) {
                String sub = s.substring(i, j);
                System.out.println(sub);
            }
        }

    }
}
