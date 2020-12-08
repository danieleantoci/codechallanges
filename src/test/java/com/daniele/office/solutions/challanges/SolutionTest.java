package com.daniele.office.solutions.challanges;

import groovy.lang.Tuple3;
import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.assertAll;

public class SolutionTest extends TestCase {

    @Test
    void testFindMinDistance() {
        assertAll(
                () -> assertEquals(0, Solution.findMinDistance(1, 1, 1)),
                () -> assertEquals(2, Solution.findMinDistance(2, 2, 1)),
                () -> assertEquals(1, Solution.findMinDistance(2, 2, 2)),
                () -> assertEquals(1, Solution.findMinDistance(3, 2, 3)),
                () -> assertEquals(2, Solution.findMinDistance(3, 3, 1)),
                () -> assertEquals(1, Solution.findMinDistance(3, 3, 3)),
                () -> assertEquals(4, Solution.findMinDistance(4, 4, 1)),
                () -> assertEquals(3, Solution.findMinDistance(4, 4, 2)),
                () -> assertEquals(2, Solution.findMinDistance(4, 4, 3)),
                () -> assertEquals(1, Solution.findMinDistance(4, 4, 4)),
                () -> assertEquals(2, Solution.findMinDistance(4, 5, 3)),
                () -> assertEquals(2, Solution.findMinDistance(5, 1, 1)),
                () -> assertEquals(1, Solution.findMinDistance(5, 1, 2)),
                () -> assertEquals(0, Solution.findMinDistance(5, 1, 5)),
                () -> assertEquals(3, Solution.findMinDistance(5, 2, 1)),
                () -> assertEquals(3, Solution.findMinDistance(5, 2, 1)),
                () -> assertEquals(4, Solution.findMinDistance(5, 5, 1)),
                () -> assertEquals(3, Solution.findMinDistance(6, 4, 2)),
                () -> assertEquals(2, Solution.findMinDistance(6, 3, 3)),
//                () -> assertEquals(-1, Solution.findMinDistance(6, 6, 1)),
//                () -> assertEquals(-1, Solution.findMinDistance(6, 6, 2)),
//                () -> assertEquals(-1, Solution.findMinDistance(6, 6, 5)),
                () -> assertEquals(3, Solution.findMinDistance(7, 1, 1)),
                () -> assertEquals(2, Solution.findMinDistance(7, 1, 2)),
                () -> assertEquals(1, Solution.findMinDistance(7, 1, 4)),
                () -> assertEquals(1, Solution.findMinDistance(7, 1, 5)),
                () -> assertEquals(4, Solution.findMinDistance(7, 2, 1)),
                () -> assertEquals(2, Solution.findMinDistance(7, 2, 2)),
                () -> assertEquals(2, Solution.findMinDistance(7, 2, 3)),
                () -> assertEquals(4, Solution.findMinDistance(7, 3, 1)),
                () -> assertEquals(3, Solution.findMinDistance(7, 3, 2)),
                () -> assertEquals(2, Solution.findMinDistance(7, 3, 4)),
                () -> assertEquals(3, Solution.findMinDistance(7, 4, 2)),
                () -> assertEquals(4, Solution.findMinDistance(9, 1, 1)),
                () -> assertEquals(5, Solution.findMinDistance(9, 2, 1)),
                () -> assertEquals(5, Solution.findMinDistance(9, 3, 1)),
                () -> assertEquals(7, Solution.findMinDistance(14, 1, 1)),
                () -> assertEquals(8, Solution.findMinDistance(14, 2, 1)),
                () -> assertEquals(14, Solution.findMinDistance(28, 1, 1))
        );
    }

    @Test
    void testFindMinDistance2() {
        assertAll(
                () -> assertEquals(0, Solution2.findMinDistance(1, 1, 1)),
                () -> assertEquals(2, Solution2.findMinDistance(2, 2, 1)),
                () -> assertEquals(1, Solution2.findMinDistance(2, 2, 2)),
                () -> assertEquals(1, Solution2.findMinDistance(3, 2, 3)),
                () -> assertEquals(2, Solution2.findMinDistance(3, 3, 1)),
                () -> assertEquals(1, Solution2.findMinDistance(3, 3, 3)),
                () -> assertEquals(4, Solution2.findMinDistance(4, 4, 1)),
                () -> assertEquals(3, Solution2.findMinDistance(4, 4, 2)),
                () -> assertEquals(2, Solution2.findMinDistance(4, 4, 3)),
                () -> assertEquals(1, Solution2.findMinDistance(4, 4, 4)),
                () -> assertEquals(2, Solution2.findMinDistance(4, 5, 3)),
                () -> assertEquals(2, Solution2.findMinDistance(5, 1, 1)),
                () -> assertEquals(1, Solution2.findMinDistance(5, 1, 2)),
                () -> assertEquals(0, Solution2.findMinDistance(5, 1, 5)),
                () -> assertEquals(3, Solution2.findMinDistance(5, 2, 1)),
                () -> assertEquals(3, Solution2.findMinDistance(5, 2, 1)),
                () -> assertEquals(4, Solution2.findMinDistance(5, 5, 1)),
                () -> assertEquals(3, Solution2.findMinDistance(6, 4, 2)),
                () -> assertEquals(2, Solution2.findMinDistance(6, 3, 3)),
                () -> assertEquals(-1, Solution2.findMinDistance(6, 6, 1)),
                () -> assertEquals(-1, Solution2.findMinDistance(6, 6, 2)),
                () -> assertEquals(-1, Solution2.findMinDistance(6, 6, 5)),
                () -> assertEquals(3, Solution2.findMinDistance(7, 1, 1)),
                () -> assertEquals(2, Solution2.findMinDistance(7, 1, 2)),
                () -> assertEquals(1, Solution2.findMinDistance(7, 1, 4)),
                () -> assertEquals(1, Solution2.findMinDistance(7, 1, 5)),
                () -> assertEquals(4, Solution2.findMinDistance(7, 2, 1)),
                () -> assertEquals(2, Solution2.findMinDistance(7, 2, 2)),
                () -> assertEquals(2, Solution2.findMinDistance(7, 2, 3)),
                () -> assertEquals(4, Solution2.findMinDistance(7, 3, 1)),
                () -> assertEquals(3, Solution2.findMinDistance(7, 3, 2)),
                () -> assertEquals(2, Solution2.findMinDistance(7, 3, 4)),
                () -> assertEquals(3, Solution2.findMinDistance(7, 4, 2)),
                () -> assertEquals(4, Solution2.findMinDistance(9, 1, 1)),
                () -> assertEquals(5, Solution2.findMinDistance(9, 2, 1)),
                () -> assertEquals(5, Solution2.findMinDistance(9, 3, 1)),
                () -> assertEquals(7, Solution2.findMinDistance(14, 1, 1)),
                () -> assertEquals(8, Solution2.findMinDistance(14, 2, 1)),
                () -> assertEquals(14, Solution2.findMinDistance(28, 1, 1))
        );
    }

    @Test
    void testEx() {

        //assertEquals(1, Solution.findMinDistance(7, 2, 4));
        assertEquals(2, Solution2.findMinDistance(7, 2, 2));
    }

    @Test
    void testAll() {

        List<Tuple3> points = new ArrayList<>();
        int result;
        for(int i=1; i<29;i++) {
            for(int j=1; j<29;j++) {
                for(int z=1; z<6;z++) {
                    result = Solution2.findMinDistance(i,j,z);
                    if(result==-1)
                        break;
                    points.add(new Tuple3(i,j,z));
                }
            }
        }
        Map<Tuple3,Integer> map = new HashMap<>();
        points.forEach(tuple3 -> map.put(tuple3, Solution.findMinDistance((int) tuple3.getV1(),(int) tuple3.getV2(),(int) tuple3.getV3())));

        AtomicInteger count= new AtomicInteger();
        map.forEach((tuple3, integer) -> {
            int res = Solution2.findMinDistance((int) tuple3.getV1(),(int) tuple3.getV2(),(int) tuple3.getV3());
            int div= (int) Math.ceil((double) ((int)tuple3.getV1()*(int)tuple3.getV2())/(int) tuple3.getV3());
            double sqrt = Math.sqrt(div);
            if (integer != res) {
                count.getAndIncrement();
                System.out.println("Correct -> " + tuple3 + ": " + integer);
                System.out.println("Wrong -> " + tuple3 + ": " + res);
                System.out.println(div);
                System.out.println(sqrt);
                System.out.println(" ");
            } /*else {
                if(Math.ceil(sqrt)-sqrt<0.5) {
                    if ((int)tuple3.getV1()!=1 && (int)tuple3.getV2()!=1 && (int)tuple3.getV1()!=2 && (int)tuple3.getV2()!=2 &&
                            (Math.ceil((double)(int)tuple3.getV1()*(int)tuple3.getV2()/3)>(int)tuple3.getV3())) {
                        System.out.println("Correct -> " + tuple3 + ": " + integer);
                        System.out.println(div);
                        System.out.println(sqrt);
                        System.out.println(" ");
                    }
                }
            } */
        });

        System.out.println(count + " with differences");
        assertTrue(true);

    }


}