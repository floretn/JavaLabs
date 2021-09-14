package lab2.ch10.task10;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import lab2.ch10.random.RandomNumbers;

public class Task10 {
    public static void main(String[] args) {

        //Метод из учебника
        Random gen = new Random();
        int x = RandomNumbers.nextInt(gen, 5, 73);
        System.out.println(x);

        //Метод для массива
        System.out.print("Введите длину массива: ");
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int a[];
        a = new int[len];
        for(int i = 0; i < len; i++){
            System.out.print("Введите число: ");
            a[i] = sc.nextInt();
        }
        x = RandomNumbers.randomElement(gen, a);
        System.out.println(x);

        //Метод для динамического массива
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.print("Введите длину для ArrayList: ");
        len = sc.nextInt();
        for (int i = 0; i < len; i++){
            System.out.print("Введите число: ");
            int b = sc.nextInt();
            list.add(b);
        }
        x = RandomNumbers.randomElement(gen, list);
        System.out.println(x);
    }
}
