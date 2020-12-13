package com.sparta.rashawn.performancetester;

public class RunPerformanceTests {

    public void runPerformanceTests(){
        PerformanceTests performanceTests = new PerformanceTests();
        performanceTests.performanceTestBinarySort();
        performanceTests.performanceTestBubbleSort();
        performanceTests.performanceTestInsertionSort();
        performanceTests.performanceTestMergeSort();
        performanceTests.performanceTestQuickSort();
        performanceTests.performanceTestSelectionSort();
    }


}
