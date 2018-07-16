package com.atypon.training.assignment8;

/**
 * Created by Qasim albayati on 7/15/2018.
 */
public class TestProgram {

    public static void main(String[] args) {
        TestProgram test = new TestProgram();

        switch (args.length) {
            case 1:
                try {
                    int x = Integer.parseInt(args[0]);
                    test.print(x);
                } catch (NumberFormatException e) {
                    test.print(args[0]);
                }
                break;

            case 2:
                try {
                    int x = Integer.parseInt(args[0]);
                    int y = Integer.parseInt(args[1]);
                    test.print(x, y);
                } catch (NumberFormatException e) {
                    System.out.println("Input is Wrong !");
                }
                break;

            case 3:
                try {
                    int x = Integer.parseInt(args[0]);
                    int y = Integer.parseInt(args[1]);
                    int z = Integer.parseInt(args[2]);
                    test.print(x, y, z);
                } catch (NumberFormatException e) {
                    System.out.println("Input is Wrong !");
                }
                break;

            default: System.out.println("Input is Wrong !");
        }


    }


    public void print(int x) {
        System.out.println("this is integer " + x);
    }

    public void print(String x) {
        System.out.println("this is String " + x);
    }

    public void print(int x, int y) {
        String out = "";

        for (int i = 1; i <= y; i++) {
            out = out + x;
        }

        System.out.println(out);
    }

    public void print(int x, int y, int z) {
        for (int i = 1; i <= z; i++) {
            //using the print(x,y) method rather than reimplement its same code
            print(x, y);
        }
    }

}
