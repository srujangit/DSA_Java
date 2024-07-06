package dsa.Arrays1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static java.util.Collections.*;

public class addingOneToNumber {
    public static void main(String[] args){
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(0, 0, 5, 6, 7, 9, 0, 0));
        ArrayList<Integer> ret = new ArrayList<>();
        ret = addingOneInteger(A);

        System.out.println("final ans is:" + Arrays.toString(ret.toArray()));

    }
    public static ArrayList<Integer> addingOneInteger(ArrayList<Integer> B){
        int N = B.size();
        int i=N-1; int carry =1;
        int j = N-1;
        ArrayList<Integer> ret = new ArrayList<>();

        while(i>=0){
            int h = carry + B.get(i);
            ret.add(h%10);
            carry = h/10;
            i--;
        }

        while(carry>0){
            ret.add(carry%10);
            carry = carry/10;
        }
        while(j>=0){
            if(ret.get(j)>0)
                break;

            if(ret.get(j)==0){
                ret.remove(j);
            }
            j--;
        }
        Collections.reverse(ret);
        return ret;
    }
}
