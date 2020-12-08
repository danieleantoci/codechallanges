package com.daniele.office.solutions.strings;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

public class StringsRepetitionTest extends TestCase {

    @Test
    void test_repetition() {
        assertEquals(5, StringsRepetition.repeatedString("sasaas",10));
    }

}