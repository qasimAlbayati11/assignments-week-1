package com.atypon.training.assignment5;

/**
 * Created by Qasim albayati on 7/15/2018.
 */
public class TestProgram {

    public static void main(String[] args) {


        //print eight's via nested for loop
        for (int i = 1; i <= 11; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("8");
            }
            System.out.println("");
        }

        System.out.println("--------------");


        //print eight's via nested while loop
        int i = 1;
        while (i <= 11) {

            int j = 1;
            while (j <= i) {
                System.out.print("8");
                j++;
            }

            System.out.println("");
            i++;
        }


        System.out.println("--------------");


        //print Odd eight's via nested for loop
        for (int k = 1; k <= 11; k++) {

            //skip if the line is even
            if (k % 2 == 0) {
                System.out.println("");
                continue;
            }

            for (int j = 1; j <= k; j++) {
                System.out.print("8");
            }

            System.out.println("");
        }

        System.out.println("--------------");


        //print Odd eight's via nested while loop
        int k = 1;
        while (k <= 11) {

            //skip if the line is even
            if (k % 2 == 0) {
                System.out.println("");
                k++;
                continue;
            }

            int j = 1;
            while (j <= k) {
                System.out.print("8");
                j++;
            }
            System.out.println("");
            k++;
        }

    }
}
