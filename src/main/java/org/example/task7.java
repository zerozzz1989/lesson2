package org.example;
import java.util.Arrays;

public class task7 {

    public static void main(String[] args) {
        int[] intArray = {4, 5, 0, -2, 5};

        Arrays.sort(intArray);

        System.out.println("intArray after sorting: " + Arrays.toString(intArray));

        int maxNum = intArray[intArray.length - 1];
        int lestNum = intArray[intArray.length - 3];
        //  int d = lestNum < maxNum;
        System.out.println("Maximum number = " + maxNum);
        System.out.println("Second number = " + lestNum);
    }
}