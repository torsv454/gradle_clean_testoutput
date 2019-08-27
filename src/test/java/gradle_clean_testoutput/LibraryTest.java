package gradle_clean_testoutput;

import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {
    
    @Test public void testThatFails() {
	System.out.println("testThatFails - System.out");
	System.err.println("testThatFails - System.err");
        Library classUnderTest = new Library();
        assertTrue("returnsFalseShouldReturn should return 'true'", classUnderTest.returnsFalse());
    }


    @Test public void testThatSucceeds() {
	System.out.println("testThatSucceeds - System.out");
	System.err.println("testThatSucceeds - System.err");
        Library classUnderTest = new Library();
        assertFalse("returnsFalse should return 'false'", classUnderTest.returnsFalse());
    }


    @Test public void testThatThrowsException() {
	System.out.println("testThatThrowsException - System.out");
	System.err.println("testThatThrowsException - System.err");
        Library classUnderTest = new Library();
        assertFalse("should return 'false'", classUnderTest.throwsExceptionIfTrueElseFalse(true));
    }
}
