package testingDates;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.Test;

public class DateSetDateTest {

    private Date date;

    @Before
    public void setUp() {
        date = new Date(1, 1, 2024);
    }

    @Test
    public void testValidSetDate() {
        date.setDate("March", 15, 2024);
        assertEquals(new Date("March", 15, 2024), date);
    }

    @Test
    public void testInvalidSetDate() {
        date.setDate("February", 30, 2024); 
        assertNotEquals(new Date("February", 30, 2024), date); 
    }
}