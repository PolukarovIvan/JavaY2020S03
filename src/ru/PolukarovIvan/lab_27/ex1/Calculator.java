package ru.PolukarovIvan.lab_27.ex1;

import java.util.Stack;

public class Calculator extends SimpleOp {
    private static Stack<String> stack = new Stack();

    public Calculator(String data) {

    }

    private static void step() throws Exception {

        String first = stack.pop();
        String second = stack.pop();
        String op = stack.pop();
        stack.add(String.valueOf(SimpleOp.calculate(first, second, op)));
    }


    public static String run(String data) throws Exception {

            for (int i = data.length(); i > 0; i--) {
                stack.add(data.substring(i - 1, i));
            }
           // System.out.println("Stack condition: " + stack.toString());


            while (stack.size() > 1) {
                step();
            }
            return stack.pop();

    }
}