package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RestaurantTest {
    @Test public void testNewRestaurant() {
        Restaurant testRestaurant = new Restaurant("Zippy's", 3, 1);
        assertEquals("the name field should be set by constructor", "Zippy's", testRestaurant.name);
        assertEquals("the stars field should be set by constructor", 3, testRestaurant.stars);
        assertEquals("the priceCategory field should be set by constructor", 1, testRestaurant.priceCategory);
        testRestaurant = new Restaurant("Serafina", 4, 3);
        assertEquals("the name field should be set by constructor", "Serafina", testRestaurant.name);
    }

    @Test public void testToString() {
        Restaurant testRestaurant = new Restaurant("Zippy's", 3, 1);
        assertEquals("should pretty print the restaurant info", "Restaurant{name='Zippy's', stars=3, priceCategory=1, reviewList=[]}", testRestaurant.toString());
    }

    @Test public void testAddReview() {
        Restaurant testRestaurant = new Restaurant("Zippy's", 3, 1);
        testRestaurant.addReview(new Review("Bob", "It's good!", 4));
        assertEquals("review should be at list head", "Bob", testRestaurant.reviewList.getFirst().author);
        assertEquals("star rating should be updated", 4, testRestaurant.stars);

        testRestaurant.addReview(new Review("Amy", "It's no good!", 1));
        assertEquals("new review should be at list head", "Amy", testRestaurant.reviewList.getFirst().author);
        assertEquals("star rating should be updated", 2, testRestaurant.stars);
    }
}
