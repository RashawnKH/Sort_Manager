package com.sparta.rashawn;

import com.sparta.rashawn.arraygenerator.GenerateArray;
import com.sparta.rashawn.sorters.BubbleSort;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class SorterTest
{
    @Test
    public void checkCanSort() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] arrayToSort = new int[]{2,4,3,1};
        int[] sortedArray = new int[]{1,2,3,4};
        Assertions.assertArrayEquals(sortedArray,bubbleSort.sortArray(arrayToSort));

        int[] arrayToSort2 = new int[]{2,4,3,1,9,7,5,10};
        int[] sortedArray2 = new int[]{1,2,3,4,5,7,9,10};

        Assertions.assertArrayEquals(sortedArray2,bubbleSort.sortArray(arrayToSort2));


    }

    @Test
    public void checkCanHandleMaxSize(){
        BubbleSort bubbleSort = new BubbleSort();
        int[] arrayToSort = GenerateArray.generateArray(10000);
        int[] sortedArray = bubbleSort.sortArray(arrayToSort);
        Assertions.assertEquals(arrayToSort.length,sortedArray.length);

    }


    @Test
    public void checkCanHandleEmptyArray(){
        BubbleSort bubbleSort = new BubbleSort();
        int[] emptyArray = new int[]{};
        Assertions.assertArrayEquals(emptyArray,bubbleSort.sortArray(emptyArray));
    }


    @Test
    public void checkCanHandleOneElementArray(){
        BubbleSort bubbleSort = new BubbleSort();
        int[] oneElementArray = new int[]{2};
        Assertions.assertArrayEquals(oneElementArray,bubbleSort.sortArray(oneElementArray));
    }


    @Test
    public void checkCanHandleDuplicates(){
        BubbleSort bubbleSort = new BubbleSort();
        int[] arrayToSort = new int[]{2,4,3,1,1,5,5,5,9,4};
        int[] sortedArray = new int[]{1,1,2,3,4,4,5,5,5,9};
        Assertions.assertArrayEquals(sortedArray,bubbleSort.sortArray(arrayToSort));
    }


    @Test
    public void checkCanHandleNegativeNumbers(){
        BubbleSort bubbleSort = new BubbleSort();
        int[] arrayToSort = new int[]{2,4,3,-1,1,5,5,-5,9,4};
        int[] sortedArray = new int[]{-5,-1,1,2,3,4,4,5,5,9};
        Assertions.assertArrayEquals(sortedArray,bubbleSort.sortArray(arrayToSort));
    }


}
