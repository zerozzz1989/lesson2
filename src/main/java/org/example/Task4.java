package lesson2;
import java.lang.Math;
public class Task4 {

    public static void main(String[] args) {
        int[] myArray = {25, 16, 9, 114, 24, 36, 72, 78, 45, 13}; // обявляємо масив
        int[] myArray2 = new int[myArray.length]; // обявляємо масив

        for (int i=0; i < myArray.length; i++) {
            myArray2[i] = (int) Math.sqrt(myArray[i]);

            System.out.println(myArray2[i]);
        }
    }
}

/*
//щось ти в 4му завданні фігню якусь написав. Тобі треба створити 1 масив з числами. Створити другий масив такої ж довжини.
// Потім в циклі знаходити корінь квадратний кожного елемента і записувати відразу в новий масив

 Create two arrays of 10 integers. Find the square root of each element in the first array and
put the result of it to the second array. Print second array to the console.
 */

