package ru.PolukarovIvan.lab_31;

import org.junit.Test;
import ru.PolukarovIvan.lab_27.ex1.Calculator;

import static org.junit.Assert.assertEquals;

public class Tests {



    @Test(expected = ArithmeticException.class)
    public void calculationsTest1() throws Exception {
        Calculator.run("30/");
    }
    @Test()
    public void calculationsTest2(){
        try {
            assertEquals("\'34+2*1+\' should be equal 15", Calculator.run("34+2*1+"), "15");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test()
    public void calculationsTest3(){
        try {
            assertEquals("\'34*\' should be equal 12", Calculator.run("34*"), "12");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test()
    public void calculationsTest4(){
        int number = 3;
        assertEquals(String.valueOf(3) + " should be odd", String.valueOf(number % 2), "0");
    }


}