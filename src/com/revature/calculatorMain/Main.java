package com.revature.calculatorMain;

import com.revature.calculator.Calculator;

public class Main {

    public static void main(String[] args) {
        Calculator.defaultNum = 555;
        Calculator cal1 = new Calculator();
        cal1.setNum1(2);
        cal1.setNum2(4);
        Calculator cal2 = new Calculator();
        cal2.setNum1(5);
        cal2.setNum2(4);
        System.out.println("total is " + cal1.add());
        System.out.println("total is " + cal2.add());
        System.out.println("static default number is " + cal1.defaultNum);
        System.out.println("static default number is " + Calculator.defaultNum);
    }
}
