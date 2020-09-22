package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RestaurantTest {
    @Test public void testNewRestaurant() {
        Restaurant testRestaurant = new Restaurant("Zippy's", 1);
        assertEquals("the name field should be set by constructor", "Zippy's", testRestaurant.getName());
        assertEquals("the stars field should start at 0", 0, testRestaurant.getStars());
        assertEquals("the priceCategory field should be set by constructor", 1, testRestaurant.getPriceCategory());
        testRestaurant = new Restaurant("Serafina", 3);
        assertEquals("the name field should be set by constructor", "Serafina", testRestaurant.getName());
    }

    @Test public void testToString() {
        Restaurant testRestaurant = new Restaurant("Zippy's", 1);
        assertEquals("should pretty print the restaurant info", "Restaurant{name='Zippy's', stars=0, priceCategory=1, reviewList=[]}", testRestaurant.toString());
    }

    @Test public void testAddReview() {
        Restaurant testRestaurant = new Restaurant("Zippy's", 1);
        testRestaurant.addReview(new Review("Bob", "It's good!", 4, testRestaurant));
        assertEquals("review should be at list head", "Bob", testRestaurant.getReviewList().getFirst().getAuthor());
        assertEquals("star rating should be updated", 4, testRestaurant.getStars());

        testRestaurant.addReview(new Review("Amy", "It's no good!", 1, testRestaurant));
        assertEquals("new review should be at list head", "Amy", testRestaurant.getReviewList().getFirst().getAuthor());
        assertEquals("star rating should be updated", 2, testRestaurant.getStars());
    }
}
