package com.sparta.rashawn.sorters;

public class QuickSort implements Sorter {
    @Override
    public int[] sortArray(int[] arrayToSort) {
        if (arrayToSort.length <=1){
            return arrayToSort;
        }

        int start = 0;
        int end = arrayToSort.length-1;
        return quickSort(arrayToSort, start,end);
    }

    public int[] quickSort(int[] array, int start, int finish){
        int partitionIndex = 0;


        if (start< finish){
            partitionIndex = partition(array,start,finish);

            quickSort(array,start,partitionIndex-1);
            quickSort(array,partitionIndex+1,finish);

        }

        return array;
    }

    public int partition(int[]arrayToSort, int start, int finish){
        int pivot = arrayToSort[finish];
        int i = start - 1;
        int holderValue = 0;

        for (int j = start; j<=finish; j++){
            if (arrayToSort[j] < pivot){
                i++;
                holderValue = arrayToSort[i];
                arrayToSort[i] = arrayToSort[j];
                arrayToSort[j] = holderValue;

            }
        }
        holderValue = arrayToSort[i+1];
        arrayToSort[i+1] = arrayToSort[finish];
        arrayToSort[finish] = holderValue;

           return i+1;
    }
}
