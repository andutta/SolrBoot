package com.example.sort;

import java.util.Vector;

/**
 * Created by adutta on 9/3/2014.
 */
public class DataBuilder {

    public Vector<Employee> unSortedEmployee;

    public Vector<Employee> CreateEmployees(int howMany){
        Vector<Employee> retVal= new Vector<Employee>();
        for (int i=0;i<=howMany;i++){
            retVal.add(new Employee("name" + i, (Math.random() *99 ) + 1 ));
        }

        /*

        retVal.add(new Employee("name1", 30));
        retVal.add(new Employee("name2", 30));
        retVal.add(new Employee("name3", 32));
        retVal.add(new Employee("name4", 54));
        retVal.add(new Employee("name5", 29));
        retVal.add(new Employee("name6", 45));*/

        return retVal;
    }

    public class Employee{
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
