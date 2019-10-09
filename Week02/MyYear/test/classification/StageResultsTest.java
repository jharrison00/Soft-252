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
        empty.addModuleMark(20, 70.0);
        
        // Set expected results
        int expCredits = 20;
        double expMark = 70.0;
        
        // Check to see if the method works
        assertEquals("Credits should be 20",expCredits,empty.getTotalCredits());
        assertEquals("Marks should be 70",expMark,empty.getTotalMarks(),0.0);
    
        // Add a 20 credit module, mark 40%
        empty.addModuleMark(20, 40.0);
        assertEquals("Credits should be 30", 50, empty.getTotalCredits());
        assertEquals("Marks should be 150", 110.0, empty.getTotalMarks(), 0.0);
        
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
        
    }

    @Test
    public void testPredictClass() {
        fail("Test not yet implemented");
    }
    
}
