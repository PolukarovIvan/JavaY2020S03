package ru.PolukarovIvan.lab_20;


import java.io.File;


public class Files {
    public static void main(String[]args)
    {
        File curDir = new File(".");
        getFive(curDir);
    }
    private static void getFive(File curDir) {

        File[] filesList = curDir.listFiles();

         for(int i = 0; i < 5; i++){
             System.out.println(filesList[i]);
         }

    }
}