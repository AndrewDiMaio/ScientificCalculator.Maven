package com.zipcodewilmington.scientificcalculator;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class SimpleCalc {
    double x;
    double y;
    double answer;
    int operator;

        public void BasicCalc(){
            Scanner scan= new Scanner(System.in);
            System.out.println("Would you like to: " + "\n 1)" +
                    " Add" + "\n 2) Subtract" + "\n 3) Mulitply" + "\n 4) Divide");
            operator = scan.nextInt();

            System.out.println("Please enter the first number. ");
            x = scan.nextDouble();

            System.out.println("Please enter the second number");
            y = scan.nextDouble();

            switch (operator) {
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
                    answer = x/y;
                    if (y == 0){
                        System.out.println("You can't divide by zero.  Try again.");
                    }
                    else {
                        System.out.println(x + " / " + y + " = " + answer);
                    }
                    break;

            }

        }


    }
