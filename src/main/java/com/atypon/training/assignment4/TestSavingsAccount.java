package com.atypon.training.assignment4;

/**
 * Created by Qasim albayati on 7/15/2018.
 */
public class TestSavingsAccount {

    public static void main(String[] args) {

        SavingsAccount saver1 = new SavingsAccount() ;
        saver1.setSavingsBalance(2000.00);

        SavingsAccount saver2 = new SavingsAccount() ;
        saver2.setSavingsBalance(3000.00);

        SavingsAccount.modifyInterestRate(0.04);

        saver1.calculateMonthlyInterest() ;
        System.out.println("current month saving balance for saver1 : "+saver1.getSavingsBalance());

        saver2.calculateMonthlyInterest() ;
        System.out.println("current month saving balance for saver2 : "+saver2.getSavingsBalance());

        System.out.println("----------------");

        SavingsAccount.modifyInterestRate(0.05);

        saver1.calculateMonthlyInterest() ;
        System.out.println("next month saving balance for saver1 : "+saver1.getSavingsBalance());

        saver2.calculateMonthlyInterest() ;
        System.out.println("next month saving balance for saver2 : "+saver2.getSavingsBalance());

    }

}
