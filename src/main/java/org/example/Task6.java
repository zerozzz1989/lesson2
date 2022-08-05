package org.example;
import java.util.Scanner;


import static java.lang.System.in;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("a)");
        for (int i = 0; i < 8; i++) {    //висота
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
            for (int i = 0; i < 7; i++)  //висота
            {
                for (int j = 0; j <= i; j++) //додає по одному на кожну строку
                {
                    System.out.print("*");
                }
                System.out.print("\n");
            }

            System.out.println("d)");
            int n = 5;
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





