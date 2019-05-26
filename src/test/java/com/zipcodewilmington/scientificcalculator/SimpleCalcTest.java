package com.zipcodewilmington.scientificcalculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleCalcTest {

    SimpleCalc simpleCalc = new SimpleCalc();

    @Test
    public void getAddition() {

        double actual = simpleCalc.getAddition(1.0, 2.0);
        double expected = 3.0;

        assertEquals(actual, expected, 0.000001);
    }
    @Test
    public void getAddition2() {

        double actual = simpleCalc.getAddition(5.0, 6.0);
        double expected = 11.0;

        assertEquals(actual, expected, 0.000001);
    }

    @Test
    public void getAddition3() {

        double actual = simpleCalc.getAddition(5.0, 2.0);
        double expected = 7.0;

        assertEquals(actual, expected, 0.000001);
    }

    @Test
    public void getSubtraction() {

        double actual = simpleCalc.getSubtraction(5.0, 2.0);
        double expected = 3.0;

        assertEquals(actual, expected, 0.000001);
    }

    @Test
    public void getSubtraction2() {

        double actual = simpleCalc.getSubtraction(8.0, 2.0);
        double expected = 6.0;

        assertEquals(actual, expected, 0.000001);
    }


    @Test
    public void getSubtraction3() {

        double actual = simpleCalc.getSubtraction(-8.0, -3.0);
        double expected = -5.0;

        assertEquals(actual, expected, 0.000001);
    }

    @Test
    public void getMultiplication() {
        double actual = simpleCalc.getMultiplication(9.0, 10.0);
        double expected = 90.0;

        assertEquals(actual, expected, 0.000001);

    }

    @Test
    public void getMultiplication2() {
        double actual = simpleCalc.getMultiplication(5.0, 5.0);
        double expected = 25.0;

        assertEquals(actual, expected, 0.000001);
    }
    @Test
    public void getMultiplication3() {
        double actual = simpleCalc.getMultiplication(3.0, 3.0);
        double expected = 9.0;

        assertEquals(actual, expected, 0.000001);
    }

    @Test
    public void getDivision() {
        double actual = simpleCalc.getDivision(10.0, 2.0);
        double expected = 5.0;

        assertEquals(actual, expected, 0.000001);

    }
    @Test
    public void getDivision2() {
        double actual = simpleCalc.getDivision(6.0, 3.0);
        double expected = 2.0;

        assertEquals(actual, expected, 0.000001);

    }

    @Test
    public void getDivision3() {
        double actual = simpleCalc.getDivision(9.0, 3.0);
        double expected = 3.0;

        assertEquals(actual, expected, 0.000001);

    }



}

