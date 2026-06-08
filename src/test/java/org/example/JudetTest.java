package org.example;

import static org.junit.jupiter.api.Assertions.*;

class JudetTest {

    @org.junit.jupiter.api.Test
    void testToString() {
        String tester= "GR Giurgiu SudMuntenia 262066 3544";
        Judet jd = new Judet("GR", "Giurgiu", "SudMuntenia", "262066", "3544");
        assertEquals(jd,tester);
    }
}