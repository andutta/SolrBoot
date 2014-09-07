package com.example.sort;

import java.util.Date;
import java.util.Vector;

/**
 * Created by adutta on 9/2/2014.
 */
public class BubbleSort extends DataBuilder{

    //public Vector<Employee> unSortedEmployee;

    public BubbleSort() {
        unSortedEmployee = CreateEmployees(100);
    }

    public static void main(String[] args){
        BubbleSort bubbleSort= new BubbleSort();
        int i=0;

        Long startTime = System.currentTimeMillis();
        System.out.println(startTime);

        while(i < (bubbleSort.unSortedEmployee.size() -2)) {
            int cntr = 0;
            while (cntr < bubbleSort.unSortedEmployee.size() - 1) {
                if (cntr > bubbleSort.unSortedEmployee.size()) {
                    break;
                }
                Employee eCurrent = bubbleSort.unSortedEmployee.get(cntr);
                ;
                Employee eNext = bubbleSort.unSortedEmployee.get(cntr + 1);

                if (eCurrent.getAge() > eNext.getAge()) {
                    bubbleSort.unSortedEmployee.set(cntr, eNext);
                    bubbleSort.unSortedEmployee.set(cntr + 1, eCurrent);
                }
                cntr++;
            }

            i++;
        }

        /*for (Employee e : bubbleSort.unSortedEmployee) {
            System.out.println(e.getName() + " " + e.getAge());
        }*/

        System.out.println("After-" + (System.currentTimeMillis() - startTime));

    }

//    private Vector<Employee> CreateEmployees(){
//        Vector<Employee> retVal= new Vector<Employee>();
//        for (int i=0;i<=100;i++){
//            retVal.add(new Employee("name" + i, (Math.random() *99 ) + 1 ));
//        }
//
//        /*
//
//        retVal.add(new Employee("name1", 30));
//        retVal.add(new Employee("name2", 30));
//        retVal.add(new Employee("name3", 32));
//        retVal.add(new Employee("name4", 54));
//        retVal.add(new Employee("name5", 29));
//        retVal.add(new Employee("name6", 45));*/
//
//        return retVal;
//    }

//    private class Employee{
//        private String name;
//        private Double age;
//
//        public Employee(String name, Double age){
//            this.name = name;
//            this.age = age;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public void setName(String name) {
//            this.name = name;
//        }
//
//        public Double getAge() {
//            return age;
//        }
//
//        public void setAge(Double age) {
//            this.age = age;
//        }
//    }
}
