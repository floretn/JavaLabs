package lab2.ch17.task17;

import ch17.queue.Queue;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Task17 {
    public static void main(String[] args) throws InterruptedException {
        Queue a = new Queue();
        int n;
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.printf("Выберите действие:\n1.Добавить строку\n2.Удалить строку\n3.Вывести все строки\n0.Закончить\nВаш выбор: ");
            n = sc.nextInt();

            if(n == 1){
                System.out.print("Введите строку: ");
                String s;
                s = sc.next();
                a.add(s);
            }

            if(n == 2){
                boolean check;
                check = a.remove();
                if (check == true) {
                    System.out.println("Строка успешно удалена!");
                }else{
                    System.out.println("У вас пока нет ни одной строки:(");
                }
            }

            if(n == 3){
                boolean check;
                check = a.show();
                if (check == false) {
                    System.out.println("У вас пока нет ни одной строки:(");
                }
            }

            if(n == 0){
                System.out.println("До свидания!");
                break;
            }

            if(n < 0 || n > 3){
                System.out.println("Нет такого варианта!");
            }

            TimeUnit.SECONDS.sleep(1);
        }
    }
}
