package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
       final Double PI = 3.14;

        System.out.println("Enter a radius for the circle: ");
        double radius = input.nextDouble();
        double area = PI * radius * radius;

        System.out.println("The area of a circle of radius "+ radius + " is: " + Circle.getArea(radius));

    }

}
