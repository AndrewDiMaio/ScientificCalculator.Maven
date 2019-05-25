package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class SimpleCalc {
    double x;
    double y;
    double answer;
    //int operator;

    public void BasicCalc() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Would you like to: " + "\n 1)" +
                " Add" + "\n 2) Subtract" + "\n 3) Mulitply" + "\n 4) Divide" + "\n 5) Exit");

    }


        /*if (operator == 5){
            return;
            }
        else {

            System.out.println("Please enter the first number. ");
            x = scan.nextDouble();

            System.out.println("Please enter the second number");
            y = scan.nextDouble();
*/
        public double getAddition(double x, double y){
            answer = x + y;
            return answer;
        }

        public double getSubtraction(double x, double y) {
            answer = x - y;
            return answer;
        }

        public double getMultiplication(double x, double y) {
            answer = x * y;
            return answer;
        }

        public double getDivision(double x, double y) {
            answer = x / y;
            return answer;
        }






            /*switch (operator) {
                case 1:
                    answer = x + y;
                    System.out.println(x + " + " + y + " = " + answer);
                    break;
                case 2:
                    answer = x - y;
                    System.out.println(x + " - " + y + " = " + answer);
                    break;
                case 3:
                    answer = x * y;
                    System.out.println(x + " * " + y + " = " + answer);
                    break;
                case 4:
                    answer = x / y;
                    if (y == 0) {
                        System.out.println("You can't divide by zero.  Try again.");
                    } else {
                        System.out.println(x + " / " + y + " = " + answer);
                    }
                    break;

             */
            }







