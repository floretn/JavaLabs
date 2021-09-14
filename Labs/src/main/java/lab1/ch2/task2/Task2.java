package lab1.ch2.task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Enter the angle value: " );
        Scanner sc = new Scanner(System.in);
        int angle = sc.nextInt();
        if (angle < 0){
            System.out.println("Normal angle first variant: " );
            System.out.println(360 + angle % 360);
            System.out.println("Normal angle second variant: " );
            System.out.println(360 - Math.floorMod(angle, 360));
        }else {
            System.out.println("Normal angle first variant: " );
            System.out.println(angle % 360);
            System.out.println("Normal angle second variant: " );
            System.out.println(Math.floorMod(angle, 360));
        }
    }
}
