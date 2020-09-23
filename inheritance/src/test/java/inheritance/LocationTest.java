package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LocationTest {
    @Test
    public void testNewLocation() {
        Location testLocation = new Location("Zippy's");
        assertEquals("the name field should be set by constructor", "Zippy's", testLocation.getName());
        assertEquals("the stars field should start at 0", 0, testLocation.getStars());
        testLocation = new Location("Serafina");
        assertEquals("the name field should be set by constructor", "Serafina", testLocation.getName());
    }

    @Test public void testToString() {
        Location testLocation = new Location("Zippy's");
        assertEquals("should pretty print the restaurant info", "Location{name='Zippy's', stars=0, reviewList=[]}", testLocation.toString());
    }

    @Test public void testAddReview() {
        Location testLocation = new Location("Zippy's");
        testLocation.addReview(new Review("Bob", "It's good!", 4, testLocation));
        assertEquals("review should be at list head", "Bob", testLocation.getReviewList().getFirst().getAuthor());
        assertEquals("star rating should be updated", 4, testLocation.getStars());

        testLocation.addReview(new Review("Amy", "It's no good!", 1, testLocation));
        assertEquals("new review should be at list head", "Amy", testLocation.getReviewList().getFirst().getAuthor());
        assertEquals("star rating should be updated", 2, testLocation.getStars());
    }
}
