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

