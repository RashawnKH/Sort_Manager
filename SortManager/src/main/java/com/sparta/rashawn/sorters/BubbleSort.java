package com.sparta.rashawn.sorters;

public class BubbleSort implements Sorter {


    @Override
    public int[] sortArray(int[] arrayToSort) {



        if (arrayToSort.length <=1){
            return arrayToSort;
        }

            int temp;
            for(int i = 0; i<arrayToSort.length; i++){
                for(int j = 0; j<arrayToSort.length; j++){
                    if(arrayToSort[j] > arrayToSort[i]){
                        temp = arrayToSort[j];
                        arrayToSort[j] = arrayToSort[i];
                        arrayToSort[i] = temp;
                    }
                }
            }
        return arrayToSort;
    }


}
