package com.revature;

import java.util.Scanner;

public class ConversionJan4 {

    public static void main(String[] args) {
        System.out.println("What is the area of rectangle?");
        System.out.print("Width: ");
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();
        System.out.print("Height: ");
        sc = new Scanner(System.in);
        int height = sc.nextInt();
        System.out.println("Rectangle area is " + width*height);

        System.out.println("What is the parameter of rectangle?");
        System.out.print("Height: ");
        sc = new Scanner(System.in);
        height = sc.nextInt();
        System.out.print("width: ");
        sc = new Scanner(System.in);
        width = sc.nextInt();
        System.out.println("Rectangle parameter is " + ((height*2)+(width*2)));

        System.out.println("What is the area of triangle?");
        System.out.print("Height: ");
        sc = new Scanner(System.in);
        height = sc.nextInt();
        System.out.print("Base: ");
        sc = new Scanner(System.in);
        double base = sc.nextDouble();
        System.out.println("Triangle area is " + height*base/2);

        System.out.println("What is the parameter of triangle?");
        System.out.print("a side: ");
        sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("b side: ");
        sc = new Scanner(System.in);
        int b = sc.nextInt();
        System.out.print("c side: ");
        sc = new Scanner(System.in);
        int c = sc.nextInt();
        System.out.println("Triangle parameter is " + (a+b+c));

        System.out.println("What is the area of circle?");
        sc = new Scanner(System.in);
        System.out.print("Radius: ");
        int radius = sc.nextInt();
        System.out.println("Circle area is " + radius * radius* 3.14);

        System.out.println("What is the parameter of circle?");
        sc = new Scanner(System.in);
        System.out.print("Radius: ");
        radius = sc.nextInt();
        System.out.println("Circle parameter is " + 2 * radius* 3.14);

        System.out.println("What is Fahrenheit?");
        sc = new Scanner(System.in);
        System.out.print("Celcius: ");
        int celcius = sc.nextInt();
        System.out.println("Fahrenheit is " + ((celcius/5*9) + 32));

        System.out.println("What is Celcius?");
        sc = new Scanner(System.in);
        System.out.print("Fahrenheit: ");
        int fahrenheit = sc.nextInt();
        System.out.println("Celcius is " + ((fahrenheit - 32)*5/9));

        System.out.println("What is the conversion from inches to centimeter?");
        sc = new Scanner(System.in);
        System.out.print("Inches: ");
        double inches = sc.nextDouble();
        System.out.println("Centimeter is " + (inches*2.54));

        System.out.println("What is the conversion from centimeter to inches?");
        sc = new Scanner(System.in);
        System.out.print("Centimeter: ");
        double centimeter = sc.nextDouble();
        System.out.println("Inches is " + (centimeter/2.54));
    }
}
