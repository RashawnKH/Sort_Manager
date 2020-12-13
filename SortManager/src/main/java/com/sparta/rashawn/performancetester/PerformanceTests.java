package com.sparta.rashawn.performancetester;

import com.sparta.rashawn.arraygenerator.GenerateArray;
import com.sparta.rashawn.inputoutput.Display;
import com.sparta.rashawn.sorters.Sorter;
import com.sparta.rashawn.sortfactory.SorterFactory;


public class PerformanceTests {

    private int[] arrayToSort = GenerateArray.generateArray(10000);


    public void performanceTestBubbleSort(){
        System.out.println("Bubble Sort Performance Test");
        Sorter sorter = SorterFactory.getSorter(0);
        double timeTaken = PerformanceTester.testSorterPerformance(sorter, arrayToSort);
        Display.displaySorterPerformance(timeTaken);

    }


    public void performanceTestMergeSort(){
        System.out.println("Merge Sort Performance Test");
        Sorter sorter = SorterFactory.getSorter(1);
        double timeTaken = PerformanceTester.testSorterPerformance(sorter, arrayToSort);
        Display.displaySorterPerformance(timeTaken);

    }


    public void performanceTestBinarySort(){
        System.out.println("Binary Sort Performance Test");
        Sorter sorter = SorterFactory.getSorter(2);
        double timeTaken = PerformanceTester.testSorterPerformance(sorter, arrayToSort);
        Display.displaySorterPerformance(timeTaken);

    }


    public void performanceTestInsertionSort(){
        System.out.println("Insertion Sort Performance Test");
        Sorter sorter = SorterFactory.getSorter(3);
        double timeTaken = PerformanceTester.testSorterPerformance(sorter, arrayToSort);
        Display.displaySorterPerformance(timeTaken);

    }


    public void performanceTestQuickSort(){
        System.out.println("Quick Sort Performance Test");
        Sorter sorter = SorterFactory.getSorter(4);
        double timeTaken = PerformanceTester.testSorterPerformance(sorter, arrayToSort);
        Display.displaySorterPerformance(timeTaken);

    }


    public void performanceTestSelectionSort(){
        System.out.println("Selection Sort Performance Test");
        Sorter sorter = SorterFactory.getSorter(5);
        double timeTaken = PerformanceTester.testSorterPerformance(sorter, arrayToSort);
        Display.displaySorterPerformance(timeTaken);

    }




}
