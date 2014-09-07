package com.example.sort;

import java.util.Vector;

/**
 * Created by adutta on 9/2/2014.
 */
public class QuickSort {
    public Vector<Employee> unSortedList;

    public QuickSort() {
        this.unSortedList = CreateEmployees();
    }

    public static void main(String[] args){
        QuickSort quickSort = new QuickSort();
        int median = quickSort.unSortedList.size()/2;

        Vector<Employee> sortedData = quickSort.quickSort(median, quickSort.unSortedList);

        for (Employee e : sortedData) {
            System.out.println(e.getName() + " " + e.getAge());
        }

    }

    public Vector<Employee> quickSort(int median, Vector<Employee> data){
        Vector<Employee> sortedData = new Vector<Employee>();
        Double medianVal = data.get(median).getAge();
        int i=0;
        Vector<Employee> afterMedian = new Vector<Employee>();
        Vector<Employee> beforeMedian = new Vector<Employee>();

        while(i<data.size()){
            if (data.get(i).getAge() > medianVal){
               afterMedian.add(data.get(i));
            }else {
                beforeMedian.add(data.get(i));
            }
            i++;
        }

        if (beforeMedian !=  null && beforeMedian.size() > 1){
            int nxtMedian = beforeMedian.size()/2;
            if (data.get(nxtMedian).getAge() == medianVal ){
                if (nxtMedian != 0){
                    nxtMedian --;
                }else{
                    nxtMedian++;
                }
            }
            beforeMedian = quickSort(nxtMedian, beforeMedian);
        }

        if (afterMedian != null && afterMedian.size() > 1){
            int nxtMedian = afterMedian.size()/2;
            if (data.get(nxtMedian).getAge() == medianVal ){
                if (nxtMedian != 0){
                    nxtMedian --;
                }else{
                    nxtMedian++;
                }
            }

            afterMedian = quickSort(nxtMedian, afterMedian);
        }

        sortedData.addAll(beforeMedian);
        sortedData.addAll(afterMedian);

        return sortedData;
    }

    private Vector<Employee> CreateEmployees(){
        Vector<Employee> retVal= new Vector<Employee>();
        for (int i=0;i<=50000;i++){
            retVal.add(new Employee("name" + i, (Math.random() *99 ) + 1 ));
        }

        return retVal;
    }

    private class Employee{
        private String name;
        private Double age;

        public Employee(String name, Double age){
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Double getAge() {
            return age;
        }

        public void setAge(Double age) {
            this.age = age;
        }
    }
}
