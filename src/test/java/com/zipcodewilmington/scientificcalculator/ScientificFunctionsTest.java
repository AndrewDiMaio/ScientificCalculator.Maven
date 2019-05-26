package com.zipcodewilmington.scientificcalculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class ScientificFunctionsTest {

    ScientificFunctions scientificCalc = new ScientificFunctions();




    @Test
    public void getSin() {

            double actual = scientificCalc.getSin(8.0);
            double expected = 0.9893582466233818;

            assertEquals(actual, expected, 0.000000001);

    }

    @Test
    public void getCos() {
        double actual = scientificCalc.getCos(5.0);
        double expected = 0.28366218546;

        assertEquals(actual, expected, 0.0000000001);
    }

    @Test
    public void getTan() {
        double actual = scientificCalc.getTan(7.0);
        double expected = 0.87144798272 ;

        assertEquals(actual, expected, 0.00000001);

    }

    @Test
    public void getInverseSin() {
        double actual = scientificCalc.getInverseSin(5.0);
        double expected = 0.95892427466 ;

        assertEquals(actual, expected, 0.00000001);

    }

    @Test
    public void getInverseSin2() {
        double actual = scientificCalc.getInverseSin(0.0);
        double expected = 0.0 ;

        assertEquals(actual, expected, 0.00000001);


    }
    @Test
    public void getInverseSin3() {
        double actual = scientificCalc.getInverseSin(122.0);
        double expected = -0.49871315389 ;

        assertEquals(actual, expected, 0.00000001);


    }

    @Test
    public void getInverseCos() {
        double actual = scientificCalc.getInverseCos(52.0);
        double expected = 0.16299078079;

        assertEquals(actual, expected, 0.00000001);

    }

    @Test

    public void getInverseCos2() {
        double actual = scientificCalc.getInverseCos(0.0);
        double expected = -1.0;

        assertEquals(actual, expected, 0.00000001);

    }

    @Test

    public void getInverseCos3() {
        double actual = scientificCalc.getInverseCos(250.0);
        double expected = -0.24098830528;

        assertEquals(actual, expected, 0.00000001);

    }

    @Test
    public void getInverseTan() {
        double actual = scientificCalc.getInverseTan(9.0);
        double expected = 0.45231565944;

        assertEquals(actual, expected, 0.00000001);
    }

    @Test
    public void getInverseTan2() {
        double actual = scientificCalc.getInverseTan(0.0);
        double expected = 0.0;

        assertEquals(actual, expected, 0.00000001);
    }
    @Test
    public void getInverseTan3() {
        double actual = scientificCalc.getInverseTan(300.0);
        double expected = -45.2447420708;

        assertEquals(actual, expected, 0.00000001);
    }

}