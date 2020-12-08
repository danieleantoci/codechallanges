package com.daniele.office.solutions.strings;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

public class ValleyTest extends TestCase {

    @Test
    void test_countingSteps() {
        assertEquals(1, Valley.countingValleys(1, "UDDDUDUU"));
    }

    @Test
    void test_getDirection() {

        assertEquals(1, Valley.Step.getDirection('U'));
        assertEquals(-1, Valley.Step.getDirection('D'));
        assertEquals(0, Valley.Step.getDirection('G'));

    }
}