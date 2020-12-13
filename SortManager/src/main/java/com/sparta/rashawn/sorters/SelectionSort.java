package com.sparta.rashawn.sorters;


public class SelectionSort implements Sorter {

    @Override
    public int[] sortArray(int[] arrayToSort) {

        if (arrayToSort.length <=1){
            return arrayToSort;
        }

        for (int i = 0; i<arrayToSort.length-1; i++){

            int smallestValue = i;
            int holderValue = 0;

            for (int j = i +1; j<arrayToSort.length; j++){

                if (arrayToSort[j]< arrayToSort[smallestValue]){
                    smallestValue = j;
                }
            }
            holderValue = arrayToSort[i];
            arrayToSort[i] = arrayToSort[smallestValue];
            arrayToSort[smallestValue] = holderValue;
        }
        return arrayToSort;
    }
}
