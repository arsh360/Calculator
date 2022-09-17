package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome!");
        Scanner in =new Scanner(System.in);
        int ans = 0;

        while (true){
            System.out.println("Enter the operator");
            char op = in.next().trim().charAt(0);
            if (op == '+'|| op == '-'|| op == '*'|| op == '/'|| op == '%'){
                System.out.println("enter the numbers");
                int a = in.nextInt();
                int b = in.nextInt();



                if (op=='+'){
                    ans = a+b;
                }

                if (op=='-'){
                    ans = a-b;
                }

                if (op=='*'){
                    ans = a*b;
                }

                if (op=='/'){
                    if (b!=0) {
                        ans = a / b;
                    }
                }

                if (op=='%'){
                    ans = a%b;
                }

                else if (op=='x'||op=='X'){
                    break;
                }
                else {
                    System.out.println("Invalid operation");
                }

            }
            System.out.println("Your answer is " +ans);
        }


    }
}
