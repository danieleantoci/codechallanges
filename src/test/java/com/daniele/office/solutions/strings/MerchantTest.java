package com.daniele.office.solutions.strings;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

public class MerchantTest extends TestCase {
    @Test
    void test_sockMerchant(){
        assertEquals(3, Merchant.sockMerchant(9, new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20}));
    }
}