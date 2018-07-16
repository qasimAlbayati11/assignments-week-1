package com.atypon.training.assignment10;

/**
 * Created by Qasim albayati on 7/15/2018.
 */
public class TestProgram {

    public static void main(String[] args) {

        if(args.length == 0){
            System.out.println("Input Wrong !");
            return;
        }

        String line = "" ;
        int helloCounter = 0 ;

        for (String word : args) {
            if(word.equals("Hello")){
                System.out.println("\"Hello\" appears at index: "+line.length());
                helloCounter++ ;
            }
            line = line+word+" " ;
        }

        System.out.println("\"Hello\" appears "+helloCounter+( (helloCounter == 1) ? " time" : " times"));

        if(line.contains("h")) {
            System.out.println("replace 'h' with '*' : " + line.trim().replace("h", "*"));
        }else{
            System.out.println("the line doesn't contain 'h'");
        }
    }


}
