package com.daniele.office.solutions.arrays;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SwapsTest {

    int[] array;

    void setup() throws IOException {

        Properties properties = new Properties();
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("array_swaps_input.properties");
        properties.load(inputStream);

        array = new int[properties.size()];
        for(int i=0; i<properties.size(); i++){
            array[i] = Integer.parseInt((String) properties.get(String.valueOf(i)));
        }
    }

    @Test
    void test_minimumSwaps() throws IOException {
        setup();
        assertEquals(99987,Swaps.minimumSwaps(array));
    }

}