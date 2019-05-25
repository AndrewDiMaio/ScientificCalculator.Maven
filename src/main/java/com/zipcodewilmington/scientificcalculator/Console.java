package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class Console {

    public static void main(String[] args) {
        MainMenu mainMenu = new MainMenu();
        SimpleCalc simpleCalc = new SimpleCalc();


        int menuInput = 0;

        while (menuInput != 4) {
            Scanner scan= new Scanner(System.in);


            mainMenu.mainMenuDisplay();
            System.out.println("Please choose the Calculator you would like to access.");
            menuInput = scan.nextInt();

            calculatorSelection: if (menuInput == 1){
                simpleCalc.BasicCalc();
                int operator = scan.nextInt();
                if (operator == 5) {
                    break calculatorSelection;
                }


                    System.out.println("Please enter the first number. ");
                    double x = scan.nextDouble();

                    System.out.println("Please enter the second number");
                    double y = scan.nextDouble();


                    switch (operator){

                        case 1:
                            double answer = simpleCalc.getAddition(x, y);
                            System.out.println(x + " + " + y + " = " + answer);
                            break;

                        case 2:
                            answer = simpleCalc.getSubtraction(x, y);
                            System.out.println(x + " - " + y + " = " + answer);
                            break;

                        case 3:
                            answer = simpleCalc.getMultiplication(x, y);
                            System.out.println(x + " * " + y + " = " + answer);
                            break;

                        case 4:
                            if (y == 0) {
                                System.out.println(x + " / " + y + " = Undefined");
                            }
                            else {
                                answer = simpleCalc.getDivision(x, y);
                                System.out.println(x + " / " + y + " = " + answer);
                            }
                            break;



                    }

                }


                }

            }




        }


