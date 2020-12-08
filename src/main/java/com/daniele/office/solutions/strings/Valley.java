package com.daniele.office.solutions.strings;

import java.util.Arrays;

public class Valley {

    public static int countingValleys(int steps, String path) {
        // Write your code here
        final int[] counter = {0};
        final int[] altitude = {0};
        path.chars().forEach(c -> {
            altitude[0] += Step.getDirection((char) c);
            if(altitude[0]==0 && Step.U.name().equals(String.valueOf((char)c)))
                counter[0]++;
        });
        return counter[0];
    }

    public enum Step {

        U(1),
        D(-1);

        private final int direction;

        Step(int direction) {
            this.direction = direction;
        }

        public static int getDirection(char step) {
            Step dir = Arrays
                    .stream(Step.values())
                    .filter(s -> s.name().equals(String.valueOf(step)))
                    .findFirst()
                    .orElse(null);
            return dir != null ? dir.direction : 0;
        }
    }
}
