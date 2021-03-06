/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void testAppHasAGreeting() {
        App linterClass = new App();
        assertEquals("should be empty string", "", linterClass.linter("src/main/resources/noErrors.js"));
        assertEquals("should be one line", "Line 11: Missing semicolon.", linterClass.linter("src/main/resources/oneError.js"));
        assertEquals("should be three lines", "Line 3: Missing semicolon.\n" +
                "Line 11: Missing semicolon.\n" +
                "Line 15: Missing semicolon.", linterClass.linter("src/main/resources/fewErrors.js"));
        assertEquals("should be 10 lines", "Line 3: Missing semicolon.\n" +
                "Line 11: Missing semicolon.\n" +
                "Line 15: Missing semicolon.\n" +
                "Line 16: Missing semicolon.\n" +
                "Line 17: Missing semicolon.\n" +
                "Line 18: Missing semicolon.\n" +
                "Line 19: Missing semicolon.\n" +
                "Line 20: Missing semicolon.\n" +
                "Line 21: Missing semicolon.\n" +
                "Line 22: Missing semicolon.", linterClass.linter("src/main/resources/tenErrors.js"));
        assertEquals("should be empty string", "", linterClass.linter("src/main/resources/empty.js"));
    }
}
