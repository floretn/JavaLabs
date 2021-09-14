package lab1.ch3.task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.print("Enter the tree value: " );
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();
        sc.close();
        System.out.print("The first method: " );
        if (a1 > a2 && a1 > a3) {
            System.out.print(a1);
        } else if (a2 > a3) {
            System.out.println(a2);
        } else {
            System.out.println(a3);
        }

        System.out.print("The second method: " );
        int a4 = Math.max(a1, a2);
        System.out.println(Math.max(a3, a4));

    }
}
