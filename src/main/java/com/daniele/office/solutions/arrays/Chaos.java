package com.daniele.office.solutions.arrays;

public class Chaos {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
        int bribes = 0;
        for (int i = q.length-1; i >=0; i--) {
            if ((q[i] - (i + 1)) > 2) {
                System.out.println("Too chaotic");
                return;
            }
            for (int j = Math.max(0, q[i] - 2); j < i; j++) {
                if (q[j] > q[i])
                    bribes += 1;
            }
        }
        System.out.println(bribes);
    }

}
