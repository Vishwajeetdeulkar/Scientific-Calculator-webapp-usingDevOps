package com.iiitb.scientificcalculatorwebappusingdevops;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();

    @Test
    public void squareRootTruePositive(){
        Map<String,Object> payload = new HashMap();
        payload.put("input1",(Object) new String("36"));

        Map<String,Object> payload2 = new HashMap();
        payload2.put("input1",(Object) new String( "12.25"));

        assertEquals("Squaring a number for True Positive", 6, calculator.sqrt(payload), DELTA);
        assertEquals("Squaring a number for True Positive", 3.5, calculator.sqrt(payload2), DELTA);

    }

    @Test
    public void squareRootFalsePositive(){
        Map<String,Object> payload = new HashMap();
        payload.put("input1",(Object) new String("36"));

        Map<String,Object> payload2 = new HashMap();
        payload2.put("input1",(Object) new String( "12.25"));
        assertNotEquals("Squaring a number for False Positive", 10, calculator.sqrt(payload), DELTA);
        assertNotEquals("Squaring a number for False Positive", 2.5, calculator.sqrt(payload2), DELTA);
    }
    @Test
    public void logTruePositive(){
        Map<String,Object> payload = new HashMap();
        payload.put("input1",(Object) new String("8"));

        Map<String,Object> payload2 = new HashMap();
        payload2.put("input1",(Object) new String( "9"));

        assertEquals("Natural log of number for True Positive", 2.079, calculator.log(payload), DELTA);
        assertEquals("Natural log of number for True Positive", 2.197, calculator.log(payload2), DELTA);

    }

    @Test
    public void logFalsePositive(){
        Map<String,Object> payload = new HashMap();
        payload.put("input1",(Object) new String("8"));

        Map<String,Object> payload2 = new HashMap();
        payload2.put("input1",(Object) new String( "9"));
        assertNotEquals("Natural log of number for False Positive", 10, calculator.log(payload), DELTA);
        assertNotEquals("Natural log of number for False Positive", 2.5, calculator.log(payload2), DELTA);
    }


//    @Test
//    public void powerTruePositive(){
//        Map<String,Object> payload = new HashMap();
//        payload.put("input1",(Object) new String("36"));
//
//        Map<String,Object> payload2 = new HashMap();
//        payload2.put("input1",(Object) new String( "12.25"));
//
//        assertEquals("Squaring a number for True Positive", 6, calculator.power(payload), DELTA);
//        assertEquals("Squaring a number for True Positive", 3.5, calculator.power(payload2), DELTA);
//
//    }
//
//    @Test
//    public void powerFalsePositive(){
//        Map<String,Object> payload = new HashMap();
//        payload.put("input1",(Object) new String("36"));
//
//        Map<String,Object> payload2 = new HashMap();
//        payload2.put("input1",(Object) new String( "12.25"));
//        assertNotEquals("Squaring a number for False Positive", 10, calculator.power(payload), DELTA);
//        assertNotEquals("Squaring a number for False Positive", 2.5, calculator.power(payload2), DELTA);
//    }
    @Test
    public void factorialTruePositive(){
        Map<String,Object> payload = new HashMap();
        payload.put("input1",(Object) new String("5"));

        Map<String,Object> payload2 = new HashMap();
        payload2.put("input1",(Object) new String( "3"));

        assertEquals("Natural log of number for True Positive", 120, calculator.fact(payload), DELTA);
        assertEquals("Natural log of number for True Positive", 6, calculator.fact(payload2), DELTA);

    }

    @Test
    public void factorialFalsePositive(){
        Map<String,Object> payload = new HashMap();
        payload.put("input1",(Object) new String("5"));

        Map<String,Object> payload2 = new HashMap();
        payload2.put("input1",(Object) new String( "3"));
        assertNotEquals("Natural log of number for False Positive", 6, calculator.fact(payload), DELTA);
        assertNotEquals("Natural log of number for False Positive", 9, calculator.fact(payload2), DELTA);
    }
}
