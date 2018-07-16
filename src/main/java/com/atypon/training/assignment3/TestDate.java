package com.atypon.training.assignment3;

/**
 * Created by Qasim albayati on 7/15/2018.
 */
public class TestDate {

    public static void main(String[] args) {

        Date date = new Date(23, 11, 1993);

        date.displayDate();

        date.setDay(11);
        date.setMonth(4);
        date.setYear(1995);

        System.out.println(date.getDay() + "-" + date.getMonth() + "-" + date.getYear());

    }

}
