package com.company;

import java.util.Scanner;

public class TotalWithTax {
    public static void main(String [] args) {

        Scanner scan = new Scanner(System.in);
        final double TAXRATE = 0.0825;
        System.out.println("Enter the price of product.");
        double price = scan.nextInt();
        double tax = TAXRATE * price;
        double totalcost = price + tax;
        System.out.println("Price: $"+price);
        System.out.println("Sales Tax: $" +tax);
        System.out.println("Total: $" +totalcost);

    }
}
