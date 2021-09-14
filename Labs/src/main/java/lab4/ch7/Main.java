package lab4.ch7;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        int i = rnd.nextInt(5);
        Colors color = Colors.values()[i];
        System.out.println(color);
        System.out.println(color.getRed());
        System.out.println(color.getGreen());
        System.out.println(color.getBlue());
    }
}
