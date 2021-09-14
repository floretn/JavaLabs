package lab1.ch15.task15;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Task15 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number of lines: ");
        int n = sc.nextInt();
        int[][] triangle = new int[n][];
        for (int i = 0; i < n; i++) {
            triangle[i] = new int[i + 1];
            triangle[i][0] = 1;
            triangle[i][i] = 1;
            for (int j = 1; j < i; j++){
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }

        for (int i = 0; i < triangle.length; i++){
            for (int j = 0; j < triangle[i].length; j++){
                System.out.printf("%4d", triangle[i][j]);
            }
            System.out.println();
        }

        System.out.println();
        ArrayList<ArrayList<Integer>> triangleList;
        triangleList = new ArrayList<ArrayList<Integer>>(n);

        for (int[] t : triangle) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int p : t) {
                row.add(p);
            }
            triangleList.add(row);
            System.out.println(row);
        }
        System.out.println();
        System.out.println(triangleList);
    }

}
