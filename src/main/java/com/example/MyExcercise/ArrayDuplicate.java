package com.example.MyExcercise;

/**
 * Created by adutta on 9/6/2014.
 */
public class ArrayDuplicate {
    public static void main(String[] args){
        Integer[] data = {2,3,4,2,9,8,5,1};
        int sum1=0;
        for (int i=0;i < data.length;i++){
            sum1 = sum1 + data[i];

        }
        int sum2 = ((data.length - 1) * (data.length - 2)) >> 1;

        System.out.println("Duplicate is - " + (sum1 - sum2));
    }
}
