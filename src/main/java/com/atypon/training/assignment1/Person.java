package com.atypon.training.assignment1;

/**
 * Created by Qasim albayati on 7/15/2018.
 */
public class Person {

    private String name ;

    public Person() {
        System.out.println("Constructor running!");
    }

    public Person(String name){
        this.name = name ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void writeName(){
        if(name == null){
            System.out.println("UNKNOWN PERSON");
            return;
        }

        System.out.println("My name is: "+name);
    }


}
