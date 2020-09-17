package basiclibrary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Maps {
    public String analyzeWeather(int[][] weatherData) {
        String outputStr = "";
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        HashSet<Integer> uniqueTemps = new HashSet<>();

        for (int[] weekTemps : weatherData) {
            for (int temp : weekTemps) {
                uniqueTemps.add(temp);
                if (temp < low) {
                    low = temp;
                } else if (temp > high) {
                    high = temp;
                }
            }
        }

//        reference for converting int to String: https://www.geeksforgeeks.org/different-ways-for-integer-to-string-conversions-in-java/
//        reference for adding line separators: https://www.baeldung.com/java-string-newline#:~:text=In%2520Windows%252C%2520a%2520new%2520line,the%2520end%2520of%2520our%2520string
        outputStr += "High: " + Integer.toString(high) + "\n";
        outputStr += "Low: " + Integer.toString(low);

        for (int n = low + 1; n < high; n++) {
            if (!uniqueTemps.contains(n)){
                outputStr += "" + "\n";
                outputStr += "Never saw temperature: " + Integer.toString(n);
            }
        }

        return outputStr;
    }

    public String tally(List<String> votes) {
        HashMap<String, Integer> voteTally = new HashMap<>();
        for (String vote : votes) {
            // reference for incrementing HashMap: https://stackoverflow.com/questions/81346/most-efficient-way-to-increment-a-map-value-in-java
            int count = voteTally.containsKey(vote) ? voteTally.get(vote) : 0;
            voteTally.put(vote, count + 1);
        }

        int mostVotes = 0;
        String ourWinner = "Nobody";
        for (String contestant : voteTally.keySet()) {
            if (voteTally.get(contestant) > mostVotes) {
                ourWinner = contestant;
                mostVotes = voteTally.get(contestant);
            }
        }
        return ourWinner;
    }
}
