package ru.PolukarovIvan.lab_08.ex2;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        File file = new File(args[0]);

        File[] a = file.listFiles();

        for (File tmp_file : a){
            System.out.println(args[0] + tmp_file.getName());
        }

        new ImageTest(args[0] + a[0].getName()); //C:\Право\Скан_20200516.jpg
        System.out.println(a[0].getName());
    }
}
