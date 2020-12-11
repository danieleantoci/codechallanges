package com.daniele.office.solutions.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HourGlassesTest {

    @Test
    void test_hourglassSum() {

        assertEquals(-6,
                HourGlasses.hourglassSum(new int [][]{
                        {-1,-1,0,-9,-2,-2,},
                        {-2,-1,-6,-8,-2,-5},
                        {-1,-1,-1,-2,-3,-4},
                        {-1,-9,-2,-4,-4,-5},
                        {-7,-3,-3,-2,-9,-9},
                        {-1,-3,-1,-2,-4,-5}
                }));
    }
}