package org.example;
import java.lang.Math;

public class Task4 {

    public static int sqrt(int x)
    {
        // find the first positive number `i` such that `i×i` is greater than `x`
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
    // driver code
   // public static void main(String args[]) {
       //  double[] myArray = new double[10]; // обявляємо масив
        // double [] myArray2 = new double[10]; // обявляємо масив

     //   double inin=Math.sqrt(myArray);

       // for (int index = 1; index < myArray.length; index++) {    //виводимо з указаного числа
       //     myArray[index] = index;
      //      System.out.println("print numbers without zero: " + inin);                 //виводимо числа

       // System.out.println("z = " + z[index]);
       // double x = 9;
      //  double z=Math.sqrt(x);
       // System.out.println("z = " + z);


      //  }
   // }

//щось ти в 4му завданні фігню якусь написав. Тобі треба створити 1 масив з числами. Створити другий масив такої ж довжини.
// Потім в циклі знаходити корінь квадратний кожного елемента і записувати відразу в новий масив

