package org.example;
import java.util.*;

//import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        //Створюэмо масив випадкових чисел
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + "  ");
        }
        System.out.print("\nSorted: \n");               //"\nSorted: \n" - виводить з нового рядка

        Arrays.sort(arr);                               //сортуємо масив

         for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}


/*
Create an array of any length and fill it with random integers.
Using loops and conditions sort this array and print it out to the console.
You can use any sorting algorithm you want. Do not use build-in methods to sort the array.

Створіть масив будь-якої довжини та заповніть його випадковими цілими числами.
Використовуючи цикли та умови, відсортуйте цей масив і виведіть його на консоль.
Ви можете використовувати будь-який алгоритм сортування. Не використовуйте вбудовані методи для сортування масиву.
 */