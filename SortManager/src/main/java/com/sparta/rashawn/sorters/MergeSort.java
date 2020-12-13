package com.sparta.rashawn.sorters;

public class MergeSort implements Sorter {


    @Override
    public int[] sortArray(int[] array){
        if (array.length  <=1){
            return array;
        }
        int midpoint = array.length/2;
        int[] firstArray = new int[midpoint];
        int[] secondArray;
        int[] resultArray = new int[array.length];

        if(array.length%2 == 0) {
            secondArray = new int[midpoint];

        }else {
            secondArray = new int[midpoint+1];
        }

        for(int i = 0; i<midpoint; i++){
            firstArray[i] = array[i];
        }

        for(int j = 0; j < secondArray.length; j++){
            secondArray[j] = array[midpoint+j];
        }

       firstArray = sortArray(firstArray);
       secondArray = sortArray(secondArray);


        return resultArray = mergeArrays(firstArray,secondArray);
    }

    public int[] mergeArrays(int[] firstArray, int[] secondArray) {
        int mergedArrayLength = firstArray.length + secondArray.length;
        int[] mergedArray = new int[mergedArrayLength];

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < firstArray.length || j < secondArray.length) {
            if (i< firstArray.length && j<secondArray.length){
                if (firstArray[i] < secondArray[j]) {
                    mergedArray[k++] = firstArray[i++];
                } else {
                    mergedArray[k++] = secondArray[j++];
                }
        }else if (i<firstArray.length){
                mergedArray[k++] = firstArray[i++];
            }else if (j<secondArray.length){
                mergedArray[k++] = secondArray[j++];
            }
    }

        return mergedArray;
    }

}
