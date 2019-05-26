package com.zipcodewilmington.scientificcalculator;
import java.util.Scanner;

public class AdvancedCalc {
    double x;
    double y;
    double answer;

    public void AdvanCalc() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Would you like to: " + "\n 1) x^2)" + "\n 2) √x)" + "\n 3) x^y" + "\n 4) 1/x" + "\n 5) Invert");
        }
        public double getSquared(double x) {
                answer = Math.pow(x,2);
                return answer;
        }

        public double getSquareRoot(double x) {
                answer = Math.sqrt(x);

                return answer;
        }

        public double getExponent(double x,double y) {
                answer = Math.pow(x, y);
                return answer;
        }

        public double getInverse(double x) {
                answer = 1/x;
                return answer;
        }

        public double getInvertSign(double x) {
                if (x < 0) {
                    answer = Math.abs(x);
                }else if (x > 0) {
                    answer = x * (-1);
                }else{
                    answer = 0;
                }
            return answer;

        }
    }
