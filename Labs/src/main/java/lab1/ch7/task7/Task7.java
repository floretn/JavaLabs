package lab1.ch7.task7;

import java.util.Scanner;

public class Task7 {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        short var1 = (short) in.nextInt();
        System.out.print("Введите второе число: ");
        short var2 = (short) in.nextInt();
        System.out.printf("Первое число: %10d\n", (0x0000FFFF & var1));
        System.out.printf("Второе число: %10d\n", (0x0000FFFF & var2));
        short sum = (short) ((0x0000FFFF & var1)  + (0x0000FFFF & var2));
        System.out.printf("Сумма чисел: %10d\n", (0x0000FFFF & var1) + (0x0000FFFF & var2));
        short diff = (short) ((0x0000FFFF & var1) - (0x0000FFFF & var2));
        System.out.printf("Разность чисел: %10d\n", (0x0000FFFF & var1) - (0x0000FFFF & var2));
        short mult = (short) ((0x0000FFFF & var1) * (0x0000FFFF & var2));
        System.out.printf("Произведение чисел: %10d\n", (0x0000FFFF & var1) * (0x0000FFFF & var2));
        short div = (short) ((0x0000FFFF & var1) / (0x0000FFFF & var2));
        System.out.printf("Частное чисел: %10d\n",  (0x0000FFFF & var1) / (0x0000FFFF & var2));
        short rem = (short) ((0x0000FFFF & var1) % (0x0000FFFF & var2));
        System.out.printf("Остаток от деления: %10d\n", (0x0000FFFF & var1) % (0x0000FFFF & var2));

    }
}
