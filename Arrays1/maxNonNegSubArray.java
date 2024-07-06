package dsa.Arrays1;

import java.util.ArrayList;
import java.util.Arrays;

public class maxNonNegSubArray {
    public static void main(String[] args){
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, -4, 5, 7, 1, -9, 9, 2, 1,1));
        ArrayList<Integer> ret = new ArrayList<>();
        ret = maxNonNegSubArray(A);
        System.out.println("maxNonNegSUbArray is: ["+Arrays.toString(ret.toArray())+"]");
    }
    public static ArrayList<Integer> maxNonNegSubArray(ArrayList<Integer> B){
        ArrayList<Integer> newSubArray = new ArrayList<>();
        ArrayList<Integer> maxSubArray = new ArrayList<>();
        int newSum =0;
        int maxSum =0;
        for(int i: B){

            if(i>0){
                newSum = newSum + i;
                newSubArray.add(i);
            }else{
                newSum =0;
                newSubArray = new ArrayList<Integer>();
            }

            if((newSum > maxSum) || ((newSum == maxSum) && (newSubArray.size() > maxSubArray.size()))){
                maxSum = newSum;
                maxSubArray = newSubArray;
            }
        }

        return maxSubArray;
    }
}
