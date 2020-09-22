package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReviewTest {
    @Test public void testNewReview() {
        Restaurant testRestaurant = new Restaurant("Zippy's", 1);
        Review testReview = new Review("Bob", "It's good!", 4, testRestaurant);
        assertEquals("the instance's author field should be set", "Bob", testReview.getAuthor());
        assertEquals("the restaurant list should include this review", testReview, testRestaurant.getReviewList().getFirst());
        testReview = new Review("Amy", "It's no good!", 1, testRestaurant);
        assertEquals("the instance's body field should be set", "It's no good!", testReview.getBody());
    }

    @Test public void testToString() {
        Restaurant testRestaurant = new Restaurant("Zippy's", 1);
        Review testReview = new Review("Bob", "It's good!", 4, testRestaurant);
        assertEquals("instance should output pretty print", "Review{restaurant='Zippy's', author='Bob', stars=4, body='It's good!'}", testReview.toString());
    }
}
