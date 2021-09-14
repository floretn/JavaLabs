package lab2.ch6.task6;

import lab2.ch6.point.Point;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        int com;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.printf("Выберите действие:\n1.Создать точку в начале координат\n2.Создать точку с вашими координатами\n0.Закончить\nВаш выбор: ");
            com = sc.nextInt();
            Point a = new Point();

            if (com == 1){
                System.out.printf("Ваша точка: (%f, %f)\n", a.getX(), a.getY());
            }

            if (com == 2){
                System.out.print("Введите два числа: ");
                float x = sc.nextFloat();
                float y = sc.nextFloat();
                a = new Point(x, y);
                System.out.printf("Ваша точка: (%f, %f)\n", a.getX(), a.getY());
            }
            if (com == 0){
                System.out.print("Досвидания!");
                break;
            }

            if (com < 0 || com > 2){
                System.out.println("Нет такого варианта!");
            }else {

                System.out.printf("Выберите действие:\n1.Сместить точку\n2.Масштабировать\n3.Сместить точку и масштабировать\n4.Масштабировать и сместить точку\nВаш выбор: ");
                com = sc.nextInt();

                if (com == 1) {
                    System.out.print("Введите два числа: ");
                    float x = sc.nextFloat();
                    float y = sc.nextFloat();
                    a.translate(x, y);
                    System.out.printf("Ваша точка: (%f, %f)\n", a.getX(), a.getY());
                }

                if (com == 2) {
                    System.out.print("Введите число: ");
                    float c = sc.nextFloat();
                    a.scale(c);
                    System.out.printf("Ваша точка: (%f, %f)\n", a.getX(), a.getY());
                }

                if (com == 3) {
                    System.out.print("Введите координаты и число масштабируемости: ");
                    float x1;
                    float y1;
                    float c1;
                    x1 = sc.nextFloat();
                    y1 = sc.nextFloat();
                    c1 = sc.nextFloat();
                    a.translate(x1, y1);
                    a.scale(c1);
                    System.out.printf("Ваша точка: (%f, %f)\n", a.getX(), a.getY());
                }

                if (com == 4) {
                    System.out.print("Введите координаты и число масштабируемости: ");
                    float x2;
                    float y2;
                    float c2;
                    x2 = sc.nextFloat();
                    y2 = sc.nextFloat();
                    c2 = sc.nextFloat();
                    a.scale(c2);
                    a.translate(x2, y2);
                    System.out.printf("Ваша точка: (%f, %f)\n", a.getX(), a.getY());
                }

                if (com < 1 || com > 3) {
                    System.out.println("Нет такого варианта:((");
                }
            }

        }

    }
}