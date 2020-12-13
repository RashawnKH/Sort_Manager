package com.sparta.rashawn.inputoutput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputManager {

    public static final int MINIMUM_OPTION = 0;
    public static final int MAXIMUM_OPTION = 5;
    public static final int MAX_ARRAY_SIZE = 10_000;

    public static int getUserInput(){
        try {
            Scanner inputScanner = new Scanner(System.in);
            return inputScanner.nextInt();

        }catch (InputMismatchException e){
            System.out.print("Please enter a number.");
        }
        return getUserInput();
    }


    public static int getUserSize(){
        int input = getUserInput();

        while (input > MAX_ARRAY_SIZE || input <= 2) {
            Display.displayIncorrectSizeMessage();
            input = getUserInput();
        }
        return input;
    }


    public static int getUserOption(){
        int input = getUserInput();

        while (input < MINIMUM_OPTION || input > MAXIMUM_OPTION) {
            Display.displayIncorrectOptionMessage();
            Display.displaySortingOptions();
            input = getUserInput();
        }

        return input;
    }


}
