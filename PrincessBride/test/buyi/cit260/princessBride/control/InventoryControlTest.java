/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.princessBride.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author school
 */
public class InventoryControlTest {
    
    public InventoryControlTest() {
    }

    /**
     * Test of calcVolume method, of class InventoryControl.
     */
    @Test
    public void testCalcVolume() {
        System.out.println("calcVolume");
        int height = 0;
        int width = 0;
        int length = 0;
        InventoryControl instance = new InventoryControl();
        double expResult = 0.0;
        double result = instance.calcVolume(height, width, length);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcItemVolume method, of class InventoryControl.
     */
    @Test
    public void testCalcItemVolume() {
        System.out.println("calcItemVolume");
        int qItem = 0;
        double volume = 0.0;
        InventoryControl instance = new InventoryControl();
        double expResult = 0.0;
        double result = instance.calcItemVolume(qItem, volume);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
