package com.company;

import java.util.Scanner;

public class AddOneTakeOne {

    public static void main(String [] args)
    {
     Scanner scan= new Scanner(System.in);
     System.out.print("Enter a number: ");
     int number1 = scan.nextInt();
     int number2 = number1--;
     int number3 = number2++;

     System.out.println(number1+" "+number3+" "+number2);


    }
}
