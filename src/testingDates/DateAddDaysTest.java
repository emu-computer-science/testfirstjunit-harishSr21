package testingDates;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class DateAddDaysTest {
	private Date testDate;

    @Before
    public void setUp() {
    	testDate = new Date("June", 10, 2019); // Initializing with a valid date
    }

    // 1. Staying in the same month (Example: June 10 -> June 11)
    @Test
    public void testStayInSameMonth() {
        Date startDate = new Date("June", 10, 2019);
        startDate.addOneDay();
        assertEquals(new Date("June", 11, 2019), startDate);
    }

    @Test
    public void testStayInSameMonth2() {
        Date startDate = new Date("June", 15, 2019);
        assertEquals("Did not return correct value", new Date("June", 16, 2019), startDate.addOneDay());
    }

    @Test
    public void testCrossMonthBoundary() {
        Date startDate = new Date("June", 30, 2019);
        startDate.addOneDay();
        assertEquals(new Date("July", 1, 2019), startDate);
    }

    @Test
    public void testCrossMonthBoundary2() {
        Date startDate = new Date("November", 30, 2019);
        startDate.addOneDay();
        assertEquals(new Date("December", 1, 2019), startDate);
    }

    @Test
    public void testCrossYearBoundary() {
        Date startDate = new Date("December", 31, 2019);
        startDate.addOneDay();
        assertEquals(new Date("January", 1, 2020), startDate);
    }
}