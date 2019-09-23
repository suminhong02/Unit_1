package com.company;

import java.util.Scanner;

public class RoundNegatives {

    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a negative decimal number: ");
        Double value1 = scan.nextDouble();
        int value2 = (int)(value1-0.5);
        System.out.println(value1+" rounded to a whole number is "+value2);
    }
}
