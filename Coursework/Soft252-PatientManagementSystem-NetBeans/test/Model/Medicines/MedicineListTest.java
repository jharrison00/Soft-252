/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Medicines;

import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jonat
 */
public class MedicineListTest {
    
    public MedicineListTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getAllMedicines method, of class MedicineList.
     */
    @Test
    public void testGetAllMedicines() {
        System.out.println("getAllMedicines");
        MedicineList instance = new MedicineList();
        ArrayList<Medicine> expResult = null;
        ArrayList<Medicine> result = instance.getAllMedicines();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAllMedicines method, of class MedicineList.
     */
    @Test
    public void testSetAllMedicines() {
        System.out.println("setAllMedicines");
        ArrayList<Medicine> allMedicines = null;
        MedicineList instance = new MedicineList();
        instance.setAllMedicines(allMedicines);
        assertEquals(null, instance.getAllMedicines());
    }
    
}
