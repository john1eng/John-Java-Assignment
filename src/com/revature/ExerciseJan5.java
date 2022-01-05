package com.revature;

import java.util.Scanner;

public class ExerciseJan5 {
    public static void main(String[] args) {
        //WAP to find biggest of giving 3 numbers using nested if...else
        int n1 = 2;
        int n2 = 10;
        int n3 = 7;
        int biggest;

        if(n1>n2){
            biggest = n1;
        } else if(n2>n3){
            biggest = n2;
        } else {
            biggest = n3;
        }

        System.out.println("the biggest number is " + biggest);

        //Upgrade the demo of while loop with RoI including in the Loan and EMI
        int loan = 10000;
        int emi = 1000;
        int noemi = 1;
        double roi = .15;
        double loanAfterROI = loan * (1+roi);

        while(loanAfterROI>0){
            loanAfterROI = loanAfterROI - emi;
            System.out.println("payment of " + emi + " in " + noemi + " installment.");
            noemi++;
        }

        System.out.println("You are free after " + noemi + " installment.");

        //WAP to display numbers from 1 to n (n – is the range given by the user during the execution) and display even / odd next to each number.
        System.out.print("Enter a number range to find odd or even: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        while(num>0){
            if(num%2==0){
                System.out.println(num + ": even");
            }else{
                System.out.println(num + ": odd");
            }
            num--;
        }

    }

}
