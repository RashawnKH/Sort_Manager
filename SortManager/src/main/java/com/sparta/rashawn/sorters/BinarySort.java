package com.sparta.rashawn.sorters;


import com.sparta.rashawn.binarytree.BinaryTree;

import java.util.ArrayList;

public class BinarySort implements Sorter {

    @Override
    public int[] sortArray(int[] arrayToSort) {
        if (arrayToSort.length <=1){
            return arrayToSort;
        }

        BinaryTree binaryTree = new BinaryTree(arrayToSort[0]);
        binaryTree.addElements(arrayToSort);

        int[] sortedArray = convertArrayListToArray(binaryTree.getNodesFromTreeAsc(binaryTree.findNode(binaryTree.getRootElement())), binaryTree);

        return sortedArray;
    }






    private int[] convertArrayListToArray(ArrayList<Integer> arrayList, BinaryTree tree){
            int[] sortedArray = new int[tree.getNumberOfElements()];

            if (arrayList.size() != tree.getNumberOfElements()){
                return sortedArray;
            }

           for (int i = 0; i<tree.getNumberOfElements(); i++){
               sortedArray[i] = arrayList.get(i);
           }

        return sortedArray;
    }

}
