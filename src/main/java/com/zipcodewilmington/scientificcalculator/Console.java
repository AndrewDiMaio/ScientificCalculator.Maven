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

            if (menuInput == 1){

                simpleCalc.BasicCalc();
            }
            



        }
    }
}
