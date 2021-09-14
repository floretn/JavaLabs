package lab2.ch11.car;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import static java.lang.System.*;
import static java.time.LocalDate.*;

public class Car {
    private int x;
    private float benz;
    private int ras;

    public Car(int ras){
        x = 0;
        benz = 0;
        this.ras = ras;
    }

    public int getX(){ return x; }

    public float getBenz(){ return benz; }

    public boolean movement(int km){
        if( Math.abs((float)km) <= (float)ras*benz){
            x += km;
            benz -= ((float)Math.abs(km))/((float)ras);
            return true;
        }else{
            return false;
        }
    }

    public void refuel(float lit){
        benz += lit;
    }

    public static void main(String[] args) throws InterruptedException {
        LocalDate date = of(2020, 4 , 1);
        out.println(date);
        int ras;
        out.println("Поехали!");
        out.print("Введите расход топлива машины: ");
        Scanner sc = new Scanner(System.in);
        ras = sc.nextInt();
        lab2.ch9.car.Car myCar = new lab2.ch9.car.Car(ras);
        while (true){
            out.printf("Выберите действие:\n1.Заправиться\n2.Проехать на машине\n3.Узнать как далеко уехали от начала\n4.Узнать сколько бензина в баке\n0.Закончить поездку\nВаш выбор: ");
            ras = sc.nextInt();
            if (ras == 1){
                out.print("Введите колличество литров бензина для заправки: ");
                int lit = sc.nextInt();
                myCar.refuel(lit);
                System.out.println("Машина успешно заправлена!");
            }

            if (ras == 2){
                boolean check;
                int km;
                out.print("Введите расстояние в километрах: ");
                km = sc.nextInt();
                check = myCar.movement(km);
                if (check == true){
                    out.println("Машина успешно проехала указанное расстояние!");
                }else{
                    out.println("Недостаточно бензина чтобы проехать указанное расстояние:(");
                }
            }

            if (ras == 3){
                out.printf("Машина в %d километрах от начала\n", myCar.getX());
            }

            if (ras == 4){
                out.printf("В баке %f литров бензина\n", myCar.getBenz());
            }

            if(ras == 0){
                out.print("Отлично прокатились!");
                break;
            }

            if(ras < 0 || ras > 4){
                out.println("Нет такого варианта!");
            }

            TimeUnit.SECONDS.sleep(1);

        }

    }
}
