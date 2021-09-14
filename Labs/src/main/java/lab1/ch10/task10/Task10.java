package lab1.ch10.task10;

import java.math.BigInteger;
import java.util.Random;

public class Task10 {
    public static void main(String[] args) {
        Random generator = new Random();
        //long max = Long.MAX_VALUE;
        long number = generator.nextLong();
        System.out.println(number);
        BigInteger a = new BigInteger(String.valueOf(number));
        String convert = a.toString(36);
        System.out.print(convert);
    }
}
