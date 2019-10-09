/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classification;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jharrison12
 */
public class StageResultsTest {
    private StageResults empty;
    private StageResults full;
    private StageResults halfFull;
    
    public StageResultsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        //defining empty
        empty = new StageResults();
        
        //defining full (object with 120 credits but no initial stage2average)
        full = new StageResults();
        full.addModuleMark(120, 50.0);
        
        //defining halffull (object with 60 credits but no initial stage2average)
        halfFull = new StageResults();
        halfFull.addModuleMark(60,50.0);
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGetStage2Average() {
    }

    @Test
    public void testGetTotalCredits() {
    }

    @Test
    public void testGetTotalMarks() {
    }

    @Test
    public void testSetStage2Average() {
    }

    @Test
    public void testIsComplete() {
        System.out.println("Testing isComplete");

        // Check that the empty object is 'not complete'
        assertFalse("empty object", empty.isComplete()); 
        
        // Check that the full object is 'complete'
        assertTrue("full object", full.isComplete());
        
        // Check that the halfFull object is 'not complete'
        assertFalse("halfFull object", halfFull.isComplete());
    }

    @Test
    public void testResetValues() {
        System.out.println("Testing resetValues");
        
        // Set the state of the 'full' object to zero
        full.resetValues();
        
        // Set expected results
        int expIntResult = 0;
        double expDoubleResult = 0.0;
        
        // Check to see if the reset has worked
        assertEquals("Credits",expIntResult,full.getTotalCredits());
        assertEquals("total",expDoubleResult,full.getTotalMarks(),0.0);
        
        // Put the 'full' object back to its original state
        full.addModuleMark(120,50.0);
    }

    @Test
    public void testAddModuleMark() {
        System.out.println("Testing addModuleMark");
        
        //Add a 20 credit module, mark 70%
        empty.resetValues();
        empty.addModuleMark(20, 70.0);
        
        // Check to see if the method works
        assertEquals("Credits should be 20",20,empty.getTotalCredits());
        assertEquals("Marks should be 70",140.0,empty.getTotalMarks(),0.0);
    
        // Add a 20 credit module, mark 40%
        empty.addModuleMark(20, 40.0);
        assertEquals("Credits should be 40", 40, empty.getTotalCredits());
        assertEquals("Marks should be 220", 220.0, empty.getTotalMarks(), 0.0);
        
        // Put the 'empty' object back to its original state
        empty.resetValues();
    }

    @Test
    public void testCalculateAverage() {
        System.out.println("Testing calculateAverage");
        
        //Test with no credits and no marks
        assertEquals("Empty should be 0%",0.0,empty.calculateAverage(),0.0);
        
        //Test with 120 credits all at 50%
        assertEquals("Full should be 50%",50.0,full.calculateAverage(),0.0);
        
        //Test wutg 120 credits all at 100%
        full.resetValues();
        full.addModuleMark(120,100.0);
        assertEquals("Full should be 100%",100.0,full.calculateAverage(),0.0);
        full.resetValues();
        full.addModuleMark(120, 50.0);
        
        // Test with 120 credits all at 43.92%
        full.resetValues();
        full.addModuleMark(120, 43.92);
        assertEquals("full @ 100%", 43.92, full.calculateAverage(), 0.0);
        full.resetValues();
        full.addModuleMark(120, 50.0);
        
        // Test with 60 credits at 50%
        assertEquals("60 credits @ 50%", 50.0, halfFull.calculateAverage(),
        0.0);
        
        // Test with 60 credits at 100%
        halfFull.resetValues();
        halfFull.addModuleMark(60, 100.0);
        assertEquals("60 credits @ 100%", 100.0, halfFull.calculateAverage(),
        0.0);
        
        // Test with 60 credits at 64.77%
        halfFull.resetValues();
        halfFull.addModuleMark(60, 64.77);
        assertEquals("60 credits @ 64.77%", 64.77, halfFull.calculateAverage(),
        0.0);
        halfFull.resetValues();
        halfFull.addModuleMark(60, 50.0);
    }

    @Test
    public void testPredictClass() {
        System.out.println("Testing predictClass");
        
        // Array to hold the stage 3 marks
        double[] marks = {0.00, 50.00, 50.00, 100.00, 39.99, 40.0,
            49.99, 50.0, 59.99, 60.0, 69.99, 70.0, 99.99, 35.67,
            44.22, 56.39, 64.00, 76.80};
       
        // Array of corresponding classifications with no stage 2 marks
        String[] expResult1 = {"No marks!", "Lower 2nd",
            "Lower 2nd", "1st", "Fail", "3rd", "3rd", "Lower 2nd",
            "Lower 2nd", "Upper 2nd", "Upper 2nd", "1st", "1st",
            "Fail", "3rd", "Lower 2nd", "Upper 2nd", "1st"}; 
        
        // Run tests with no stage 2 average
        for (int count = 0; count < marks.length; count++){
            full.resetValues();
            full.addModuleMark(120, marks[count]);
            assertEquals("120 credits, mark = " + marks[count], expResult1[count],
                    full.predictClass());
        }

        
        
        
        
    }
    
}
