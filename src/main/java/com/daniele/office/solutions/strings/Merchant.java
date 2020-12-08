package com.daniele.office.solutions.strings;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import static java.util.Arrays.*;

public class Merchant {

    static int sockMerchant(int n, int[] ar) {

        Map<Integer, Integer> map = new HashMap<>();
        Arrays.stream(ar).boxed().forEach(i -> map.merge(i,1,Integer::sum));
        final int[] counter = {0};
        map.forEach((key, count) -> {
            counter[0] += count/2;
        });
        return counter[0];
    }

    static int sockMerchant2(int n, int[] ar) {

        Map<Integer, Long> map = stream(ar).boxed().collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()));
        AtomicInteger counter = new AtomicInteger();
        map.forEach((key, count) -> {
            if(count%2==0)
                counter.getAndIncrement();
        });
        return counter.get();
    }

}
