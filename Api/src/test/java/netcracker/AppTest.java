package netcracker;


import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * 
     * Base tests file 
     * Health test cases, 
     * testing integrity and pom dependencies
     * Junit as well
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Initial tests leave it for checkpoint health
     * 
     */
    public void testApp()
    {
        assertTrue( true );
    }
}