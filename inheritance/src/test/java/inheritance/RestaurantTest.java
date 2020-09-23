package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class RestaurantTest {
    @Test public void testNewRestaurant() {
        Restaurant testRestaurant = new Restaurant("Zippy's", 1);
        assertEquals("the priceCategory field should be set by constructor", "$", testRestaurant.getPriceCategory());
        testRestaurant = new Restaurant("Serafina", 3);
        assertEquals("the name field should be set by constructor", "Serafina", testRestaurant.getName());
    }

    @Test public void testToString() {
        Restaurant testRestaurant = new Restaurant("Zippy's", 3);
        assertEquals("should pretty print the restaurant info with 3 dollar signs", "Restaurant{name='Zippy's', stars=0, priceCategory=$$$, reviewList=[]}", testRestaurant.toString());
    }

    @Test public void testAddTheaterReview() {
        Restaurant testRestaurant = new Restaurant("Zippy's", 3);
        Review testReview = new Review("Jack", "Nice place", 3, testRestaurant);
        testRestaurant.addReview(testReview);
        assertEquals("generic review should be in list", "Jack", testRestaurant.getReviewList().getFirst().getAuthor());
        TheaterReview testTheaterReview = new TheaterReview("Bob", "It's so-so", 2, testRestaurant, "A New Hope");
        assertThrows("should not accept a theater review", Exception.class, () -> testRestaurant.addReview(testTheaterReview));
    }
}
