package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReviewTest {
    @Test public void testNewReview() {
        Location testLocation = new Location("Zippy's");
        Review testReview = new Review("Bob", "It's good!", 4, testLocation);
        assertEquals("the instance's author field should be set", "Bob", testReview.getAuthor());
        assertEquals("the location's review list should include this review", testReview, testLocation.getReviewList().getFirst());
        testReview = new Review("Amy", "It's no good!", 1, testLocation);
        assertEquals("the instance's body field should be set", "It's no good!", testReview.getBody());
    }

    @Test public void testToString() {
        Location testLocation = new Location("Zippy's");
        Review testReview = new Review("Bob", "It's good!", 4, testLocation);
        assertEquals("instance should output pretty print", "Review{location='Zippy's', author='Bob', stars=4, body='It's good!'}", testReview.toString());
    }
}
