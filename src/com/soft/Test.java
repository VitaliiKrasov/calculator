package com.soft;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test {

    @org.junit.jupiter.api.Test
    void add() {
        assertEquals(9, Calculator.add(4, 5));
        assertEquals(-8, Calculator.add(-10,2));
    }

    @org.junit.jupiter.api.Test
    void subtract() {
        assertEquals(-5, Calculator.subtract(10, 15));
        assertEquals(2, Calculator.subtract(2, 0));
    }

    @org.junit.jupiter.api.Test
    void multiply() {
        assertEquals(24, Calculator.multiply(8, 3));
    }

    @org.junit.jupiter.api.Test
    void divide() {
        assertEquals(2, Calculator.divide(50, 24));
    }

    @org.junit.jupiter.api.Test
    void echo() {
        assertEquals( "You are happy", Calculator.echo("happy"));
    }
}