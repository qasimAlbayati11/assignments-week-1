package com.atypon.training.assignment4;

/**
 * Created by Qasim albayati on 7/15/2018.
 */
public class SavingsAccount {

    public static double annualInterestRate  ;
    private double savingsBalance ;

    public SavingsAccount(){}

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public void calculateMonthlyInterest(){
        double monthlyInterest =  savingsBalance*annualInterestRate/12 ;
        savingsBalance = savingsBalance+monthlyInterest ;
    }

    public static void modifyInterestRate(double interest){
        annualInterestRate = annualInterestRate+interest ;
    }

}
