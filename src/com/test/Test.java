package com.test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {

        //Amex
        List<Employee1> empList = Arrays.asList(new Employee1("Siva", 1000.00),
                new Employee1("Ganesh", 15000.00),
                new Employee1("Aravind",15000.00));

       empList.stream().sorted(Comparator.comparingDouble(e1-> e1.salary))
                .sorted(Comparator.comparing(employee1 -> employee1.name))
               .forEach(employee1 -> System.out.println(employee1.name +" "+ employee1.salary));


    }
}

class Employee1 {
    String name;
    double salary;

    Employee1(String name, double sal) {
        this.name = name;
        this.salary = sal;
    }
}
