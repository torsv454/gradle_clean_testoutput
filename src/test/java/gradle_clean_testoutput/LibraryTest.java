package gradle_clean_testoutput;

import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {
    
    @Test public void testThatFails() {
        Library classUnderTest = new Library();
        assertTrue("returnsFalseShouldReturn should return 'true'", classUnderTest.returnsFalse());
    }


    @Test public void testThatSucceeds() {
        Library classUnderTest = new Library();
        assertFalse("returnsFalse should return 'false'", classUnderTest.returnsFalse());
    }


    @Test public void testThatThrowsException() {
        Library classUnderTest = new Library();
        assertFalse("should return 'false'", classUnderTest.throwsExceptionIfTrueElseFalse(true));
    }
}
