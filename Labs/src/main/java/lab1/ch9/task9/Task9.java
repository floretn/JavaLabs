package lab1.ch9.task9;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        System.out.println("Enter name Ivan, please:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        sc.close();
        System.out.println("When ==");
        boolean a;
        String name1 = "Ivan";
        if (name == name1) {
            a = true;
        } else {
            a = false;
        }
        System.out.println("Your Ivan = Our Ivan?");
        System.out.println(a);
        System.out.println("When equals:");
        a = name.equals(name1);
        System.out.println("Your Ivan = Our Ivan?");
        System.out.println(a);
    }
}
