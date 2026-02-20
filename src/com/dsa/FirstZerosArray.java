package com.dsa;

import java.util.Arrays;

public class FirstZerosArray {

    public static void main(String[] args) {

        int[] arr = {1, 0, 4, 6, 0, 3};

//        int left = 0;
//        int right = arr.length - 1;
//
//        while (left < right) {
//
//            if (arr[left] == 0) {
//                left++;
//            } 
//            else if (arr[right] != 0) {
//                right--;
//            } 
//            else {
//                int temp = arr[left];
//                arr[left] = arr[right];
//                arr[right] = temp;
//
//                left++;
//                right--;
//            }
//        }
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
        

                int insertPos = 0;

               
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == 0) {
                        int temp = arr[i];
                        arr[i] = arr[insertPos];
                        arr[insertPos] = temp;
                        insertPos++;
                    }
                }

                System.out.println(Arrays.toString(arr));
        
    }
}