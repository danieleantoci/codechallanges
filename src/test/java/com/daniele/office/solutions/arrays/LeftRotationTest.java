package com.daniele.office.solutions.arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class LeftRotationTest {

    @Test
    void test_rotLeft() {

        int[] copy = LeftRotation.rotLeft(new int[]{33, 47, 70, 37, 8, 53, 13, 93, 71, 72, 51, 100, 60, 87, 97},13);
        assertEquals("[3, 4, 5, 1, 2]", Arrays.toString(copy));
    }
}