package lab2.dop.dop;

import lab2.dop.circle.Circle;
import java.util.Scanner;

public class Dop {

    public static void main(String[] args) {
        System.out.print("Введите количество элементов: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Circle circle = new Circle(n);

        while (true) {
            System.out.printf("Выберите действие:\n1.Добавить в текущий элемент\n2.Вывести строку в текущем элементе\n0.Закончить\nВаш выбор: ");
            n = sc.nextInt();

            if(n == 1){
                System.out.print("Введите строку: ");
                String s;
                s = sc.next();
                String check;
                check = circle.add(s);
                if (check != null) {
                    System.out.println("Вы заменили строку " + check + " на строку" + s);
                }else{
                    System.out.println("Вы добавили строку " + s);
                }
            }

            if(n == 2){
                String s;
                s = circle.show();
                System.out.print("Ваша строка: ");
                System.out.println(s);
            }

            if (n == 0){
                System.out.println("До свидания!");
                break;
            }

        }
    }
}
