package com.sparta.rashawn.inputoutput;

import java.util.Arrays;

public class Display {


    public static void displaySortingOptions(){
        System.out.println("Please choose a number from the below options");
        System.out.println("-0: BubbleSort");
        System.out.println("-1: MergeSort");
        System.out.println("-2: BinarySort");
        System.out.println("-3: InsertionSort");
        System.out.println("-4: QuickSort");
        System.out.println("-5: SelectionSort");

    }

    public static void displayIncorrectOptionMessage(){
        System.out.println("Please enter a option from "+InputManager.MINIMUM_OPTION+ " to " +InputManager.MAXIMUM_OPTION);
    }

    public static void displayIncorrectSizeMessage(){
        System.out.println("Please enter a size from 2 to "+InputManager.MAX_ARRAY_SIZE);
    }

    public static void displayGetSizeMessage(){
        System.out.println("Please enter the size of the array");
    }

    public static void displayPreSortedArray(int[] arrayToSort){
        System.out.println("The numbers to be sorted are: " + Arrays.toString(arrayToSort));
    }

    public static void displaySortedArray(int [] sortedArray){
        System.out.println("The sorted array is: " + Arrays.toString(sortedArray));
    }

    public static void displaySorterPerformance(double time){
       System.out.println("The time taken to sort in milliseconds is: " + time);
    }

    public static void displayLineSpace(){
        System.out.println();
    }

}
