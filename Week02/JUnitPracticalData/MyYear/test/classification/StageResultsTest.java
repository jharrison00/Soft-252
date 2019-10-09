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
        fail("Test not yet implemented");
    }

    @Test
    public void testAddModuleMark() {
        fail("Test not yet implemented");
    }

    @Test
    public void testCalculateAverage() {
        fail("Test not yet implemented");
    }

    @Test
    public void testPredictClass() {
        fail("Test not yet implemented");
    }
    
}
