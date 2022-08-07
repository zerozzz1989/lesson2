package org.example;

public class Task3 {
    public static void main(String[] args) {

        double [] myArray = new double[10]; // обявляємо масив

          for (int index = 1; index<myArray.length; index++) {    //виводимо з указаного числа
              myArray[index]=index;
            System.out.println("print numbers without zero: " + myArray[index]);                 //виводимо числа
        }
        System.out.println("array length: " + myArray.length); // виводимо довжину масиву

    }
}

/*    Create an array of 10 integers. Fill this array using for-loop with random numbers.
Print all the elements of this array to the console. Each element from the new line
 */