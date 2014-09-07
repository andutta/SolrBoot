package com.example.sort;

import java.util.List;
import java.util.Vector;

/**
 * Created by adutta on 9/3/2014.
 */
public class MergeSort extends DataBuilder{

    public MergeSort() {
        unSortedEmployee = CreateEmployees(20);
    }

    public static void main(String[] args){
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(mergeSort.unSortedEmployee);
    }

    private Vector<Employee> mergeSort(Vector<Employee> data){
        Vector<Employee> sortedList = new Vector<Employee>();
        int dataSize = data.size();

        if (dataSize > 1){
            Vector<Employee> left = new Vector<Employee>();
            for (int i=0;i< (Math.round(dataSize/2));i++){
                left.add(data.remove(i));
            }
            Vector<Employee> right = new Vector<Employee>();
            if (data.size() > 0){
                right.addAll(data);
            }
        }

        return sortedList;
    }
}
