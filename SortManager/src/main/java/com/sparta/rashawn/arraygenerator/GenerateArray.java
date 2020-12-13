package com.sparta.rashawn.arraygenerator;

import java.util.Random;

public class GenerateArray {


    public static int[] generateArray(int limit){
        int[] randomArray = new int[limit];
        Random random = new Random();

        for (int i = 0; i<randomArray.length; i++){
                randomArray[i] = random.nextInt(limit) + 1;
            }
        return randomArray;

    }
}
