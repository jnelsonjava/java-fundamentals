import java.util.*;

public class Main {
  public static void main(String[] args) {
    // test run of pluralize method
    int dogCount = 2;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

    // test run of flipNHeads method
    flipNHeads(2);

    
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
}