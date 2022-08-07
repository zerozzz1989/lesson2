package org.example;
import java.util.Arrays;

public class Task7 {

    public static void main(String[] args) {
        int[] intArray = {18, 5, 0, -2, 5, 4, 7, 8, 9, 22};

        int sum = 0;
        for (int i = 1; i < intArray.length-1; i++) {           //int i = 1 починаэмо не з першого числа, i < intArray.length-1; закінчуємо не останнім
            sum = sum + intArray[i];                            //метод підрахунку
        }
        System.out.println(sum);


    }
}

/*
Create an array of 10 integers. Calculate and print the sum of all its elements except the first one and the last one.
 */