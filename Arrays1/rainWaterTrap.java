package dsa.Arrays1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
/*Problem Description
Given a vector A of non-negative integers representing an elevation map where the width of each bar is 1,
compute how much water it is able to trap after raining.
Problem Constraints
1 <= |A| <= 100000

Input Format
First and only argument is the vector A

Output Format
Return one integer, the answer to the question

Example Input
Input 1:

A = [0, 1, 0, 2]
Input 2:

A = [1, 2]
 */
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
