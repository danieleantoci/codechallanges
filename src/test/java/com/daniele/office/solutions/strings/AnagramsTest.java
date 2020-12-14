package com.daniele.office.solutions.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramsTest {

    @Test
    void makeAnagram() {
        assertEquals(30,Anagrams.makeAnagram("fcrxzwscanmligyxyvym","jxwtrhvujlmrpdoqbisbwhmgpmeoke"));
        //assertEquals(30,Anagrams.makeAnagram("abcdefghea","defeaf"));

    }
}