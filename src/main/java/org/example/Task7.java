package org.example;
import java.util.Arrays;

public class Task7 {

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

//7е, те що з двома максимальними:
//1 - зробити треба без сортування
//2 - без підрахунку елементів, тобто, наразі ти знаєш які елементи в масиві і саме тому вказав після сортування, що другий максимум буде останній -2.
// Це чітерство знову ж) роби так, щоб код працював для будь якого набору значень