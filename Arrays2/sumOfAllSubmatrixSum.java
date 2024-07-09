package dsa.Arrays2;

import java.util.ArrayList;
import java.util.Arrays;

public class sumOfAllSubmatrixSum {

    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();

        A.add(new ArrayList<Integer>(Arrays.asList(5, 7, 9)));
        A.add(new ArrayList<Integer>(Arrays.asList(3, 4, 6)));
        A.add(new ArrayList<>(Arrays.asList(1, 4, 6)));
        int N = A.size();
        int M = A.get(0).size();
        int sum=0;
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                sum = sum + A.get(i).get(j) * (i+1)*(N-i)*(j+1)*(M-j);
            }
        }

        System.out.println("sum of all sub arrays sum is:"+sum);
    }

}
