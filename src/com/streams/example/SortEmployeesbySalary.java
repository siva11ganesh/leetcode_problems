package com.streams.example;

import java.util.Comparator;
import java.util.List;

public class SortEmployeesbySalary {

    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee(1, "Aravind", 135000.00),
                new Employee(2, "Siva", 100032.00),
                new Employee(3, "Palani", 1201110.00)
        );


        List<Employee> sorted = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .toList();
        System.out.println(sorted);


        //Average salary
        double k = employees.stream().mapToDouble(Employee::getSalary).average().orElse(0.0);
        System.out.println(k);
    }
}
