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
            for (int i = 0; i < 5; i++) {
                for (int k = 0; k < count; k++) {
                    if (k == 0 || k == count - 1 || i == 0 || i == 5 - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println(" ");
            }
            System.out.println("c)");
            try (Scanner pig = new Scanner(in)) {
                int tir = 7;
                for (int i = 0; i < 7; i++) {
                    for (int k = 0; k < tir; k++) {
                        if (k == 0 || k == tir - 1 || i == 0 || i == 7 - 1) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println(" ");
                }
            }
        }
    }
}
               //    System.out.print("\n");



//переробити за допомогою циклів

