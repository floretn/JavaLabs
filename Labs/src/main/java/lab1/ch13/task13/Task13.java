package lab1.ch13.task13;

import java.util.ArrayList;
import java.util.Random;

public class Task13 {
    public static void main(String[] args) {
        ArrayList<Integer> sp;
        sp = new ArrayList<>();

        for(int i = 0; i < 49; i++){
            sp.add(i + 1);
        }

        Random generator = new Random();
        int[] lot = new int[6];

        for(int i = 0; i < 6; i++) {
            int j = 50 - i;
            int ind = (int) (Math.random() * j);
            lot[i] = sp.get(ind);
            sp.remove(ind);
        }

        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++){
                if ( lot[i] < lot[j]){
                    int a = lot[j];
                    lot[j] = lot[i];
                    lot[i] =a;
                }
            }
        }

        for(int i =0; i<6; i++){
            System.out.println(lot[i]);
        }

    }
}
