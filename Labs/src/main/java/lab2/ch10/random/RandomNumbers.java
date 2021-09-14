package lab2.ch10.random;

import java.util.ArrayList;
import java.util.Random;

public class RandomNumbers {

    public static int nextInt(Random generator, int low, int high) {
        return low + generator.nextInt(high - low + 1);
    }

    public static int randomElement(Random generator, int[] a){
        if(a.length == 1) {
            return a[0];
        }else{
            int i = generator.nextInt(a.length - 1);
            return a[i];
        }
    }

    public static int randomElement(Random generator, ArrayList<Integer> a){
        if(a.size() == 1) {
            return a.get(0);
        }else{
            int i = generator.nextInt(a.size() - 1);
            return a.get(i);
        }
    }
}
