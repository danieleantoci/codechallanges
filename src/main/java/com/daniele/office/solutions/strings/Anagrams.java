package com.daniele.office.solutions.strings;

public class Anagrams {

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
        final String[] bb = {b};
        a.chars().forEach(c -> {
            if (bb[0].indexOf((char) c) != -1) {
                bb[0] = bb[0].replaceFirst(String.valueOf((char) c), "");
            }
        });
        int diff = b.length() - bb[0].length();
        return a.length() + b.length() - diff * 2;
    }

}
