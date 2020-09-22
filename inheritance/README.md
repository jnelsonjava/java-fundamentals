# Inheritance

## Contents

  - Restaurant.java methods
    - constructor: creates instance of a Restaurant, requires a string name, int star rating, and int price category
    - toString: creates a readable string representing the restaurant instance
    - addReview: take in a Review instance, adds it to a review list, and invokes updateStars method to update the Restaurant's star rating
    - updateStars: iterates over review list and updates the Restaurant's star rating to the average rounded down to the nearest integer
  - Review.java methods
    - constructor: creates instance of a Review, requires a string author name, string body of the review, and int star rating
    - toString: creates a readable string representating the review instance
  - to test, navigate to the main directory folder and run `./gradlew test`

## Attributions:

Collaborated with Michael Wohl and Paul O'Brien
