package com.company;

import java.util.Scanner;

public class RectangleArea {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of Rectangle");
        int length = scan.nextInt();
        System.out.println("Enter the width of Rectangle");
        int width = scan.nextInt();
        final int area = length * width;
        System.out.println("Area of Rectangle = "+area);
    }

}