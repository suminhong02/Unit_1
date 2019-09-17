package com.company;

import java.util.Scanner;

public class PoundsToKilograms {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the weight in pounds to convert it into kilograms");
        double Ibs = scan.nextInt();
        final double kg = Ibs/2.205;
        System.out.println(Ibs+" pounds = " +kg+" kilograms");

    }
}
