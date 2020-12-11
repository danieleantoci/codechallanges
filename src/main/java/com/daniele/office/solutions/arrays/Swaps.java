package com.daniele.office.solutions.arrays;

public class Swaps {

    static int minimumSwaps(int[] arr) {
        int swaps = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                for (int j = i; j < arr.length; j++) {
                    if (arr[j] == i + 1) {
                        arr[j] = arr[i];
                        arr[i] = i + 1;
                        swaps++;
                        break;
                    }
                }
            }
        }
        return swaps;
    }


}
