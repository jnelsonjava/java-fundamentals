package basiclibrary;

public class RollingDice {
    public int[] roll(int n) {
        int[] diceArr = new int[n];
        for (int i = 0; i < n; i++) {
            diceArr[i] = (int) Math.floor((Math.random() * 6) + 1);
        }
        return diceArr;
    }

    public boolean containsDuplicates(int[] inputArr) {
        for (int i = 0; i < inputArr.length; i++) {
            for (int j = i + 1; j < inputArr.length; j++) {
                if (inputArr[i] == inputArr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public double calculateAverage(int[] inputArr) {
        double total = 0;
        for (int num : inputArr) {
            total += num;
        }

        double output = total / inputArr.length;
        return output;
    }

    public int[] getLowestAvgArray(int[][] weeklyMonthTemperatures) {
        double lowestAvg = calculateAverage(weeklyMonthTemperatures[0]);
        int[] outputArr = new int[0];
        for (int[] intArr : weeklyMonthTemperatures) {
            double avg = calculateAverage(intArr);
            boolean result = avg < lowestAvg;
            System.out.println(result);
            if (result) {
                outputArr = intArr;
                lowestAvg = calculateAverage(intArr);
            }
        }
        return outputArr;
    }
}
