package ru.PolukarovIvan.lab_25.ex3;

public class ValidTest {
    public static void main(String[] args) {

        String[] ipv4 = {
                "0.0.0.0",
                "0.0.0.8",
                "255.255.255.255",
                "256.255.255",
                "01.23.23.23",
                "234.234.234.234",
                "1111.2123.21321.123213",
                "1.1.1.1"
        };
        for (int i = 0; i < ipv4.length; i++) {
            System.out.println(String.valueOf(i) + ") " + ipv4[i] + " " + String.valueOf(Ipv4Check.isValid(ipv4[i])));
        }
    }
}
