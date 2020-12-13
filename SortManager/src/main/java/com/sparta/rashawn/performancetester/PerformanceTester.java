package com.sparta.rashawn.performancetester;

import com.sparta.rashawn.sorters.Sorter;

public class PerformanceTester {


    public static double testSorterPerformance(Sorter sorter, int[] arrayToSort){
        double startTime = System.nanoTime();
        sorter.sortArray(arrayToSort);
        double endTime = System.nanoTime();

        double timeTaken = endTime - startTime;
        double timeInMilliseconds = timeTaken / 1_000_000;


        return timeInMilliseconds;
    }

}
