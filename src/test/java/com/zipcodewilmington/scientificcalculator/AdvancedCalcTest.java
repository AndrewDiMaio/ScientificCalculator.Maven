package com.zipcodewilmington.scientificcalculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class AdvancedCalcTest {


        AdvancedCalc advancedCalc = new AdvancedCalc();



    @Test
    public void getSquared() {
        double actual = advancedCalc.getSquared(2.0);
        double expected = 4.0;

        assertEquals(actual, expected, 0.000001);


    }

    @Test
    public void getSquareRoot() {
        double actual = advancedCalc.getSquareRoot(9.0);
        double expected = 3.0;

        assertEquals(actual, expected, 0.000001);
    }

    @Test
    public void getExponent() {
        double actual = advancedCalc.getExponent(5.0, 2.0);
        double expected = 25.0;

        assertEquals(actual, expected, 0.000001);
    }

    @Test
    public void getInverse() {
        double actual = advancedCalc.getInverse(5.0);
        double expected = 0.2;

        assertEquals(actual, expected, 0.000001);
    }

    @Test
    public void getInvertSign() {
        double actual = advancedCalc.getInvertSign(0.0);
        double expected = 0.0;

        assertEquals(actual, expected, 0.000001);


    }
    @Test
    public void getInvertSign2() {
        double actual = advancedCalc.getInvertSign(-1.0);
        double expected = 1.0;

        assertEquals(actual, expected, 0.000001);


    }
    @Test
    public void getInvertSign3() {
        double actual = advancedCalc.getInvertSign(7.0);
        double expected = -7.0;

        assertEquals(actual, expected, 0.000001);


    }
}