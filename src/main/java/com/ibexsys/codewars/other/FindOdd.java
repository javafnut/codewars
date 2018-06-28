package com.ibexsys.codewars.other;

import static java.util.Arrays.stream;

public class FindOdd {

        public static int findIt(int[] A) {
            int xor = 0;
            for (int i = 0; i < A.length; i++) {
                xor ^= A[i];
            }
            return xor;
        }



    public static int findItStreams(int[] arr) {
        return stream(arr).reduce(0, (x, y) -> x ^ y);
    }


}
