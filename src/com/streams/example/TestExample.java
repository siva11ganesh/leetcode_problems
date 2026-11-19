package com.streams.example;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestExample {

    public static void main(String[] args) {
        List<Employee> em = List.of(new Employee(1, "Siva", 40000.00), new Employee(2, "Ganesh", 535000.00));

        List<Managers> managers = List.of(new Managers(1, "Sivaganesh", 1), new Managers(2, "Palani", 2),
                new Managers(3, "Kumar", 1));

        Map<Integer, String> empIdToName = em.stream().collect(Collectors.toMap(Employee::getId, Employee::getName));

        System.out.println(empIdToName);

        Map<String, Long> empCount = managers.stream()
                .collect(Collectors.groupingBy(m -> String.valueOf(m.getEmpId()), Collectors.counting()));

        System.out.println(empCount);


    }
}
