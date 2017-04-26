/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicToTest;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author gta1
 */
public class CalculatorTest {

    public CalculatorTest() {
    }

    //Write a test to check if the Calculator can do addition
    @Test
    public void testAdd() {
        //Arrange
        Calculator instance = new Calculator();

        //Add
        int x = 3;
        int y = 6;
        int expectedResult = x + y;

        //Assert
        int result = instance.add(x, y);
        Assert.assertEquals(expectedResult, result);
    }

    //Write a test to check if the Calculator can do substraction
    @Test
    public void testSubstract() {
        Calculator instance = new Calculator();

        int x = 6;
        int y = 3;
        int expectedResult = x - y;

        int result = instance.substract(x, y);
        Assert.assertEquals(expectedResult, result);
    }

    //Write a test to check if the Calculator can do division
    @Test
    public void testDivide() {
        Calculator instance = new Calculator();

        int x = 10;
        int y = 0;
        int expectedResult = x / y;

        int result = instance.divide(x, y);
        Assert.assertEquals(expectedResult, result);
    }

    //Write a test to check if the Calculator can do multiplication
    @Test
    public void testMultiplicate() {
        Calculator instance = new Calculator();

        int x = 10;
        int y = 5;
        int expectedResult = x * y;

        int result = instance.multiplicate(x, y);
        Assert.assertTrue(expectedResult == result);
    }
}
