package com.dsa;

import java.util.Arrays;

public class MergeArrays {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 4};
        int[] arr2 = {3, 5, 6};

        int[] merge = new int[arr1.length + arr2.length];

        
        for (int i = 0; i < arr1.length; i++) {
            merge[i] = arr1[i];
        }

      
        for (int j = 0; j < arr2.length; j++) {
            merge[arr1.length + j] = arr2[j];  
        }
        Arrays.sort(merge);
        System.out.println(Arrays.toString(merge));
    }
}