package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class SimpleCalc {
    double x;
    double y;
    double answer;


    public void BasicCalc() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Would you like to: " + "\n 1)" +
                " Add" + "\n 2) Subtract" + "\n 3) Mulitply" + "\n 4) Divide" + "\n 5) Exit");

    }



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







            }







