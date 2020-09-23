# Inheritance

## Contents

  - Location.java methods
    - constructor: creates an instance of a Location, requires a string name
    - toString: creates a readable string representing the Location instance
    - addReview: takes in a Review instance, adds it to a review list, and invokes updateStars method to update the Location's star rating
    - updateStars: iterates over review list and updates the Location's star rating to the average rounded down to the nearest integer
    - getName: returns stored name as a string
    - getStars: returns stored star rating as an integer
    - getReviewList: returns linked list of reviews
  - Restaurant.java methods
    - constructor: creates an instance of a Restaurant which extends the Location class, requires a string name and int price category
    - toString: creates a readable string representing the Restaurant instance
    - getPriceCategory: returns the price category as a string of dollar signs
    - addReview: takes in a TheaterReview object and throws an Exception, preventing the Review's subclass, TheaterReview, from being used for Restaurants
  - Shop.java methods
    - constructor: creates an instance of a Shop which extends the Restaurant class, requires a string name, int price category, and string description
    - toString: creates a readable string representing the Shop instance
    - getDescription: returns stored description as a string
  - Theater.java methods
    - constructor: creates an instance of a Theater which extends the Location class, requires a string name
    - toString: creates a readable string representing the Theater instance
    - addMovie: takes in a string movie title, adds it to the Theater's movie list, will not create duplicates
    - removeMovie: takes in a string movie title, removes that title from the Theater's movie list
    - getMovieList: returns a HashSet of strings with movie titles
  - Review.java methods
    - constructor: creates an instance of a Review, requires a string author name, string body of the review, int star rating, and Location object, calls addReview method of Location object and passes self
    - toString: creates a readable string representing the Review instance
    - getAuthor: returns author as a string
    - getBody: returns body as a string
    - getStars: returns star rating as an int
    - getLocation: returns location pointer as a Location object
  - TheaterReview.java methods
    - constructor: creates an instance of a TheaterReview which extends the Review class, requires a string author name, string body of the review, int star rating, Location object, and string movie title
    - toString: creates a readable string representing the TheaterReview instance
    - getMovie: returns a movie title as a string
  - to test, navigate to the main directory folder and run `./gradlew test`

## Attributions:

Collaborated with Michael Wohl and Paul O'Brien
