package lab1.chdop.taskdop;

import java.util.Scanner;

public class TaskDop {

    public static int max2(int[] a){
        int max1;
        int max2;
        int j;
        if(a[0] > a[1]){
            max1 = a[0];
            max2 = a[1];
            j = 0;
        }else{
            max1 = a[1];
            max2 = a[0];
            j = 1;
        }
        for(int i = 2; i < a.length; i++){

            if(a[i] >= max1){
                max2 = max1;
                max1 = a[i];
            }
        }
        return max2;
    }

    public static void zap(int[] a){

        for(int i = 0; i < a.length; i++){
            System.out.print("Enter new element: ");
            Scanner sc = new Scanner(System.in);
            int prom = sc.nextInt();
            a[i] = prom;
        }

    }

    public static void main(String[] args) {
        System.out.print("Enter number of element: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] mas = new int[n];
        zap(mas);
        System.out.print("Your array: ");
        for(int i = 0; i < n - 1; i++) {
            System.out.printf("%d, ", mas[i]);
        }
        System.out.printf("%d", mas[n-1]);
        System.out.println();
        int maxTwo = max2(mas);
        System.out.printf("Second max value: %d", maxTwo);
    }

}
