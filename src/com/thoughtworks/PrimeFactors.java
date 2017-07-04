package com.thoughtworks;

/**
 * Created by saileshdev on 04/07/2017.
 */


import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    public List<Integer> returnFactors(int value) {

        List<Integer> factors = new ArrayList<>();

        for (int i = 2; i <= value; i++) {
            while (isDivisible(value, i )) {
                factors.add(i);
                value /= i;
            }
        }
        return factors;
    }

    private boolean isDivisible(int value, int divisor){
        return ((value % divisor) == 0);

    }
}
