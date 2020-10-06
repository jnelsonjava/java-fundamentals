package basiclibrary;

import java.util.Arrays;

public class RollingDice {
    public int[] roll(int n) {
        int[] diceArr = new int[n];
        for (int i = 0; i < n; i++) {
            diceArr[i] = (int) Math.floor((Math.random() * 6) + 1);
        }
        System.out.println("Dice rolls: " + Arrays.toString(diceArr));
        return diceArr;
    }

    public boolean containsDuplicates(int[] inputArr) {
        for (int i = 0; i < inputArr.length; i++) {
            for (int j = i + 1; j < inputArr.length; j++) {
                if (inputArr[i] == inputArr[j]) {
                    System.out.println("This set does contain duplicates");
                    return true;
                }
            }
        }
        System.out.println("This set does not contain duplicates");
        return false;
    }

    public double calculateAverage(int[] inputArr) {
        double total = 0;
        for (int num : inputArr) {
            total += num;
        }

        double output = total / inputArr.length;
        System.out.println("The average is: " + output);
        return output;
    }

    public int[] getLowestAvgArray(int[][] weeklyMonthTemperatures) {
        double lowestAvg = calculateAverage(weeklyMonthTemperatures[0]);
        int[] outputArr = new int[0];
        for (int[] intArr : weeklyMonthTemperatures) {
            double avg = calculateAverage(intArr);
            boolean result = avg < lowestAvg;
            if (result) {
                outputArr = intArr;
                lowestAvg = calculateAverage(intArr);
            }
        }
        System.out.println("The array with the lowest average is: " + Arrays.toString(outputArr));
        return outputArr;
    }
}
