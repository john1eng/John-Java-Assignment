package com.revature.calculator;

public class Calculator{
    private int num1;
    private int num2;
    public static int defaultNum;

    public void setNum1(int num1) {
        if(num1<0)
            this.num1=0;

        this.num1 = num1;
    }

    public void setNum2(int num2) {
        if(num2<0)
            this.num2=0;

        this.num2 = num2;
    }

    public int add(){
        return num1+num2;
    }
}

