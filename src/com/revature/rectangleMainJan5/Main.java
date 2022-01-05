package com.revature.rectangleMainJan5;

import com.revature.rectangleJan5.Rectangle;

public class Main {
    public static void main(String args[]){
        Rectangle rec1 = new Rectangle();
        rec1.setValue(3,4);
        Rectangle rec2 = new Rectangle();
        rec2.setValue(5, 6);

        System.out.println(rec1);
        System.out.println("Area of rectangle 1 is " + rec1.area());
        System.out.println("Parameter of rectangle 2 is " + rec1.parameter());

        System.out.println(rec2);
        System.out.println("Area of rectangle 2 is " + rec2.area());
        System.out.println("Parameter of rectangle 3 is " + rec2.parameter());

    }
}
