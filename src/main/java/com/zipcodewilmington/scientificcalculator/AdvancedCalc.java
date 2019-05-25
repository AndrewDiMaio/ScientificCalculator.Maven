package com.zipcodewilmington.scientificcalculator;
import java.util.Scanner;

public class AdvancedCalc {
    double x;
    double y;
    double answer;
    int operator;

    public void AdvancedCalc() {
        /*Scanner scan = new Scanner(System.in);
        System.out.println("Would you like to: " + "\n 1)" +
                " x^2" + "\n 2) √x" + "\n 3) x^y" + "\n 4) Inverse" + "\n 5) Inverse Sign");
        operator = scan.nextInt();

        System.out.println("Please enter the first number. ");
        x = scan.nextDouble();

        System.out.println("Please enter the second number");
        y = scan.nextDouble();
*/


        public double getSquared[] {
                answer = Math.pow(x,2);
                return answer;
        }

        public double getSquareRoot() {
                answer = Math.sqrt(x);
                return answer;
        }

        public double getExponent() {
                answer = Math.pow(x, y);
                return answer;
        }

        public double getInverse() {
                answer = x/1;
                return answer;
        }

        public double getInvertSign() {
                answer =x;
                break;
        }

        /*switch (operator) {
            case 1:
                answer = Math.pow(x, 2);
                break;
            case 2:
                answer = Math.sqrt(x);
                break;
            case 3:
                answer = Math.pow(x, y);
                break;
            case 4:
                answer = x / 1;
                break;
            case 5:
                answer = x;
                break;


        }*/
    }
}
