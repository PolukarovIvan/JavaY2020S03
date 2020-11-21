package ru.PolukarovIvan.lab_19.ex1;

import java.util.Scanner;

public class InnChecker {
    public static void run() {
        System.out.println("Enter Your First Name Second name and INN: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String[] data = str.split(" ");
        char[] INN = data[2].toCharArray();
        try {
            if (INN.length != 10){
                throw (new Exception());
            }
            for (int i=0;i<INN.length;i++){
                if ((i == 0) && (INN[i]=='0')){
                    throw (new Exception());
                }
                if ((INN[i]<'0') && (INN[i]>'9')){
                    throw (new Exception());
                }
            }
            System.out.println("Good!");
        } catch (Exception exe) {
            System.out.println("Wrong INN!");
        }
    }
}