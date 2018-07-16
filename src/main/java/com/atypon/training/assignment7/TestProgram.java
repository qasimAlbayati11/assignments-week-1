package com.atypon.training.assignment7;


/**
 * Created by Qasim albayati on 7/15/2018.
 */
public class TestProgram {

    public static void main(String[] args) {

        TestProgram test = new TestProgram() ;

        if(args.length == 1){

        }else if(args.length == 2){

        }else if(args.length == 3){

        }

        test.print(155);
        System.out.println("---------");

        test.print("hello world");
        System.out.println("---------");

        test.print(12 , 5);
        System.out.println("---------");

        test.print(8 , 5 , 4);
    }


    public void print(int x){
        System.out.println("this is integer "+x);
    }

    public void print(String x){
        System.out.println("this is String "+x);
    }

    public void print(int x , int y){
        String out = "" ;

        for (int i = 1; i <= y ; i++) {
            out = out+x ;
        }

        System.out.println(out);
    }

    public void print(int x , int y , int z){
        for (int i = 1; i <=z ; i++) {
            //using the print(x,y) method rather than reimplement its same code
            print(x , y);
        }
    }


}
