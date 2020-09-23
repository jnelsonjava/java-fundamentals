package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TheaterTest {
    @Test public void testNewTheater() {
        Theater testTheater = new Theater("Neptune");
        assertEquals("the new Theater's name should be set", "Neptune", testTheater.getName());
    }

    @Test public void testAddMovie() {
        Theater testTheater = new Theater("Neptune");
        testTheater.addMovie("The Fifth Element");
        assertTrue("the movieList should now contain a movie", testTheater.getMovieList().contains("The Fifth Element"));
    }

    @Test public void testRemoveMovie() {
        Theater testTheater = new Theater("Neptune");
        testTheater.addMovie("The Fifth Element");
        testTheater.addMovie("A New Hope");
        testTheater.removeMovie("The Fifth Element");
        assertTrue("the second movie inserted should now be the last in the list", testTheater.getMovieList().contains("A New Hope"));
    }

    @Test public void testToString() {
        Theater testTheater = new Theater("Neptune");
        testTheater.addMovie("The Fifth Element");
        assertEquals("the Theater should pretty print", "Theater{name='Neptune', movieList=[The Fifth Element]}", testTheater.toString());
    }
}
