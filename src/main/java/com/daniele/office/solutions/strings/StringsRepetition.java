package com.daniele.office.solutions.strings;

public class StringsRepetition {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        long count = countCharOccurrenceInString(s,'a');
        long partialCount = countCharOccurrenceInString(s.substring(0,(int)(n%s.length())),'a');
        return (count*(n/s.length()))+partialCount;
    }

    static long countCharOccurrenceInString(String s, char c) {
        return s.chars().filter(ch -> ch == c).count();
    }


}
