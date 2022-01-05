package com.revature.calculator;

class Happy{
    int hap = 1;
}

public class Main {

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.num1 = 2;
        cal.num2 = 4;
        System.out.println("total is " + cal.add());
        cal.num1 = 5;
        cal.num2 = 4;
        System.out.println("total is " + cal.add());
        Happy hap = new Happy();
        System.out.println(hap.hap);
    }
}
