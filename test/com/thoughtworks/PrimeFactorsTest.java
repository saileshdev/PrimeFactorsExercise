package com.thoughtworks;

/**
 * Created by saileshdev on 04/07/2017.
 */

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;


public class PrimeFactorsTest {
    PrimeFactors primeFactors;

    @Before
    public void setUp() throws Exception {
        this.primeFactors = new PrimeFactors();
    }

    @Test
    public void shoudReturnFactoryInSequenceAtNumber30() {
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(3);
        expected.add(5);
        assertThat(primeFactors.returnSequenceOfFactors(30), hasItems(2, 3, 5));
    }
}
