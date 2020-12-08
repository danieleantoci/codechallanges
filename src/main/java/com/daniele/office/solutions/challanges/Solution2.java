package com.daniele.office.solutions.challanges;

public class Solution2 {

    public static int findMinDistance(int w, int h, int n) {
        // Write your code here
        //constraint verification
        if(!checkConstraint(w, h, n))
            return -1;
        //start special cases
        if(w*h==n)
            return 0;

        if(Math.ceil((double)w*h/3)<=n)
            return 1;

        if(w==1 || h==1) {
            int div = w==1?h:w;
            return (int) Math.ceil((double)(div-n)/(n*2));
        }
        if(w==h && w==2) {
            if(n==1)
                return 2;
            return 1;
        }
        if(w==2 || h==2) {
            int addition=0;
            if (n==1) {
                addition++;
                if(w==2)
                    w--;
                if(h==2)
                    h--;
            } else {
                if(w==2)
                    w++;
                if(h==2)
                    h++;
            }
            return findMinDistance(w, h, n) + addition;
        }
        //finish special cases

        //generic case
        int subArea = (int) Math.ceil((double)w*h/n);
        int result = (int) Math.ceil(Math.sqrt(subArea));
        if( w==h && w%2==0 && n==1)
            return result;
        return result-1;
    }

    private static boolean checkConstraint(int w, int h, int n) {
        if(w<1 || h<1) {
            return false;
        }
        if(w*h>28)
            return false;
        if(n<1 || n>5)
            return false;
        if(n>w*h)
            return false;
        return true;
    }
}
