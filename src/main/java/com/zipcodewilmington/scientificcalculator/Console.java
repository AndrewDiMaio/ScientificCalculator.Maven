package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class Console {

    public static void main(String[] args) {
        MainMenu mainMenu = new MainMenu();
        SimpleCalc simpleCalc = new SimpleCalc();
        AdvancedCalc advancedCalc = new AdvancedCalc();
        ScientificFunctions scientificFunctions = new ScientificFunctions();

        int menuInput = 0;

        while (menuInput != 4) {
            Scanner scan= new Scanner(System.in);


            mainMenu.mainMenuDisplay();
            System.out.println("Please choose the Calculator you would like to access.");
            menuInput = scan.nextInt();

            calculatorSelection: switch (menuInput){

                case 1:
                simpleCalc.BasicCalc();
                int operator = scan.nextInt();
                if (operator == 5) {
                    break calculatorSelection;
                    }


                    System.out.println("Please enter the first number. ");
                    double x = scan.nextDouble();

                    System.out.println("Please enter the second number");
                    double y = scan.nextDouble();


                    switch (operator) {

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
                            } else {
                                answer = simpleCalc.getDivision(x, y);
                                System.out.println(x + " / " + y + " = " + answer);
                            }
                            break;
                        }

                break;

                case 2:
                    advancedCalc.AdvanCalc();
                    operator = scan.nextInt();
                    if (operator == 6) {
                        break calculatorSelection;
                    }
                        if (operator == 3) {
                            System.out.println("Please enter the first number. ");
                            x = scan.nextDouble();

                            System.out.println("Please enter the second number");
                            y = scan.nextDouble();

                            double answer = advancedCalc.getExponent(x, y);
                            System.out.println(x + " to the power of " + y + " = " + answer);
                        }
                        else if (operator == 1){
                            System.out.println("Please enter the first number. ");
                            x = scan.nextDouble();

                            double answer = advancedCalc.getSquared(x);
                            System.out.println(x + " squared is " + answer);

                        } else if (operator == 2) {
                            System.out.println("Please enter the first number. ");
                            x = scan.nextDouble();

                            double answer = advancedCalc.getSquareRoot(x);
                            System.out.println("The square root of " + x + " is " + answer);


                        }
                        else if (operator == 4){
                            System.out.println("Please enter the first number. ");
                            x = scan.nextDouble();

                            double answer = advancedCalc.getInverse(x);
                            System.out.println("The inverse of " + x + " is " + answer);


                        }
                        else if (operator == 5){
                            System.out.println("Please enter the first number. ");
                            x = scan.nextDouble();

                            double answer = advancedCalc.getInvertSign(x);
                            System.out.println("If you invert the sign of " + x + " is " + answer);

                        }

                 break;




                case 3:
                    scientificFunctions.ScientificCalc();
                     operator = scan.nextInt();
                    if (operator == 7) {
                        break calculatorSelection;
                        }
                    System.out.println("Please enter the first number. ");
                    x = scan.nextDouble();

                    switch (operator) {

                        case 1:
                           double answer = scientificFunctions.getSin(x);
                            System.out.println("The sine of " + x + " is " + answer);
                            break;

                        case 2:
                            answer = scientificFunctions.getCos(x);
                            System.out.println("The cosine of " + x + " is " + answer);
                            break;

                        case 3:
                            answer = scientificFunctions.getTan(x);
                            System.out.println("The tangent of " + x + " is " + answer);
                            break;

                        case 4:
                            answer = scientificFunctions.getInverseSin(x);
                            System.out.println("The inverse sine of " + x + " is " + answer);
                            break;

                        case 5:
                            answer = scientificFunctions.getInverseCos(x);
                            System.out.println("The inverse cosine of " + x + " is " + answer);
                            break;

                        case 6:
                            answer = scientificFunctions.getInverseTan(x);
                            System.out.println("The inverse tangent of " + x + " is " + answer);
                            break;


                    }


                }


                }

            }




        }


