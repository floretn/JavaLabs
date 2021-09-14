package lab2.ch4.task4;

import org.omg.CORBA.IntHolder;
import org.omg.CORBA.portable.OutputStream;

public class Task4 {

    public static void smena(IntHolder a1, IntHolder a2) {
        int e = a1.value;
        a1.value = a2.value;
        a2.value = e;
    }

    public static void main(String[] args) {
        IntHolder a1 = new IntHolder(2);
        IntHolder a2 = new IntHolder(3);
        System.out.print("До метода смены a1: ");
        System.out.println(a1.value);
        System.out.print("По ссыке: ");
        System.out.println(a1);
        System.out.print("После метода смены a2: ");
        System.out.println(a2.value);
        System.out.print("По ссыке: ");
        System.out.println(a2);
        smena(a1, a2);
        System.out.print("После метода смены a1: ");
        System.out.println(a1.value);
        System.out.print("По ссыке: ");
        System.out.println(a1);
        System.out.print("После метода смены a2: ");
        System.out.println(a2.value);
        System.out.print("По ссыке: ");
        System.out.println(a2);
    }

}
