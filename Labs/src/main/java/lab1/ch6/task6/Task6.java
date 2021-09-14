package lab1.ch6.task6;

import java.math.BigInteger;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.print("Enter N: " );
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        BigInteger fac = new BigInteger(String.valueOf(n));

        for(int i = 2; i < n; ++i) {
            fac = fac.multiply(BigInteger.valueOf(i));
        }
        System.out.println(fac);
    }
}
