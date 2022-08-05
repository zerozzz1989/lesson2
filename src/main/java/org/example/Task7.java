package org.example;
import java.util.Arrays;

public class Task7 {

    public static void main(String[] args) {
        int[] intArray = {4, 5, 0, -2, 5, 4, 7, 8, 9, 22};

        int sum = 0;
        for (int i = 1; i < intArray.length-1; i++) {           //int i = 1 починаэмо не з першого числа, i < intArray.length-1; закынчуємо не останнім
            sum = sum + intArray[i];
        }
        System.out.println(sum);


    }
}

