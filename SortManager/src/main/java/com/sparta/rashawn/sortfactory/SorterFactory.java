package com.sparta.rashawn.sortfactory;

import com.sparta.rashawn.sorters.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SorterFactory {

    public static Sorter getSorter(int option){
        Logger logger = LogManager.getLogger(SorterFactory.class);
        switch (option) {
            case 0:
                logger.info("BubbleSort called");
                return new BubbleSort();
            case 1:
                logger.info("MergeSort called");
                return new MergeSort();
            case 2:
                logger.info("BinarySort called");
                return new BinarySort();
            case 3:
                logger.info("InsertionSort called");
                return new InsertionSort();
            case 4:
                logger.info("QuickSort called");
                return new QuickSort();
            case 5:
                logger.info("SelectionSort called");
                return new SelectionSort();
        }
          return null;
    }
}
