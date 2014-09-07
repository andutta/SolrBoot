package com.example.sort;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by adutta on 9/4/2014.
 */
public class CustomHashcode {

    List<Employee> employees = new ArrayList<Employee>();
    public static void main(String[] args){
        CustomHashcode customHashcode = new CustomHashcode();
        customHashcode.addEmployee();
       for (Employee e:customHashcode.employees){
           System.out.println(e.hashCode());
       }


    }

    private void addEmployee(){

        for(int i=0;i<=20;i++){
            Employee e = new Employee();
            e.setId(i);e.setFirstName("fname "+ i);e.setLastName("lname " + i);
            this.employees.add(e);
        }
    }

    public class Employee {
        Integer id;
        String firstName;
        String lastName;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Employee employee = (Employee) o;

            if (id != null){
                if (id == employee.id){
                    return true;
                }
            }
            if (firstName != null && lastName != null){
                if (firstName.equals(employee.firstName) && lastName.equals(employee.lastName)){
                    return true;
                }
            }

            return false;
        }

        @Override
        public int hashCode() {
            int result = id != null ? id.hashCode() : 0;
            result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
            result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
            return result;
        }
    }
}
