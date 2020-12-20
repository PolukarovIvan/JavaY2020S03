package ru.PolukarovIvan.lab_27.ex1;

public class SimpleOp {

    protected static boolean validCheck(String a, String b, String op) {
        return a.matches("-*?\\d*?") && b.matches("-*?\\d*?") && op.matches("-*?\\d]*?");
    }

    protected static int calculate(String a, String b, String op) throws Exception {
        switch (op) {
            case "+":
                return Integer.parseInt(a) + Integer.parseInt(b);
            case "-":
                return Integer.parseInt(a) - Integer.parseInt(b);
            case "*":
                return Integer.parseInt(a) * Integer.parseInt(b);
            case "/":
                if (Integer.parseInt(b) != 0) {
                    return Integer.parseInt(a) / Integer.parseInt(b);
                } else {
                    throw new ArithmeticException("Zero Division");
                }
            default:
                throw new Exception("Undefined Operator");
        }

    }
}