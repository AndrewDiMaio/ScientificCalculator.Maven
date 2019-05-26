package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class ScientificFunctions {
    double x;
    double y;
    double answer;

    public void ScientificCalc() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Would you like to: " + "\n 1) sin" + "\n 2) cos" + "\n 3) tan" + "\n 4) Inverse sin" + "\n 5) Inverse cos" + "\n 6) Inverse tan");
    }
    public double getSin(double x) {
        answer = Math.sin(x);
        return answer;
    }

    public double getCos(double x) {
        answer = Math.cos(x);

        return answer;
    }

    public double getTan(double x) {
        answer = Math.tan(x);
        return answer;
    }

    public double getInverseSin(double x) {
        double sin = Math.sin(x);
        if (sin < 0) {
            answer = Math.abs(sin);
        }else if (sin > 0) {
            answer = sin * (-1);
        }else{
            answer = 0;
        }
        return answer;
    }

    public double getInverseCos(double x) {
        double cos = Math.cos(x);
        if (cos < 0) {
            answer = Math.abs(cos);
        }else if (cos > 0) {
            answer = cos * (-1);
        }else{
            answer = 0;
        }
        return answer;

    }
    public double getInverseTan(double x) {
        double tan = Math.tan(x);
        if (tan < 0) {
            answer = Math.abs(tan);
        }else if (tan > 0) {
            answer = tan * (-1);
        }else{
            answer = 0;
        }
        return answer;

    }
}