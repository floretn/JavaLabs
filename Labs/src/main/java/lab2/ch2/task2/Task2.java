package lab2.ch2.task2;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("About the method nextInt from the class Scanner");
        Scanner in = new Scanner(System.in);
        Scanner in1 = new Scanner(System.in);
        System.out.print("Введите число: ");
        int var1 = in.nextInt();
        System.out.println(in);

        System.out.println("About the method nextInt from the class Random");
        Random random = new Random();
        int i = random.nextInt(100);
        System.out.println(random);

    }
}
