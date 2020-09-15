import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
  public static void main(String[] args) {
    // test run of pluralize method
    int dogCount = 2;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

    // test run of flipNHeads method
    flipNHeads(2);

    // test run of clock method
    clock();
  }

  public static String pluralize(String word, int number) {
    if (number != 1) {
      return word + 's';
    } else {
      return word;
    }
  }

  public static void flipNHeads(int n) {
    int totalFlips = 0;
    int consecutiveHeads = 0;

    // reference for random numbers https://www.geeksforgeeks.org/generating-random-numbers-in-java/
    while (consecutiveHeads < n) {
      totalFlips++;
      if (Math.random() >= 0.5) {
        consecutiveHeads++;
        System.out.println("heads");
      } else {
        consecutiveHeads = 0;
        System.out.println("tails");
      }
    }
    System.out.println("It took " + totalFlips + " flips to flip " + n + " " + pluralize("head", n) + " in a row.");
  }

  public static void clock() {
    int currentSecond;
    // reference for LocalDateTime https://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html
    // Thanks to Vij for helping understand how LocalDateTime works
    LocalDateTime now;
    int prevSecond = LocalDateTime.now().getSecond();
    double operations = 0.0;

    while (true) {
      operations++;
      now = LocalDateTime.now();
      currentSecond = now.getSecond();
      if (currentSecond == prevSecond) {
        continue;
      } else {
        // reference for DateTimeFormatter https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
        System.out.println(now.format(DateTimeFormatter.ofPattern("HH:mm:ss")) + " " + operations/1000000 + " MHz");
        operations = 0;
        prevSecond = currentSecond;
      }
    }
  }
}