package org.example;
import java.util.Scanner;



import static java.lang.System.in;
import static org.example.Task2.getString;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("a)");
        System.out.println("Enter number to a)");
        double a;
        a = Double.parseDouble(getString());

        for (int i = 0; i < a; i++) {    //висота
            for (int j = 0; j < 8; j++) {    //ширина
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.println("b)");
        try (Scanner tru = new Scanner(in)) {
            int count = 8;
            for (int o = 0; o < 5; o++) {
                for (int k = 0; k < count; k++) {
                    if (k == 0 || k == count - 1 || o == 0 || o == 5 - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println(" ");
            }

            System.out.println("c)");
            System.out.println("Enter number to d)");
            double с;                               //перемена
            с= Double.parseDouble(getString());     //вводимо число з консолі
            for (int i = 0; i < с; i++)  //висота
            {
                for (int j = 0; j <= i; j++) //додає по одному на кожну строку
                {
                    System.out.print("*");
                }
                System.out.print("\n");
            }

            System.out.println("d)");
            System.out.println("Enter number to d)");
            double n;                               //перемена
            n= Double.parseDouble(getString());     //вводимо число з консолі
            for (int i = 1; i <= n; i++) {    //висота
                for (int j = i; j <= n; j++) {    //ширина
                    System.out.print(" ");
                }
                for (int j = 1; j < i; j++) {
                        System.out.print("*");
                    }
                    for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                }
            }
        }

   /*
   Create a program that print to the console following figures. Use loops, asterisks("*") and spaces (" ").

   Я тут трохи погрався)
   */



