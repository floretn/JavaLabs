package lab1.ch1.task1;

//import java.math.BigDecimal;
//import java.math.BigInteger;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args){
        /*
        System.out.print("Your number: " );
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        BigInteger a = new BigInteger(String.valueOf(number));
        System.out.println(a);
        String s = a.toString(2);
        System.out.println(s);
        s = a.toString(8);
        System.out.println(s);
        s = a.toString(16);
        System.out.println(s);
        float one = 1;
        float obrNum;
        obrNum = one / number;
        BigDecimal b = new BigDecimal(String.valueOf(obrNum));
        s = b.toString(16);
        System.out.println(s);
         */
        System.out.print("Enter number: " );
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();

        String convert = Integer.toBinaryString(number);
        System.out.println(convert);

        convert = Integer.toOctalString(number);
        System.out.println(convert);

        convert = Integer.toHexString(number);
        System.out.println(convert);

        double numberD;
        double one = 1;
        numberD = one / number;
        System.out.println(numberD);
        convert = Double.toHexString(numberD);
        System.out.println(convert);
    }
}
