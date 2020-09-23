package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TheaterReviewTest {
    @Test public void testNewTheaterReview() {
        TheaterReview testTheaterReview = new TheaterReview("Jack",
                "I love this place",
                4,
                new Theater("Neptune"),
                "The Fifth Element");
        assertEquals("movie field should be set", "The Fifth Element", testTheaterReview.getMovie());
    }

    @Test public void testToString() {
        TheaterReview testTheaterReview = new TheaterReview("Jack",
                "I love this place",
                4,
                new Theater("Neptune"),
                "The Fifth Element");
        assertEquals("should pretty print", "TheaterReview{location='Neptune', author='Jack', stars=4, movie='The Fifth Element', body='I love this place'}", testTheaterReview.toString());
    }
}
