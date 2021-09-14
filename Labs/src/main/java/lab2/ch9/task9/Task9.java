package lab2.ch9.task9;

import lab2.ch9.car.Car;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Task9 {
    public static void main(String[] args) throws InterruptedException {
        int ras;
        System.out.println("Поехали!");
        System.out.print("Введите расход топлива машины: ");
        Scanner sc = new Scanner(System.in);
        ras = sc.nextInt();
        Car myCar = new Car(ras);
        while (true){
            System.out.printf("Выберите действие:\n1.Заправиться\n2.Проехать на машине\n3.Узнать как далеко уехали от начала\n4.Узнать сколько бензина в баке\n0.Закончить поездку\nВаш выбор: ");
            ras = sc.nextInt();
            if (ras == 1){
                System.out.print("Введите колличество литров бензина для заправки: ");
                int lit = sc.nextInt();
                myCar.refuel(lit);
                System.out.println("Машина успешно заправлена!");
            }

            if (ras == 2){
                boolean check;
                int km;
                System.out.print("Введите расстояние в километрах: ");
                km = sc.nextInt();
                check = myCar.movement(km);
                if (check == true){
                    System.out.println("Машина успешно проехала указанное расстояние!");
                }else{
                    System.out.println("Недостаточно бензина чтобы проехать указанное расстояние:(");
                }
            }

            if (ras == 3){
                System.out.printf("Машина в %d километрах от начала\n", myCar.getX());
            }

            if (ras == 4){
                System.out.printf("В баке %f литров бензина\n", myCar.getBenz());
            }

            if(ras == 0){
                System.out.print("Отлично прокатились!");
                break;
            }

            if(ras < 0 || ras > 4){
                System.out.println("Нет такого варианта!");
            }

            TimeUnit.SECONDS.sleep(1);

        }

    }
}
