package com.company;

import java.util.Scanner;

public class RoundTenth {

    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Decimal number? ");
        double value1 = scan.nextDouble();
        double value2 = value1*10;
        int value3 = (int)(value2+0.5);
        double value4 = value3/10.0;
        System.out.println(value1+ " rounded to the nearest tenth is " +value4);



    }
}
