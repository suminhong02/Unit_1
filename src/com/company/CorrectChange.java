package com.company;
/*Sumin Hong
9/24/2019
To read change from a user (in cents) and write out how many dollars, quarters, dimes, nickels, and pennies that one is due.
 */
import java.util.Scanner;

public class CorrectChange {
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a whole number of cents");
        int wholeNumOfCents = scan.nextInt();
        int numOfDollars = wholeNumOfCents/100;
        int remainderNumOfDollars = wholeNumOfCents%100;
        int numOfQuarters = remainderNumOfDollars/25;
        int remainderNumOfQuarters = remainderNumOfDollars%25;
        int numOfDimes = remainderNumOfQuarters/10;
        int remainderNumOfDimes = remainderNumOfQuarters%10;
        int numOfNickels = remainderNumOfDimes/5;
        int remainderNumOfNickels = remainderNumOfDimes%5;
        int numOfPennies = remainderNumOfNickels/1;
        System.out.println("You have "+numOfDollars+ " dollars, "+numOfQuarters+" quarters, "+numOfDimes+" dimes, "+numOfNickels+" nickels, "+numOfPennies+" pennies.");

    }
}
