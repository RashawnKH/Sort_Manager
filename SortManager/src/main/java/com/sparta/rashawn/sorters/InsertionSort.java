package com.sparta.rashawn.sorters;

public class InsertionSort implements Sorter {
    @Override
    public int[] sortArray(int[] arrayToSort) {

        if (arrayToSort.length <=1){
            return arrayToSort;
        }


        int key = 0;
        int j = 0;
        int holderVariable = 0;

        for (int i = 1; i<arrayToSort.length; i++){
            key = arrayToSort[i];
            j = i-1;
            while(j>=0 && key < arrayToSort[j]){
                holderVariable = arrayToSort[j];
                arrayToSort[j] = arrayToSort[j+1];
                arrayToSort[j+1] = holderVariable;
                j--;
            }
        }

        return arrayToSort;
    }
}
