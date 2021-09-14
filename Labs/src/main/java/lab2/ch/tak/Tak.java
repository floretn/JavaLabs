package lab2.ch.tak;

public class Tak {
    public static void ch(boolean i){
        i = true;
    }

    public static void main(String[] args) {

        boolean i1 = false;
        ch(i1);
        System.out.println(i1);

        int i = 1;
        int j = i;
        i++;
        System.out.println(i);
        System.out.println(j);





    }
}
