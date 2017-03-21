/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.princessBride.control;

import byui.cit260.princessBride.control.AttackControl;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jack Wilson
 */
public class AttackControlTest {
    
    public AttackControlTest() {
    }

    /*************************************************************
     * Test of calcPercentHealth method, of class AttackControl. *
     *************************************************************/
    @Test
    public void testCalcPercentHealth() {
        System.out.println("calcPercentHealth");
       
        /**********************************
         *          Test Case #1          *
         **********************************/
        System.out.println("\tTest calcPercentHealth Case #1");
        
        //input values for test case 1        
        double health = 100;
        
        double expResult = (double) 1.00; //expected output returned value
        
        // create instance of AttackControl class
        AttackControl instance = new AttackControl();
        
        // call function to run test
        double result = instance.calcPercentHealth(health);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, .01);
       
        /**********************************
         *          Test Case #2          *
         **********************************/
        System.out.println("\tTest calcPercentHealth Case #2");
        
        //input values for test case 2        
        health = -1;
        
        expResult = -1; //expected output returned value
                
        // call function to run test
        result = instance.calcPercentHealth(health);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, .01);
        
        /**********************************
         *          Test Case 3          *
         **********************************/
        System.out.println("\tTest calcPercentHealth Case #3");
        
        //input values for test case 3        
        health = 201;
        
        expResult = -1; //expected output returned value
                
        // call function to run test
        result = instance.calcPercentHealth(health);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, .01);
        
        /**********************************
         *          Test Case #4          *
         **********************************/
        System.out.println("\tTest calcPercentHealth Case #4");
        
        //input values for test case 4        
        health = 1;
        
        expResult = .01; //expected output returned value
                
        // call function to run test
        result = instance.calcPercentHealth(health);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, .01);
        
        /**********************************
         *          Test Case #5          *
         **********************************/
        System.out.println("\tTest calcPercentHealth Case #5");
        
        //input values for test case 5        
        health = 200;
        
        expResult = 2.00; //expected output returned value
                
        // call function to run test
        result = instance.calcPercentHealth(health);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, .01);

    }

    /**************************************************************
     * Test of calcAttackStrength method, of class AttackControl. *
     **************************************************************/
    @Test
    public void testCalcAttackStrength() {
        System.out.println("calcAttackStrength");
        
        /**********************************
         *          Test Case #1          *
         **********************************/
        
        System.out.println("\tTest calcAttackStrength #1");
        
        //input values for test case 1
        double percentHealth = 1.00;
        double attack = 100;
        double skill = 100;
        
        double expResult = 200; // expected output returned value
        
        //create instance of AttackControl class
        AttackControl instance = new AttackControl();
       
        //call function to run test
        double result = instance.calcAttackStrength(percentHealth, attack, skill);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, .01);
    
        /**********************************
         *          Test Case #2          *
         **********************************/
        
        System.out.println("\tTest calcAttackStrength #2");
        
        //input values for test case 2
        percentHealth = -.10;
        attack = 100;
        skill = 100;
        
        expResult = -1; // expected output returned value
        
        //call function to run test
        result = instance.calcAttackStrength(percentHealth, attack, skill);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, .01);
        
        
        /**********************************
         *          Test Case #4          *
         **********************************/
        
        System.out.println("\tTest calcAttackStrength #4");
        
        //input values for test case 4
        percentHealth = 1.00;
        attack = 100;
        skill = -10;
        
        expResult = -1; // expected output returned value
        
        //call function to run test
        result = instance.calcAttackStrength(percentHealth, attack, skill);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, .01);
        
        /**********************************
         *          Test Case #5          *
         **********************************/
        
        System.out.println("\tTest calcAttackStrength #5");
        
        //input values for test case 5
        percentHealth = 2.01;
        attack = 100;
        skill = 100;
        
        expResult = -1; // expected output returned value
        
        //call function to run test
        result = instance.calcAttackStrength(percentHealth, attack, skill);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, .01);
        
        /**********************************
         *          Test Case #6          *
         **********************************/
        
        System.out.println("\tTest calcAttackStrength #6");
        
        //input values for test case 6
        percentHealth =  1.00;
        attack = 201;
        skill = 100;
        
        expResult = -1; // expected output returned value
        
        //call function to run test
        result = instance.calcAttackStrength(percentHealth, attack, skill);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, .01);
        
        /**********************************
         *          Test Case #7          *
         **********************************/
        
        System.out.println("\tTest calcAttackStrength #7");
        
        //input values for test case 7
        percentHealth = 1.00;
        attack = 100;
        skill = 201;
        
        expResult = -1; // expected output returned value
        
        //call function to run test
        result = instance.calcAttackStrength(percentHealth, attack, skill);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, .01);
        
        /**********************************
         *          Test Case #8          *
         **********************************/
        
        System.out.println("\tTest calcAttackStrength #8");
        
        //input values for test case 8
        percentHealth = .01;
        attack = 200;
        skill = 200;
        
        expResult = 202; // expected output returned value
        
        //call function to run test
        result = instance.calcAttackStrength(percentHealth, attack, skill);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, .01);
        
        /**********************************
         *          Test Case #9          *
         **********************************/
        
        System.out.println("\tTest calcAttackStrength #9");
        
        //input values for test case 9
        percentHealth = 2.00;
        attack = 1;
        skill = 200;
        
        expResult = 202; // expected output returned value
        
        //call function to run test
        result = instance.calcAttackStrength(percentHealth, attack, skill);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, .01);
        
        /**********************************
         *          Test Case #10         *
         **********************************/
        
        System.out.println("\tTest calcAttackStrength #10");
        
        //input values for test case 10
        percentHealth = 2.00;
        attack = 200;
        skill = 1;
        
        expResult = 401; // expected output returned value
        
        //call function to run test
        result = instance.calcAttackStrength(percentHealth, attack, skill);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, .01);
    
        
    }

    /***************************************************************
     * Test of calcDefenseStrength method, of class AttackControl. *
     ***************************************************************/
    @Test
    public void testCalcDefenseStrength() {
        System.out.println("calcDefenseStrength");
        
        /**********************************
         *          Test Case #1          *
         **********************************/
        
        System.out.println("\t Test calcDefenseStrength #1");
        
        //input values for test case 1
        double percentHealth = 1.00;
        double defense = 100;
        double skill = 100;
        
        double expResult = 200; // expected output returned value
        
        // create instance of AttackControl class
        AttackControl instance = new AttackControl();
        
        //call function to run test
        double result = instance.calcDefenseStrength(percentHealth, defense, skill);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result,.01);
  
        /**********************************
         *          Test Case #2          *
         **********************************/
        
        System.out.println("\t Test calcDefenseStrength #2");
        
        //input values for test case 2
        percentHealth = -.10;
        defense = 100;
        skill = 100;
        
        expResult = -1; // expected output returned value
        
        //call function to run test
       result = instance.calcDefenseStrength(percentHealth, defense, skill);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result,.01);
        
        /**********************************
         *          Test Case #3          *
         **********************************/
        
        System.out.println("\t Test calcDefenseStrength #3");
        
        //input values for test case 3
        percentHealth = 1.00;
        defense = -10;
        skill = 100;
        
        expResult = -1; // expected output returned value
        
        //call function to run test
       result = instance.calcDefenseStrength(percentHealth, defense, skill);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result,.01);
        
        /**********************************
         *          Test Case #4          *
         **********************************/
        
        System.out.println("\t Test calcDefenseStrength #4");
        
        //input values for test case 4
        percentHealth = 1.00;
        defense = 100;
        skill = -10;
        
        expResult = -1; // expected output returned value
        
        //call function to run test
       result = instance.calcDefenseStrength(percentHealth, defense, skill);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result,.01);
        
        /**********************************
         *          Test Case #5          *
         **********************************/
        
        System.out.println("\t Test calcDefenseStrength #5");
        
        //input values for test case 5
        percentHealth = 2.01;
        defense = 100;
        skill = 100;
        
        expResult = -1; // expected output returned value
        
        //call function to run test
        result = instance.calcDefenseStrength(percentHealth, defense, skill);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result,.01);
        
        /**********************************
         *          Test Case #6          *
         **********************************/
        
        System.out.println("\t Test calcDefenseStrength #6");
        
        //input values for test case 6
        percentHealth = 1.00;
        defense = 201;
        skill = 100;
        
        expResult = -1; // expected output returned value
        
        //call function to run test
       result = instance.calcDefenseStrength(percentHealth, defense, skill);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result,.01);
        
        /**********************************
         *          Test Case #7          *
         **********************************/
        
        System.out.println("\t Test calcDefenseStrength #7");
        
        //input values for test case 7
        percentHealth = 1.00;
        defense = 100;
        skill = 201;
        
        expResult = -1; // expected output returned value
        
        //call function to run test
       result = instance.calcDefenseStrength(percentHealth, defense, skill);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result,.01);
        
        /**********************************
         *          Test Case #8          *
         **********************************/
        
        System.out.println("\t Test calcDefenseStrength #8");
        
        //input values for test case 8
        percentHealth = .01;
        defense = 200;
        skill = 200;
        
        expResult = 202; // expected output returned value
        
        //call function to run test
       result = instance.calcDefenseStrength(percentHealth, defense, skill);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result,.01);
        
        /**********************************
         *          Test Case #9          *
         **********************************/
        
        System.out.println("\t Test calcDefenseStrength #9");
        
        //input values for test case 9
        percentHealth = (int) 2.00;
        defense = 1;
        skill = 200;
        
        expResult = 202; // expected output returned value
        
        //call function to run test
       result = instance.calcDefenseStrength(percentHealth, defense, skill);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result,.01);
        
        /**********************************
         *          Test Case #10         *
         **********************************/
        
        System.out.println("\t Test calcDefenseStrength #10");
        
        //input values for test case 10
        percentHealth = 2.00;
        defense = 200;
        skill = 1;
        
        expResult = 401; // expected output returned value
        
        //call function to run test
       result = instance.calcDefenseStrength(percentHealth, defense, skill);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result,.01);
               
    }

    /**
     * Test of calcDamageDone method, of class AttackControl.
     */
    @Test
    public void testCalcDamageDone() {
        System.out.println("calcDamageDone");
       
        /**********************************
         *          Test Case #1          *
         **********************************/
        System.out.println("\tTest calcDamageDone #1");
        
        //input values for test case 1
        double attackStrength = 200;
        double defenseStrength = 100;
       
        double expResult = 100; // expected output returned value
        
        // create instance of AttackControl class
        AttackControl instance = new AttackControl();
        
        //call function to run test
        double result = instance.calcDamageDone(attackStrength, defenseStrength);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, .01);
        
        /**********************************
         *          Test Case #2          *
         **********************************/
        System.out.println("\tTest calcDamageDone #2");
        
        //input values for test case 2
        attackStrength = 100;
        defenseStrength = 200;
       
        expResult = -1; // expected output returned value
        
        //call function to run test
        result = instance.calcDamageDone(attackStrength, defenseStrength);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, .01);
        
        /**********************************
         *          Test Case #3          *
         **********************************/
        System.out.println("\tTest calcDamageDone #3");
        
        //input values for test case 3
        attackStrength = 200;
        defenseStrength = 200;
       
        expResult = -1; // expected output returned value
        
        //call function to run test
        result = instance.calcDamageDone(attackStrength, defenseStrength);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, .01);
        
        /**********************************
         *          Test Case #4          *
         **********************************/
        System.out.println("\tTest calcDamageDone #4");
        
        //input values for test case 4
        attackStrength = 2;
        defenseStrength = 1;
       
        expResult = 1; // expected output returned value
        
        //call function to run test
        result = instance.calcDamageDone(attackStrength, defenseStrength);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, .01);
        
        /**********************************
         *          Test Case #5          *
         **********************************/
        System.out.println("\tTest calcDamageDone #5");
        
        //input values for test case 5
        attackStrength = 600;
        defenseStrength = 599;
       
        expResult = 1; // expected output returned value
        
        //call function to run test
        result = instance.calcDamageDone(attackStrength, defenseStrength);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, .01);
    
        /**********************************
         *          Test Case #6          *
         **********************************/
        System.out.println("\tTest calcDamageDone #6");
        
        //input values for test case 6
        attackStrength = 600;
        defenseStrength = 1;
       
        expResult = 599; // expected output returned value
        
        //call function to run test
        result = instance.calcDamageDone(attackStrength, defenseStrength);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, .01);
    }

    /*********************************************************
     * Test of calcNewHealth method, of class AttackControl. *
     *********************************************************/
    @Test
    public void testCalcNewHealth() {
        System.out.println("calcNewHealth");
        /**********************************
         *          Test Case #1          *
         **********************************/
        System.out.println("\tTest calcNewHealth #1");
        
        //input values for test case 1
        double damageDone = 50;
        double health = 100;
       
        double expResult = 50; //expected output returned value
        
        //create instance of AttackControl Class
        AttackControl instance = new AttackControl();
        
        //call function to run test
        double result = instance.calcNewHealth(damageDone, health);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, .01);
        
        /**********************************
         *          Test Case #2          *
         **********************************/
        System.out.println("\tTest calcNewHealth #2");
        
        //input values for test case 2
        damageDone = 200;
        health = 100;
       
        expResult = -1; //expected output returned value
        
        //call function to run test
        result = instance.calcNewHealth(damageDone, health);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, .01);
        
        /**********************************
         *          Test Case #3          *
         **********************************/
        System.out.println("\tTest calcNewHealth #3");
        
        //input values for test case 3
        damageDone = 100;
        health = 100;
       
        expResult = -1; //expected output returned value
        
        //call function to run test
        result = instance.calcNewHealth(damageDone, health);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, .01);
        /**********************************
         *          Test Case #4          *
         **********************************/
        System.out.println("\tTest calcNewHealth #4");
        
        //input values for test case 4
        damageDone = 1;
        health = 2;
       
        expResult = 1; //expected output returned value
        
        //call function to run test
        result = instance.calcNewHealth(damageDone, health);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, .01);
        
        /**********************************
         *          Test Case #5          *
         **********************************/
        System.out.println("\tTest calcNewHealth #5");
        
        //input values for test case 5
        damageDone = 199;
        health = 200;
       
        expResult = 1; //expected output returned value
        
        //call function to run test
        result = instance.calcNewHealth(damageDone, health);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, .01);
        
        /**********************************
         *          Test Case #6          *
         **********************************/
        System.out.println("\tTest calcNewHealth 6");
        
        //input values for test case 6
        damageDone = 1;
        health = 200;
       
        expResult = 199; //expected output returned value
        
        //call function to run test
        result = instance.calcNewHealth(damageDone, health);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, .01);
        
        
    }
    
}
