package com.streams.problems;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class AmountCalculation {

    public static void main(String[] args) {
        List<Double> amountList = List.of(1000.00, 3020.00, 5000.00, 121.00, 30.16);

        double total = amountList.stream()
                .mapToDouble(Double::doubleValue)
                .sum();

        OptionalDouble d = amountList.stream().mapToDouble(Double::doubleValue).average();

        System.out.println((d.isPresent() ? d.getAsDouble() : 0.00));

        System.out.println(total);

    }
}
