package ru.PolukarovIvan.lab_18;

public class Test {
    public static void main(String[] args) {
        ExceptionDemo zeroDivision = new ExceptionDemo();
        try{
            zeroDivision.run();
            System.out.println("That shouldn't be printed");
        } catch (ArithmeticException ex){
            System.out.println("Caught: " + ex.getMessage());
        }
        finally{
            System.out.println("This is finally block after ArithmeticException");
        }

    }
}
