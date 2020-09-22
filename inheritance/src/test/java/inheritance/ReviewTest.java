package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReviewTest {
    @Test public void testNewReview() {
        Review testReview = new Review("Bob", "It's good!", 4);
        assertEquals("the instance's author field should be set", "Bob", testReview.author);
        testReview = new Review("Amy", "It's no good!", 1);
        assertEquals("the instance's body field should be set", "It's no good!", testReview.body);
    }

    @Test public void testToString() {
        Review testReview = new Review("Bob", "It's good!", 4);
        assertEquals("instance should output pretty print", "Review{author='Bob', stars=4, body='It's good!'}", testReview.toString());
    }
}
