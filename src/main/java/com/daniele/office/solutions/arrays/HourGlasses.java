package com.daniele.office.solutions.arrays;

public class HourGlasses {

    static int[] dx = new int[]{-1, -1, -1, 1, 1, 1};
    static int[] dy = new int[]{-1, 0, 1, -1, 0, 1};


    static int hourglassSum(int[][] arr) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++) {
                max = Math.max(max, getSumHourglass(i, j, arr));
            }
        return max;
    }

    static int getSumHourglass(int x, int y, int[][] arr) {
        int sum = arr[x][y];
        for (int i = 0; i < dx.length; i++) {
            if (!isInside(dx[i] + x, dy[i] + y, arr))
                return Integer.MIN_VALUE;
            sum += arr[dx[i] + x][dy[i] + y];
        }
        return sum;
    }

    static boolean isInside(int x, int y, int[][] arr) {
        return x >= 0 && x < arr.length && y >= 0 && y < arr.length;
    }

}
