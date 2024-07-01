package dsa.Arrays1;

import java.util.Arrays;
import java.util.Scanner;

public class performQquires {
    public static void main(String[] args) {
        int[][] Q;
        Q = new int[][]{{2, 6},
                {1, -1},
                {3, 2}
        };
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
        int N =10;
        int[] ret;
        ret = perform(Q, N);

//        for(int i=0; i<N;i++){
//            System.out.println(ret[i]);
//        }
        System.out.println(Arrays.toString(ret));


    }
    public static int[] perform(int[][] Q, int N){
        int[] A;
        A= new int[N];
        int l = Q.length;
        for(int i=0; i<l; i++){
            int p = Q[i][0];
            int val = Q[i][1];
            A[p] +=val;
        }

        for(int i=1; i<N; i++){
            A[i] =A[i-1] +A[i];
        }

        return A;
    }
}
