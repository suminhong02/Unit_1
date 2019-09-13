package com.company;

public class Painting {

    public static void main(String[] args) {
        int length = 40;
        int width = 32;
        int height = 16;
        int area_of_door = 20;
        int area_of_window = 15;
        int number_of_doors = 2;
        int number_of_windows = 4;
        int area_of_wall1 = length*height;
        int area_of_wall2 = width*height;
        int area_of_ceiling = width*length;
        double total_surface_area = area_of_wall1*2 + area_of_wall2*2 + area_of_ceiling - (area_of_door*number_of_doors + area_of_window*number_of_windows);
        double total_gallon = total_surface_area/350;
        System.out.println ("You will need "+total_gallon+" gallons of paint");
    }
}
