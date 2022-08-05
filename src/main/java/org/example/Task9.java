package org.example;

public class Task9 {
    public static void main(String[] args) {
        System.out.println("a)");
        for (int i = 1, a = 4; i <= 5; i++, a--) {    //висота
            for (int j = a; j > 0; j--) {    //ширина
                System.out.print(" ");
            }
            System.out.print("*****\n");
        }
    }
}