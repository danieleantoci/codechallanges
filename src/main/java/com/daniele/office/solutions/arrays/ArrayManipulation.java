package com.daniele.office.solutions.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayManipulation {

    static long arrayManipulation(int n, int[][] queries) {
        long[] arr = new long[n+1];
        for(int[] query: queries) {
            arr[query[0]-1] += query[2];
            arr[query[1]] -= query[2];
        }
        long sum = 0;
        long max = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            max = Math.max(max, sum);
        }
        return max;
    }

}
