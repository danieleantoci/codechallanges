package com.daniele.office.solutions.challanges;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;

public class LordOfCodeTest extends TestCase {

    @Test
    void test_minMoves() {

        int n = 30;
        int startRow = 25;
        int startCol = 2;
        int endRow = 23;
        int endCol = 29;

//        int n = 9;
//        int startRow = 4;
//        int startCol = 4;
//        int endRow = 4;
//        int endCol = 8;

        assertAll(
                () -> assertEquals(15, LordOfCode.minMoves(n,startRow,startCol,endRow,endCol))
                //() -> assertEquals(15, LordOfCode.minStepToReachTarget(n,startRow,startCol,endRow,endCol))
        );
    }

}