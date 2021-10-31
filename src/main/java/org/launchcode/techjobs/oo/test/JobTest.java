package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId() {
        Job Job1 = new Job();
        Job Job2 = new Job();

        assertNotEquals(Job1, Job2);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job Job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(Job3.getName() instanceof String);
        assertTrue(Job3.getEmployer() instanceof Employer);
        assertTrue(Job3.getLocation() instanceof Location);
        assertTrue(Job3.getPositionType() instanceof PositionType);
        assertTrue(Job3.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Product tester", Job3.getName());
        assertEquals("ACME", Job3.getEmployer().getValue());
        assertEquals("Desert", Job3.getLocation().getValue());
        assertEquals("Quality control", Job3.getPositionType().getValue());
        assertEquals("Persistence", Job3.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        Job mockJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job mockJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertFalse(mockJob2.equals(mockJob1));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job Job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String testToString = Job4.toString();
        assertEquals('\n', Job4.toString().charAt(0));
        assertEquals('\n',Job4.toString().charAt(testToString.length() - 1));
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job Job5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String testToString = Job5.toString();

        assertEquals("\n" + "ID: " + Job5.getId() + "\n" +
                "Name: " + Job5.getName() + "\n" +
                "Employer: " + Job5.getEmployer().getValue() + "\n" +
                "Location: " + Job5.getLocation().getValue() + "\n" +
                "Position Type: " + Job5.getPositionType().getValue() + "\n" +
                "Core Competency: " + Job5.getCoreCompetency().getValue() + "\n", testToString);
    }

    @Test
    public void testToStringHandlesEmptyField(){
        Job Job6 = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        String testToString = Job6.toString();

        assertEquals("\n" + "ID: " + "Data not available" + "\n" +
                "Name: " + "Data not available" + "\n" +
                "Employer: " + "Data not available" + "\n" +
                "Location: " + "Data not available" + "\n" +
                "Position Type: " + "Data not available" + "\n" +
                "Core Competency: " + "Data not available" + "\n", testToString);
    }
}