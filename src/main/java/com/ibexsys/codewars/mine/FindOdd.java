package com.ibexsys.codewars.mine;

import java.util.Arrays;

public class FindOdd {

    public static int findIt(int[] arryNum) {

        Arrays.sort(arryNum);

        int index = 0;
        int curnum;
        int count;
        int preVal = 0;

        while (index < arryNum.length) {
            curnum = arryNum[index];

            count = 0;

            for (; index < arryNum.length && curnum == arryNum[index]; index++, count++) ;

            if ((count >= preVal) && (count & 1) == 1){
                preVal = curnum;
            }
        }

        return preVal;
    }
}
