package com.gerdface.session1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


//To call the methods within the Assert class in the Junit library you have to extend it ^^

public class DogTest {

    @Test
    public void testHasPoopedRecently() throws Exception {
        boolean actual = Dog.hasPoopedRecently();

        assertEquals(actual, false);

        /*hasPoopedRecently was set to false by default (as booleans always are...this one
        * got me for a second*/

    }

    @Test
    public void hasTakenGiantDumpSoHasPoopedRecently() throws Exception {
        /*I had to change the variable hasPoopedRecently and the method to static.
        I'll be able to explain this later...*/
        double weight = 0.0d;
        double expected = weight;
        double actual = Dog.getWeight();

        assertEquals(expected, actual, .001);

    }
}





/*    http://codingbat.com/java
    https://www.livecoding.tv/*/
# GerdBAckyardSessions
