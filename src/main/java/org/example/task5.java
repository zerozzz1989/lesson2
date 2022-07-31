package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task5 {

    public static void main(String[] args) {

    //    public static void main(String[] args) {
      //  double a;
        double a;

        System.out.print("enter a number: ");
        a = Double.parseDouble(getString());

        System.out.println("factorial of an integral value " + a + " is: " + factorial((int) a));
    }

    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        return fact;

    }
    public static String getString() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            return br.readLine();
        }
        catch (IOException ex) {
            System.out.println("I/O Error!");
        }
        return null;
    }
}