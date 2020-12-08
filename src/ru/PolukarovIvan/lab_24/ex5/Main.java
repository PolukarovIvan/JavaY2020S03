package ru.PolukarovIvan.lab_24.ex5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];

        BufferedReader reader = new BufferedReader(new FileReader(fileName));

        String [] words = reader.readLine().split(" ");
        System.out.println(Arrays.toString(words));

        StringBuilder result = run(words);
        System.out.println(result.toString());
        reader.close();

    }

    public static StringBuilder run(String[] words) {
        StringBuilder stringBuilder = new StringBuilder();
        if (words.length == 0) return stringBuilder;
        for (String s : words) {
            if (firstLetterMatch(s, new ArrayList<String>(Arrays.asList(words)), stringBuilder)) break;
        }
        return stringBuilder;
    }

    public static boolean firstLetterMatch(String current, ArrayList<String> possibilities, StringBuilder result) {
        ArrayList<String> nextPossibilities = new ArrayList<>(possibilities);
        if (nextPossibilities.size() == 1) {
            result.append(current);
            return true;
        }
        nextPossibilities.remove(current);

        for (String next : nextPossibilities) {
            if (next.toLowerCase().substring(0, 1).equals(current.toLowerCase().substring(current.length() - 1))) {
                if (firstLetterMatch(next, nextPossibilities, result)) {
                    result = result.insert(0, current + " ");
                    return true;
                }
            }
        }

        return false;
    }
}