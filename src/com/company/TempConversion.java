package com.company;

import java.util.Scanner;

public class TempConversion {

    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit in order to convert it into Celsius.");
        double Fahrenheit = scan.nextInt();
        final double Celsius = (Fahrenheit-32)*5.0/9.0;
        System.out.println(Fahrenheit+"°F = "+Celsius+"°C");
    }
}
