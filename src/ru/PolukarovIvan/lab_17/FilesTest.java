package ru.PolukarovIvan.lab_17;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class FilesTest {
    public static void main(String[] args) {

        String stringToWrite = "Abraham\nIvan\nKsenia\nAlexey Navalny\n";
        String stringToAppend = "\nString to append!";

        //file writing
        try (FileWriter writer = new FileWriter("testFile.txt", false)) {
            writer.write(stringToWrite);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //file reading
        try(FileReader reader = new FileReader("testFile.txt"))
        {
            char[] buf = new char[256];
            int c;
            while((c = reader.read(buf))>0){

                if(c < 256){
                    buf = Arrays.copyOf(buf, c);
                }
                System.out.print(buf);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        //file appending
        try (FileWriter writer = new FileWriter("testFile.txt", true)) {
            writer.append(stringToAppend);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //file reading
        try(FileReader reader = new FileReader("testFile.txt"))
        {
            char[] buf = new char[256];
            int c;
            while((c = reader.read(buf))>0){

                if(c < 256){
                    buf = Arrays.copyOf(buf, c);
                }
                System.out.print(buf);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }



    }
}
