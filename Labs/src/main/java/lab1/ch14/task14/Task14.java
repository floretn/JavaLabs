package lab1.ch14.task14;

import java.util.Scanner;

public class Task14{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String str = "";
        System.out.print("Введите строку: ");
        str = sc.nextLine();
        String[] strArr1 = str.split(" ");
        int len = strArr1.length;
        int[][] square = new int[len][];
        square[0] = new int [len];
        for (int i = 0; i < len; i++) {
            square[0][i] = Integer.parseInt(strArr1[i]);
        }

        int j = 0;
        while (true){
            j++;
            if (j < len) {
                System.out.print("Введите строку: ");
                str = sc.nextLine();
                if (str.compareTo("") == 0) {
                    break;
                }
                String[] strArr = str.split(" ");
                square[j] = new int[strArr.length];
                for (int i = 0; i < strArr.length; i++) {
                    square[j][i] = Integer.parseInt(strArr[i]);
                }
            } else{
                System.out.print("Введите строку: ");
                str = sc.nextLine();
                if (str.compareTo("") == 0) {
                    break;
                }
            }
        }

        /*
        for(j = 0; j < len; j++) {
            for (int i = 0; i < square[j].length; i++) {
                System.out.print(" " + square[j][i]);
            }
            System.out.println();
            }
         */
        int count = j;
        int csum = 0;
        int sum = 0;
//проверяем квадратность
        if(count != len) {
            System.out.println("Not magic square");
            sum = 0;
        } else {
            for (int i = 0; i < count; i++) {
                if (count != square[i].length) {
                    System.out.println("Not magic square");
                    sum = 0;
                    break;
                } else {
                    sum++;
                }
            }
        }


//проверяем магичность
        exit1: {
            if (sum > 0){
                for (int i = 0; i < count; i++){
                    csum += square[i][0];
                }

                for (int i = 1; i < count; i++) {
                    sum = 0;

                    for (j = 0; j < count; j++) {
                        sum += square[j][i];
                    }

                    if (csum != sum) {
                        System.out.println("Not magic square");
                        break exit1;
                    }
                }

                for (int i = 0; i < count; i++) {
                    sum = 0;
                    for (j = 0; j < count; j++) {
                        sum += square[i][j];
                    }

                    if (csum != sum) {
                        System.out.println("Not magic square");
                        break exit1;
                    }
                }

                sum = 0;

                for (int i = 0; i < count; i++) {
                    for (j = 0; j < count; j++) {
                        if (i == j) {
                            sum += square[i][j];
                        }
                    }
                }

                if (csum != sum) {
                    System.out.println("Not magic square");
                    break exit1;
                }

                sum = 0;

                for (int i = 0; i < count; i++) {
                    for (j = 0; j < count; j++) {
                        if (i == count- j -1) {
                            sum += square[i][j];
                        }
                    }
                }


                if (csum != sum) {
                    System.out.println("Not magic square");
                    break exit1;
                }
                System.out.println("That's magic square");
            }

        }
    }
}