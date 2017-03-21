/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.princessBride.control;

import byui.cit260.princessBride.control.InventoryControl;
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
       
       /*******************************
        *  Test CalcVolume case #1
        *******************************/
       System.out.println("\tTest calcVolume case #1");
       
       // input values for test case 1
       int height = 2;
       int width = 2;
       int length = 2;
              
       InventoryControl instance = new InventoryControl();
       
       
       double expResult = 8; //expected output returned value
       
       // call function to run test
       double result = instance.calcVolume(height, width, length);
       
       // compare expected return value with actual value returned
       assertEquals(expResult, result, 0.001);
  
       
       /*******************************
        *  Test CalcVolume case #2
        *******************************/
       System.out.println("\tTest calcVolume case #2");
       
       // input values for test case 2
      height = 2;
      width = 10;
      length = 10;
              
       
      expResult = 200; //expected output returned value
       
       // call function to run test
     result = instance.calcVolume(height, width, length);
       
       // compare expected return value with actual value returned
       assertEquals(expResult, result, 0.001);
       
    /*******************************
        *  Test CalcVolume case #3
        *******************************/
       System.out.println("\tTest calcVolume case #3");
       
       // input values for test case 3
       height = -1;
    width = 10;
       length = 3;
       
    expResult = -1; 
//expected output returned value
       
       // call function to run test
     result = instance.calcVolume(height, width, length);
       
       // compare expected return value with actual value returned
       assertEquals(expResult, result, 0.001);
       
        /*******************************
        *  Test CalcVolume case #4
        *******************************/
       System.out.println("\tTest calcVolume case #4");
       
       // input values for test case 4
       height = 3;
    width = 2;
       length = -1;
       
    expResult = -1; 
//expected output returned value
       
       // call function to run test
     result = instance.calcVolume(height, width, length);
       
       // compare expected return value with actual value returned
       assertEquals(expResult, result, 0.001);
       
        /*******************************
        *  Test CalcVolume case #5
        *******************************/
       System.out.println("\tTest calcVolume case #5");
       
       // input values for test case 5
       height = 3;
    width = -1;
       length = 2;
       
    expResult = -1; 
//expected output returned value
       
       // call function to run test
     result = instance.calcVolume(height, width, length);
       
       // compare expected return value with actual value returned
       assertEquals(expResult, result, 0.001);
        /*******************************
        *  Test CalcVolume case #6
        *******************************/
       System.out.println("\tTest calcVolume case #6");
       
       // input values for test case 6
       height = 1;
    width = 1;
       length = 1;
       
    expResult = 1; 
//expected output returned value
       
       // call function to run test
     result = instance.calcVolume(height, width, length);
       
       // compare expected return value with actual value returned
       assertEquals(expResult, result, 0.001);
       
     /*******************************
        *  Test CalcVolume case #7
        *******************************/
       System.out.println("\tTest calcVolume case #7");
       
       // input values for test case 7
       height = 2;
    width = 1;
       length = 2;
       
    expResult = 4; 
//expected output returned value
       
       // call function to run test
     result = instance.calcVolume(height, width, length);
       
       // compare expected return value with actual value returned
       assertEquals(expResult, result, 0.001);   
       
        /*******************************
        *  Test CalcVolume case #8
        *******************************/
       System.out.println("\tTest calcVolume case #8");
       
       // input values for test case 8
       height = 2;
    width = 2;
       length = 5;
       
    expResult = 20; 
//expected output returned value
       
       // call function to run test
     result = instance.calcVolume(height, width, length);
       
       // compare expected return value with actual value returned
       assertEquals(expResult, result, 0.001);
   }
       
   
    
   @Test
   public void testCalcItemVolume() {
       System.out.println("calcItemVolume");
  
       /*******************************
        *  Test CalcItemVolume case #1
        *******************************/
       System.out.println("\tTest calcItemVolume case #1");
       
       // input values for test case 1
       int qItem = 1;
       int volume = 8;
              
 InventoryControl instance = new InventoryControl();
       
       double expResult = 8; //expected output returned value
       
       // call function to run test
       double result = instance.calcItemVolume(qItem, volume);
       
       // compare expected return value with actual value returned
       assertEquals(expResult, result, 0.001);
       
       /*******************************
        *  Test CalcItemVolume case #2
        *******************************/
       System.out.println("\tTest calcItemVolume case #2");
       
       // input values for test case 2
       qItem = 1;
       volume = 200;
              
       
       expResult = 200; //expected output returned value
       
       // call function to run test
       result = instance.calcItemVolume(qItem, volume);
       
       // compare expected return value with actual value returned
       assertEquals(expResult, result, 0.001);
       
       /*******************************
        *  Test CalcItemVolume case #3
        *******************************/
       System.out.println("\tTest calcItemVolume case #3");
       
       // input values for test case 3
       qItem = -1;
       volume = 60;
              
       
       expResult = -1; //expected output returned value
       
       // call function to run test
       result = instance.calcItemVolume(qItem, volume);
       
       // compare expected return value with actual value returned
       assertEquals(expResult, result, 0.001);
       
       /*******************************
        *  Test CalcItemVolume case #4
        *******************************/
       System.out.println("\tTest calcItemVolume case #4");
       
       // input values for test case 4
       qItem = 1;
       volume = -6;
              
       
       expResult = -6; //expected output returned value
       
       // call function to run test
       result = instance.calcItemVolume(qItem, volume);
       
       // compare expected return value with actual value returned
       assertEquals(expResult, result, 0.001);
       
        /*******************************
        *  Test CalcItemVolume case #5
        *******************************/
       System.out.println("\tTest calcItemVolume case #5");
       
       // input values for test case 5
       qItem = 2;
       volume = -6;
              
       
       expResult = -12; //expected output returned value
       
       // call function to run test
       result = instance.calcItemVolume(qItem, volume);
       
       // compare expected return value with actual value returned
       assertEquals(expResult, result, 0.001);
       
        /*******************************
        *  Test CalcItemVolume case #6
        *******************************/
       System.out.println("\tTest calcItemVolume case #6");
       
       // input values for test case 6
       qItem = 3;
       volume = -8;
              
       
       expResult = -24; //expected output returned value
       
       // call function to run test
       result = instance.calcItemVolume(qItem, volume);
       
       // compare expected return value with actual value returned
       assertEquals(expResult, result, 0.001);
        /*******************************
        *  Test CalcItemVolume case #7
        *******************************/
       System.out.println("\tTest calcItemVolume case #7");
       
       // input values for test case 7
       qItem = 1;
       volume = 1;
              
       
       expResult = 1; //expected output returned value
       
       // call function to run test
       result = instance.calcItemVolume(qItem, volume);
       
       // compare expected return value with actual value returned
       assertEquals(expResult, result, 0.001);
       
        /*******************************
        *  Test CalcItemVolume case #8
        *******************************/
       System.out.println("\tTest calcItemVolume case #8");
       
       // input values for test case 8
       qItem = 3;
       volume = 10;
              
       
       expResult = 30; //expected output returned value
       
       // call function to run test
       result = instance.calcItemVolume(qItem, volume);
       
       // compare expected return value with actual value returned
       assertEquals(expResult, result, 0.001);
       
        /*******************************
        *  Test CalcItemVolume case #9
        *******************************/
       System.out.println("\tTest calcItemVolume case #9");
       
       // input values for test case 9
       qItem = 5;
       volume = 20;
              
       
       expResult = 100; //expected output returned value
       
       // call function to run test
       result = instance.calcItemVolume(qItem, volume);
       
       // compare expected return value with actual value returned
       assertEquals(expResult, result, 0.001);
       
   }
}