package com.example.sort;

/**
 * Created by adutta on 9/3/2014.
 */
public class Recursive {
    public static void main(String[] args){
        reoccur(1, 3);
    }

    private static void reoccur(int i, int endAt){
        System.out.println("I am at - " + i);
        if (i != endAt){
            reoccur(i+1, endAt);
        }
    }
}
