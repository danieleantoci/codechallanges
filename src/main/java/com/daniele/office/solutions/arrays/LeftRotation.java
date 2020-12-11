package com.daniele.office.solutions.arrays;

import java.util.Arrays;

public class LeftRotation {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {

        int[] b = new int[a.length];
        System.arraycopy(Arrays.copyOfRange(a,d,a.length), 0, b, 0, a.length-d);
        System.arraycopy(Arrays.copyOfRange(a,0,d), 0, b, a.length-d, d);

        return b;
    }

}
