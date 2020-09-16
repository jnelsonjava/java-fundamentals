package basiclibrary;

import org.checkerframework.dataflow.qual.TerminatesExecution;
import org.junit.Test;

import static org.junit.Assert.*;

public class RollingDiceTest {
    @Test public void testRollMethod() {
        RollingDice roll = new RollingDice();
        for (int i = 0; i < 10; i++) {
            assertTrue("output array is correct length", i == roll.roll(i).length);
        }
        // reference for comparing types: https://stackoverflow.com/questions/12404650/assert-an-object-is-a-specific-type/47890524
        assertTrue("output array is correct type", int[].class == roll.roll(3).getClass());
        for (int j : roll.roll((50))) {
            assertTrue("roll is within 1 - 6", j >= 1 && j<= 6);
        }
    }

    @Test public void testContainsDuplicatesMethod() {
        RollingDice roll = new RollingDice();
        assertTrue("placeholder", roll.containsDuplicates(new int[]{1,2,3,3}));
        assertFalse("placeholder", roll.containsDuplicates(new int[]{1,2,3,4,5,6}));
        assertTrue("placeholder", roll.containsDuplicates(new int[]{1,2,3,1}));
    }

    @Test public void testCalculateAverageMethod() {
        RollingDice roll = new RollingDice();
        assertEquals(2.0, roll.calculateAverage(new int[]{1,2,3}), 0);
        assertEquals(2.5, roll.calculateAverage(new int[]{1,2,3,4}), 0);
    }

    @Test public void testGetLowestAvgArrayMethod() {
        RollingDice roll = new RollingDice();
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        for (int[] intArr : weeklyMonthTemperatures) {
            System.out.println(roll.calculateAverage(intArr));
        }
        assertArrayEquals(weeklyMonthTemperatures[2], roll.getLowestAvgArray(weeklyMonthTemperatures));
    }

    @Test public void testRandomDistribution() {
        // checking that the average of 1000 rounds of 1000 dice rolls is within 0.01 from 3.5
        RollingDice roll = new RollingDice();
        int numRounds = 1000;
        int numRolls = 1000;
        double[] avgArr = new double[numRounds];
        for (int i = 0; i < avgArr.length; i++) {
            avgArr[i] = roll.calculateAverage(roll.roll(numRolls));
        }
        double total = 0;
        for (double avg : avgArr) {
            total += avg;
        }
        assertEquals(3.5, total / numRounds, 0.01);
    }
}
