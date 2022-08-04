package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) {
        double a;
        double b;
        double d;

        System.out.print("length: ");
        a = Double.parseDouble(getString());

        System.out.print("width: ");
        b = Double.parseDouble(getString());

        System.out.print("radius: ");
        d = Double.parseDouble(getString());

        double sum = a*b;
        System.out.println("area rectangle : " + sum);

        double sum2 = Math.PI * (d * d);
        System.out.println("area circle : " + sum2);
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

