package org.example;
import java.lang.Math;

public class Task4 {

    public static int sqrt(int x)
    {
        int i = 1;
        while (i*i <= x) {
            i++;
        }

        return i - 1;
    }

    public static void main(String[] args)
    {

        for (int i = 0; i <= 10; i++) {
            System.out.printf("sqrt(%d) = %d\n", i, sqrt(i));
        }
    }
}


//щось ти в 4му завданні фігню якусь написав. Тобі треба створити 1 масив з числами. Створити другий масив такої ж довжини.
// Потім в циклі знаходити корінь квадратний кожного елемента і записувати відразу в новий масив

/*    Create two arrays of 10 integers. Find the square root of each element in the first array and
put the result of it to the second array. Print second array to the console.
 */

