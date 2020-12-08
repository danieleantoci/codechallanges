package com.daniele.office.solutions.strings;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

public class CloudJumpingTest extends TestCase {

    @Test
    void test_jumpingOnCloud() {
        assertEquals(7, CloudJumping.jumpingOnClouds(new int[]{0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0}));
        assertEquals(1, CloudJumping.jumpingOnClouds(new int[]{0, 1, 0}));

    }

}