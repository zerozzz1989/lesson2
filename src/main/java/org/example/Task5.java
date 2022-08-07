package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5 {


    static int factorial(int n){
        if (n == 0)
            return 1;
        else
            return(n * factorial(n-1));
    }
    public static void main(String args[]){
        int i,fact=1;

        int number=10;
        fact = factorial(number);
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}

/*    Create a program that calculates the factorial of an integer value n.
 */