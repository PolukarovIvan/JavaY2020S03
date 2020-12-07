package ru.PolukarovIvan.lab_20;

public class ArrayTest {
    public static void main(String[] args) {

        Integer[] intArr = new Integer[5];

        for (int i = 0; i < 5; i++) {
            intArr[i] = i;
        }


        String[] strArr = new String[3];
        strArr[0] = "Ivan";
        strArr[1] = "Polukarov";
        strArr[2] = "Sergeevich";

        MyArray<Integer> myArrayInt = new MyArray<Integer>(intArr);
        MyArray<String> myArrayString = new MyArray<String>(strArr);

        System.out.println(myArrayInt.get(4));

        myArrayInt.print();
        myArrayString.print();
    }
}
