package ru.PolukarovIvan.lab_27.ex1;


public class Test {
    public static void main(String[] args) throws Exception {
        String[] data = {
                "34+2*1+",
                "34+",
                "82/",
                "70/",
                "12*",
                "24-",
                "ad/",
                "123/",
                "1//1",
                "12+6*7/3-1+"
        };

        for (int i = 0; i < data.length; i++) {
            try {
                System.out.println(i + ")" + data[i] + " res: " + Calculator.run(data[i]));
            } catch (Exception ex){
                System.out.println(i + ")"+ data[i] + " Can't calculate: " + ex.getMessage());
            }
        }


    }
}
