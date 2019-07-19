package com.stackroute.exercise;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee {

    private int age;
    private String name;
    private String lastName;

    public Employee(int age, String name, String lastName) {
        this.age = age;
        this.name = name;
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "{" + "age=" + age +
                ", name=" + name +
                ", Lastname='" + lastName + '\'' +
                '}';
    }
}
     class LambdaDemoClass {

        public static void main(String[] args) {
            List<Employee> list = new ArrayList<Employee>();
            Employee Emp1 = new Employee(25, "Abdul", "Razak");
            Employee Emp2 = new Employee(65, "Mitesh", "Chattopadhay");
            Employee Emp3 = new Employee(34, "Tim", "Carlos");
            Employee Emp4 = new Employee(52, "Rohit", "Chakravorty");
            Employee Emp5 = new Employee(29, "Sabyasachi", "Sahoo");

            list.add(Emp1);
            list.add(Emp2);
            list.add(Emp3);
            list.add(Emp4);
            list.add(Emp5);

            Collections.sort(list,Comparator.comparing(k->k.getLastName()));
            System.out.println(list);
            System.out.println(list.stream().filter(employee -> employee.getLastName().startsWith("C")).collect(Collectors.toList()));
        }
    }



