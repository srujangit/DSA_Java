package dsa.Arrays1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class rainWaterTrap {
    public static void main(String[] args){
//        int N = 12;
        int sum =0;
        Integer[] elements = {2, 1, 3, 2, 1, 2, 4, 3, 2, 1, 3, 1};
        ArrayList<Integer> buildings = new ArrayList<>(Arrays.asList(elements));

        sum = rainWater(buildings);
        System.out.println("Water logged between the builds of length given in elements:"+ sum);
    }
    public static int rainWater(ArrayList<Integer> B){
        int N = B.size();
        ArrayList<Integer>PFM = new ArrayList<Integer>(Collections.nCopies(N, 0));
        ArrayList<Integer>SFM = new ArrayList<Integer>(Collections.nCopies(N, 0));
        PFM.set(0, B.get(0));
        SFM.set(N-1, B.get(N-1));
        for(int i=1; i<N; i++){
            PFM.set(i, Math.max(PFM.get(i-1), B.get(i)));
            SFM.set(N-1-i, Math.max(SFM.get(N-i), B.get(N-1-i)));
        }
        int sum =0;

        for(int i=1; i<(N-1); i++){
            int min = Math.min(PFM.get(i-1), SFM.get(i+1));
            if((min-B.get(i))>0){
                sum = sum + (min-B.get(i));
            }
        }

        return sum;
    }
}
