package ru.PolukarovIvan.lab_25.ex3;

import java.util.regex.Pattern;

public class Ipv4Check {

    private static Pattern pattern = Pattern.compile("^((\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])(\\.(?!$)|$)){4}$");

    public static boolean isValid(String ipv4){
        return pattern.matcher(ipv4).find();
    }

}
