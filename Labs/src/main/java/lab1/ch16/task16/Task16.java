package lab1.ch16.task16;

import java.util.Scanner;

public class Task16 {

    public static double average (double one, double... other) {

        double sum = one;
        for (double v : other) {
            sum += v;
        }
        //return other.length == 0 ? sum : sum / (other.length + 1);
        return sum / (other.length + 1);
    }

    public static void main (String[] args) {

        System.out.println("Один элемент:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число ");
        int n = sc.nextInt();
        double avg = average(n);
        System.out.println(avg);

        System.out.println("Пять элементов:");
        System.out.println("Один элемент");
        System.out.println("Введите пять чисел ");
        n = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();
        avg = average(n, n1, n2, n3, n4);
        System.out.println(avg);

        System.out.println("Для моих элементов: 4.5, 3.14, 56.82:");
        avg = average(4.5, 3.14, 56.82);
        System.out.println(avg);
    }

}
