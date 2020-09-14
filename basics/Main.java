public class Main {
  public static void main(String[] args) {
    // test run of pluralize method
    int dogCount = 2;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

    
  }

  public static String pluralize(String word, int number) {
    if (number != 1) {
      return word + 's';
    } else {
      return word;
    }
  }
}