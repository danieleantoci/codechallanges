package com.daniele.office.solutions.arrays;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

public class ArrayManipulationTest extends TestCase {

    @Test
    void test_arrayManipulation() {
        assertEquals(31,ArrayManipulation.arrayManipulation(10, new int[][] {{2,6,8},{3,5,7},{1,8,1},{5,9,15}}));
    }

}