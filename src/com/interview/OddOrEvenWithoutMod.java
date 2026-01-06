package com.interview;

import javax.sound.midi.Soundbank;

/**
 * Author: Sivaganesh S
 * Date:12/17/2025
 */

public class OddOrEvenWithoutMod {

    public static void main(String[] args) {
        int x = 10;
        for (int i = 1; i <= x; i++) {
            OddOrEvenWithoutMod.isEven(i);
        }


    }

    public static void isEven(int x) {
        int i = x & 1;
        if (i == 0) {
            System.out.println("even:" + x);
        } else {
            System.out.println("Odd:" + x);
        }
    }


}
