package com.sparta.rashawn.inputoutput;

import com.sparta.rashawn.arraygenerator.GenerateArray;
import com.sparta.rashawn.performancetester.PerformanceTester;
import com.sparta.rashawn.sorters.Sorter;
import com.sparta.rashawn.sortfactory.SorterFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class OutputManager {

    private int arraySize;
    private Sorter sorter;
    private int[] arrayToSort;
    private final Logger logger = LogManager.getLogger(OutputManager.class);


    public void outPutSortingOptions(){
        Display.displaySortingOptions();
        int option = InputManager.getUserOption();
        sorter = SorterFactory.getSorter(option);
    }

    public void outputArraySize(){
        Display.displayGetSizeMessage();
        arraySize = InputManager.getUserSize();

    }
    public void outputPresortedArray(){
        logger.info("Array Generated");
        arrayToSort = GenerateArray.generateArray(arraySize);
        Display.displayPreSortedArray(arrayToSort);
    }

    public void outputSortUsed(){
        String className = sorter.getClass().getName();
        String[] getClassName = className.split("\\.");
        System.out.println("The sort chosen is: " + getClassName[getClassName.length-1]);

    }

    public void outputSortedArray(){
        logger.info("Array Sorted");
        Display.displaySortedArray(sorter.sortArray(arrayToSort));
    }

    public void outputSorterPerformance(){
        Display.displaySorterPerformance(PerformanceTester.testSorterPerformance(sorter,arrayToSort));

    }

}
