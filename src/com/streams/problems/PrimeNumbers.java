package com.streams.problems;

import java.util.stream.IntStream;

/**
 * Author: Sivaganesh S
 * Date:12/24/2025
 */

public class PrimeNumbers {

    public static void main(String[] args) {
        int limit = 100; // Define the range
        System.out.println("Prime Numbers from 1 to " + limit + " are:");

//        for (int num = 2; num <= limit; num++) {
//            boolean isPrime = true;
//
//            for (int i = 2; i <= Math.sqrt(num); i++) {
//                if (num % i == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//
//            if (isPrime) {
//                System.out.print(num + " ");
//            }
//        }


        //Stream format
        IntStream.rangeClosed(2, limit)
                .filter(PrimeNumbers::isPrime)
                .forEach(n -> System.out.print(n + " "));
    }

    private static boolean isPrime(int num) {
        return num > 1 &&
                IntStream.rangeClosed(2, (int) Math.sqrt(num))
                        .allMatch(i -> num % i != 0);
    }
}

