package com.company;

import java.util.Scanner;

public class CorrectChange {
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a whole number of cents");
        int wholenumofcents = scan.nextInt();
        int numofdollars = wholenumofcents/100;
        int remaindernumofdollars = wholenumofcents%100;
        int numofquarters = remaindernumofdollars/25;
        int remaindernumofquarters = remaindernumofdollars%25;
        int numofdimes = remaindernumofquarters/10;
        int remaindernumofdimes = remaindernumofquarters%10;
        int numofnickels = remaindernumofdimes/5;
        int remaindernumofnickels = remaindernumofdimes%5;
        int numofpennies = remaindernumofnickels/1;
        System.out.println("You have "+numofdollars+ "dollars, "+numofquarters+"quarters, "+numofdimes+"dimes, "+numofnickels+"nickels, "+numofpennies+"pennies.");

    }
}
