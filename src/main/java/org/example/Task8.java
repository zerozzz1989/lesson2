package org.example;

public class Task8 {
    public static void main(String[] args) {
        for (int i = 1; i <= 101; i++) {
            if ((i % 5 == 0) || (i % 3 == 0)) {   //які діляться на 3 або на 5. Символ || це або. Символ && це як і.
                if (i % 2 > 0) {                    //але не діляться на 2
                    System.out.print(i);

                } else {
                        System.out.print(" ");
                    }


                    }

                }
            }
        }



/*
Print all the numbers from 1 to 100 that are divisible by 3 or divisible by 5, but not divisible by 2.

Виведіть усі числа від 1 до 100, які діляться на 3 або на 5, але не діляться на 2.
 */