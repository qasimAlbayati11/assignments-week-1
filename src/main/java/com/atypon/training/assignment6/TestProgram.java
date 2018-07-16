package com.atypon.training.assignment6;

import java.util.Scanner;

/**
 * Created by Qasim albayati on 7/15/2018.
 */

public class TestProgram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //get number 1
        System.out.println("please enter first integer :");
        int number1 = scanner.nextInt();

        //get number 2
        System.out.println("please enter second integer :");
        int number2 = scanner.nextInt();

        //get operator
        System.out.println("please enter one of these operators (*,/,*,-) :");

        /*
        * String reading instead of char reading to ensure that the entered value is single char.
        * because user may enter /*-+ or -- or ++ and the program gonna read the first
        * char as a correct operator in case of reading as a char.
        */
        String operator = scanner.next();

        //check operator and ask for new one if it wasn't correct
        while (!"/*+-".contains(operator) || operator.length() > 1) {
            if (operator.equals("Z")) {
                System.out.println("Program stopped !");
                return;
            } else {
                System.out.println("incorrect operator please enter a new one !");
                operator = scanner.next();
            }
        }

        double result = 0.0;
        switch (operator.charAt(0)) {
            case '+':
                result = number1 + number2;
                break;
            case '/':
                result = number1 / number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '-':
                result = number1 - number2;
                break;
        }

        System.out.println(number1+" "+operator+" "+number2+" = "+result);
    }


}

