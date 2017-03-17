/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.princessBride.control;

import byui.cit260.princessBride.exceptions.GameControlException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lai
 */
public class GameControlTest {
    
    public GameControlTest() {
    }

    
    /**
     * Test of getnewGame method, of class GameControl.
     * @throws byui.cit260.princessBride.exceptions.GameControlException
     */
    @Test
    public void testGetnewGame() throws GameControlException {
        System.out.println("getnewGame");
                
        /*******************************
         *  Test GetNewGame case #1
         *******************************/
        System.out.println("\tTest getNewGame case #1");

        // input values for test case 1
        String newName = "Game1";
        
        // create instance of GameControl class
        GameControl instance = new GameControl();
        
        String expResult = "Game1"; //expected output returned value
        
        // call function to run test
        String result = instance.getnewGame(newName);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result);

        
        /*******************************
         *  Test GetNewGame case #2
         *******************************/
        System.out.println("\tTest getNewGame case #2");

        // input values for test case 2
        newName = "";
        
        expResult = "Error"; //expected output returned value
        
        // call function to run test
        result = instance.getnewGame(newName);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result);

        
        /*******************************
         *  Test GetNewGame case #3
         *******************************/
        System.out.println("\tTest getNewGame case #3");

        // input values for test case 3
        newName = "This is a long name and not valid.";
        
        expResult = "Error"; //expected output returned value
        
        // call function to run test
        result = instance.getnewGame(newName);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result);

        
        /*******************************
         *  Test GetNewGame case #4
         *******************************/
        System.out.println("\tTest getNewGame case #4");

        // input values for test case 4
        newName = "Used Name";
        
        expResult = "Error"; //expected output returned value
        
        // call function to run test
        result = instance.getnewGame(newName);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result);

        
        /*******************************
         *  Test GetNewGame case #5
         *******************************/
        System.out.println("\tTest getNewGame case #5");

        // input values for test case 5
        newName = "A";
        
        expResult = "A"; //expected output returned value
        
        // call function to run test
        result = instance.getnewGame(newName);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result);

        
        /*******************************
         *  Test GetNewGame case #6
         *******************************/
        System.out.println("\tTest getNewGame case #6");

        // input values for test case 6
        newName = "My Game";
        
        expResult = "My Game"; //expected output returned value
        
        // call function to run test
        result = instance.getnewGame(newName);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result);

        
        /*******************************
         *  Test GetNewGame case #7
         *******************************/
        System.out.println("\tTest getNewGame case #7");

        // input values for test case 7
        newName = "abcdefghijklmnopqrst";
        
        expResult = "abcdefghijklmnopqrst"; //expected output returned value
        
        // call function to run test
        result = instance.getnewGame(newName);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result);
    }
    
    
    
    /**
     * Test of getnewPlayer method, of class GameControl.
     */
    @Test
    public void testGetnewPlayer() throws GameControlException {
        System.out.println("getnewPlayer");
                
        /*******************************
         *  Test GetNewPlayer case #1
         *******************************/
        System.out.println("\tTest getNewPlayer case #1");

        // input values for test case 1
        String newName = "Name1";
        
        // create instance of GameControl class
        GameControl instance = new GameControl();
        
        String expResult = "Name1"; //expected output returned value
        
        // call function to run test
        String result = instance.getnewPlayer(newName);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result);

        
        /*******************************
         *  Test GetNewPlayer case #2
         *******************************/
        System.out.println("\tTest getNewPlayer case #2");

        // input values for test case 2
        newName = "";
        
        expResult = "Error"; //expected output returned value
        
        // call function to run test
        result = instance.getnewPlayer(newName);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result);

        
        /*******************************
         *  Test GetNewPlayer case #3
         *******************************/
        System.out.println("\tTest getNewPlayer case #3");

        // input values for test case 3
        newName = "This is a very long name.";
        
        expResult = "Error"; //expected output returned value
        
        // call function to run test
        result = instance.getnewPlayer(newName);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result);

        
        /*******************************
         *  Test GetNewPlayer case #4
         *******************************/
        System.out.println("\tTest getNewPlayer case #4");

        // input values for test case 4
        newName = "Old Name";
        
        expResult = "Error"; //expected output returned value
        
        // call function to run test
        result = instance.getnewPlayer(newName);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result);

        
        /*******************************
         *  Test GetNewPlayer case #5
         *******************************/
        System.out.println("\tTest getNewPlayer case #5");

        // input values for test case 5
        newName = "P";
        
        expResult = "P"; //expected output returned value
        
        // call function to run test
        result = instance.getnewPlayer(newName);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result);

        
        /*******************************
         *  Test GetNewPlayer case #6
         *******************************/
        System.out.println("\tTest getNewPlayer case #6");

        // input values for test case 6
        newName = "My Name";
        
        expResult = "My Name"; //expected output returned value
        
        // call function to run test
        result = instance.getnewPlayer(newName);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result);

        
        /*******************************
         *  Test GetNewPlayer case #7
         *******************************/
        System.out.println("\tTest getNewPlayer case #7");

        // input values for test case 7
        newName = "abcdefghijklmnopqrst";
        
        expResult = "abcdefghijklmnopqrst"; //expected output returned value
        
        // call function to run test
        result = instance.getnewPlayer(newName);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result);
    }

    /**
     * Test of calcStrength method, of class GameControl.
     */
    @Test
    public void testCalcStrength() {
        System.out.println("calcStrength");
        
        /*******************************
         *  Test CalcStrength case #1
         *******************************/
        System.out.println("\tTest calcStrength case #1");
        
        // input values for test case 1
        int numMiraclePotion = 3;
        int travelTime = 30;
        int runTime = 30;
        int numDodge = 14;
        int numAttackE = 7;
        
        // create instance of GameControl class
        GameControl instance = new GameControl();
        
        double expResult = 240; //expected output returned value
        
        // call function to run test
        double result = instance.calcStrength(numMiraclePotion, travelTime, runTime, numDodge, numAttackE);

        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.01);
        
        
        /*******************************
         *  Test CalcStrength case #2
         *******************************/
        System.out.println("\tTest calcStrength case #2");
        
        // input values for test case 2
        numMiraclePotion = -1;
        travelTime = 23;
        runTime = 65;
        numDodge = 21;
        numAttackE = 43;
        
        expResult = -1; //expected output returned value
        
        // call function to run test
        result = instance.calcStrength(numMiraclePotion, travelTime, runTime, numDodge, numAttackE);

        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.01);
        
        
        /*******************************
         *  Test CalcStrength case #3
         *******************************/
        System.out.println("\tTest calcStrength case #3");
        
        // input values for test case 3
        numMiraclePotion = 0;
        travelTime = -1;
        runTime = 42;
        numDodge = 52;
        numAttackE = 53;
        
        expResult = -1; //expected output returned value
        
        // call function to run test
        result = instance.calcStrength(numMiraclePotion, travelTime, runTime, numDodge, numAttackE);

        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.01);
        
        
        /*******************************
         *  Test CalcStrength case #4
         *******************************/
        System.out.println("\tTest calcStrength case #4");
        
        // input values for test case 4
        numMiraclePotion = 0;
        travelTime = 23;
        runTime = -1;
        numDodge = 32;
        numAttackE = 4;
        
        expResult = -1; //expected output returned value
        
        // call function to run test
        result = instance.calcStrength(numMiraclePotion, travelTime, runTime, numDodge, numAttackE);

        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.01);
        
        
        /*******************************
         *  Test CalcStrength case #5
         *******************************/
        System.out.println("\tTest calcStrength case #5");
        
        // input values for test case 5
        numMiraclePotion = 0;
        travelTime = 22;
        runTime = 44;
        numDodge = -1;
        numAttackE = 67;
        
        expResult = -1; //expected output returned value
        
        // call function to run test
        result = instance.calcStrength(numMiraclePotion, travelTime, runTime, numDodge, numAttackE);

        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.01);
        
        
        /*******************************
         *  Test CalcStrength case #6
         *******************************/
        System.out.println("\tTest calcStrength case #6");
        
        // input values for test case 6
        numMiraclePotion = 0;
        travelTime = 4;
        runTime = 32;
        numDodge = 24;
        numAttackE = -1;
        
        expResult = -1; //expected output returned value
        
        // call function to run test
        result = instance.calcStrength(numMiraclePotion, travelTime, runTime, numDodge, numAttackE);

        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.01);    
        
        
        /*******************************
         *  Test CalcStrength case #7
         *******************************/
        System.out.println("\tTest calcStrength case #7");
        
        // input values for test case 7
        numMiraclePotion = 0;
        travelTime = 23;
        runTime = 32;
        numDodge = 34;
        numAttackE = 63;
        
        expResult = -249; //expected output returned value
        
        // call function to run test
        result = instance.calcStrength(numMiraclePotion, travelTime, runTime, numDodge, numAttackE);

        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.01);    
        
        
        /*******************************
         *  Test CalcStrength case #8
         *******************************/
        System.out.println("\tTest calcStrength case #8");
        
        // input values for test case 8
        numMiraclePotion = 3;
        travelTime = 0;
        runTime = 33;
        numDodge = 45;
        numAttackE = 67;
        
        expResult = 20; //expected output returned value
        
        // call function to run test
        result = instance.calcStrength(numMiraclePotion, travelTime, runTime, numDodge, numAttackE);

        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.01);    
        
        
        /*******************************
         *  Test CalcStrength case #9
         *******************************/
        System.out.println("\tTest calcStrength case #9");
        
        // input values for test case 9
        numMiraclePotion = 1;
        travelTime = 32;
        runTime = 0;
        numDodge = 4;
        numAttackE = 57;
        
        expResult = 38; //expected output returned value
        
        // call function to run test
        result = instance.calcStrength(numMiraclePotion, travelTime, runTime, numDodge, numAttackE);

        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.01);    
        
        
        /*******************************
         *  Test CalcStrength case #10
         *******************************/
        System.out.println("\tTest calcStrength case #10");
        
        // input values for test case 10
        numMiraclePotion = 5;
        travelTime = 34;
        runTime = 54;
        numDodge = 0;
        numAttackE = 23;
        
        expResult = 412; //expected output returned value
        
        // call function to run test
        result = instance.calcStrength(numMiraclePotion, travelTime, runTime, numDodge, numAttackE);

        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.01);    
        
        
        /*******************************
         *  Test CalcStrength case #11
         *******************************/
        System.out.println("\tTest calcStrength case #11");
        
        // input values for test case 11
        numMiraclePotion = 6;
        travelTime = 37;
        runTime = 56;
        numDodge = 35;
        numAttackE = 0;
        
        expResult = 411; //expected output returned value
        
        // call function to run test
        result = instance.calcStrength(numMiraclePotion, travelTime, runTime, numDodge, numAttackE);

        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.01);    
        
        
        /*******************************
         *  Test CalcStrength case #12
         *******************************/
        System.out.println("\tTest calcStrength case #12");
        
        // input values for test case 12
        numMiraclePotion = 9;
        travelTime = 74;
        runTime = 25;
        numDodge = 23;
        numAttackE = 32;
        
        expResult = 720; //expected output returned value
        
        // call function to run test
        result = instance.calcStrength(numMiraclePotion, travelTime, runTime, numDodge, numAttackE);

        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.01);    
        
        
        /*******************************
         *  Test CalcStrength case #13
         *******************************/
        System.out.println("\tTest calcStrength case #13");
        
        // input values for test case 13
        numMiraclePotion = 3;
        travelTime = 65;
        runTime = 32;
        numDodge = 47;
        numAttackE = 23;
        
        expResult = 37; //expected output returned value
        
        // call function to run test
        result = instance.calcStrength(numMiraclePotion, travelTime, runTime, numDodge, numAttackE);

        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.01);    
        
        
        /*******************************
         *  Test CalcStrength case #14
         *******************************/
        System.out.println("\tTest calcStrength case #14");
        
        // input values for test case 14
        numMiraclePotion = 2;
        travelTime = 45;
        runTime = 13;
        numDodge = 67;
        numAttackE = 25;
        
        expResult = -89; //expected output returned value
        
        // call function to run test
        result = instance.calcStrength(numMiraclePotion, travelTime, runTime, numDodge, numAttackE);

        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.01);    
        
        
        /*******************************
         *  Test CalcStrength case #15
         *******************************/
        System.out.println("\tTest calcStrength case #15");
        
        // input values for test case 15
        numMiraclePotion = 4;
        travelTime = 45;
        runTime = 43;
        numDodge = 27;
        numAttackE = 24;
        
        expResult = 213; //expected output returned value
        
        // call function to run test
        result = instance.calcStrength(numMiraclePotion, travelTime, runTime, numDodge, numAttackE);

        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.01);
    }    
    
    
    /**
     * Test of calcAttack method, of class GameControl.
     */
    @Test
    public void testCalcAttack() {
        System.out.println("calcAttack");
        
        /*******************************
         *  Test CalcAttack case #1
         *******************************/
        System.out.println("\tTest calcAttack case #1");
        
        // input values for test case 1
        int gameLevel = 0;
        int numSword = 2;
        int numRock = 2;
        int numDagger = 5;
        int numIocanePowder = 1;
        
        // create instance of GameControl class
        GameControl instance = new GameControl();
        
        double expResult = 310; //expected output returned value
        
        // call function to run test
        double result = instance.calcAttack(numSword, numRock, numDagger, numIocanePowder, gameLevel);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.01);

       
        /*******************************
         *  Test CalcAttack case #2
         *******************************/
        System.out.println("\tTest calcAttack case #2");
        
        // input values for test case 2
        gameLevel = 4;
        numSword = 3;
        numRock = 3;
        numDagger = 34;
        numIocanePowder = 1;
        
        expResult = -1; //expected output returned value
        
        // call function to run test
        result = instance.calcAttack(numSword, numRock, numDagger, numIocanePowder, gameLevel);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.01);

        
        /*******************************
         *  Test CalcAttack case #3
         *******************************/
        System.out.println("\tTest calcAttack case #3");
        
        // input values for test case 3
        gameLevel = 1;
        numSword = -1;
        numRock = 8;
        numDagger = 2;
        numIocanePowder = 0;
        
        expResult = -1; //expected output returned value
        
        // call function to run test
        result = instance.calcAttack(numSword, numRock, numDagger, numIocanePowder, gameLevel);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.01);
        
        
        /*******************************
         *  Test CalcAttack case #4
         *******************************/
        System.out.println("\tTest calcAttack case #4");
        
        // input values for test case 4
        gameLevel = 2;
        numSword = 5;
        numRock = -1;
        numDagger = 10;
        numIocanePowder = 0;
        
        expResult = -1; //expected output returned value
        
        // call function to run test
        result = instance.calcAttack(numSword, numRock, numDagger, numIocanePowder, gameLevel);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.01);
        
        /*******************************
         *  Test CalcAttack case #5
         *******************************/
        System.out.println("\tTest calcAttack case #5");
        
        // input values for test case 5
        gameLevel = 3;
        numSword = 5;
        numRock = 3;
        numDagger = -1;
        numIocanePowder = 0;
        
        expResult = -1; //expected output returned value
        
        // call function to run test
        result = instance.calcAttack(numSword, numRock, numDagger, numIocanePowder, gameLevel);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.01);
        
        /*******************************
         *  Test CalcAttack case #6
         *******************************/
        System.out.println("\tTest calcAttack case #6");
        
        // input values for test case 6
        gameLevel = 4;
        numSword = 9;
        numRock = 5;
        numDagger = 7;
        numIocanePowder = 2;
        
        expResult = -1; //expected output returned value
        
        // call function to run test
        result = instance.calcAttack(numSword, numRock, numDagger, numIocanePowder, gameLevel);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.01);
        
        /*******************************
         *  Test CalcAttack case #7
         *******************************/
        System.out.println("\tTest calcAttack case #7");
        
        // input values for test case 7
        gameLevel = 1;
        numSword = 3;
        numRock = 2;
        numDagger = 5;
        numIocanePowder = 1;
        
        expResult = 230; //expected output returned value
        
        // call function to run test
        result = instance.calcAttack(numSword, numRock, numDagger, numIocanePowder, gameLevel);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.01);
        
        /*******************************
         *  Test CalcAttack case #8
         *******************************/
        System.out.println("\tTest calcAttack case #8");
        
        // input values for test case 8
        gameLevel = 2;
        numSword = 2;
        numRock = 1;
        numDagger = 3;
        numIocanePowder = 0;
        
        expResult = 40; //expected output returned value
        
        // call function to run test
        result = instance.calcAttack(numSword, numRock, numDagger, numIocanePowder, gameLevel);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.01);
        
        /*******************************
         *  Test CalcAttack case #9
         *******************************/
        System.out.println("\tTest calcAttack case #9");
        
        // input values for test case 9
        gameLevel = 3;
        numSword = 3;
        numRock = 0;
        numDagger = 3;
        numIocanePowder = 1;
        
        expResult = 122.5; //expected output returned value
        
        // call function to run test
        result = instance.calcAttack(numSword, numRock, numDagger, numIocanePowder, gameLevel);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.01);
        
        /*******************************
         *  Test CalcAttack case #10
         *******************************/
        System.out.println("\tTest calcAttack case #10");
        
        // input values for test case 10
        gameLevel = 3;
        numSword = 1;
        numRock = 2;
        numDagger = 0;
        numIocanePowder = 0;
        
        expResult = 13.75; //expected output returned value
        
        // call function to run test
        result = instance.calcAttack(numSword, numRock, numDagger, numIocanePowder, gameLevel);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.01);
        
        /*******************************
         *  Test CalcAttack case #11
         *******************************/
        System.out.println("\tTest calcAttack case #11");
        
        // input values for test case 11
        gameLevel = 1;
        numSword = 4;
        numRock = 3;
        numDagger = 1;
        numIocanePowder = 1;
        
        expResult = 250; //expected output returned value
        
        // call function to run test
        result = instance.calcAttack(numSword, numRock, numDagger, numIocanePowder, gameLevel);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.01);
        
        /*******************************
         *  Test CalcAttack case #12
         *******************************/
        System.out.println("\tTest calcAttack case #12");
        
        // input values for test case 12
        gameLevel = 2;
        numSword = 5;
        numRock = 3;
        numDagger = 3;
        numIocanePowder = 0;
        
        expResult = 92.5; //expected output returned value
        
        // call function to run test
        result = instance.calcAttack(numSword, numRock, numDagger, numIocanePowder, gameLevel);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.01);
    }

    /**
     * Test of calcHealth method, of class GameControl.
     */
    @Test
    public void testCalcHealth() {
        System.out.println("calcHealth");
        
        /*******************************
         *  Test CalcHealth case #1
         *******************************/
        System.out.println("\tTest calcHealth case #1");
        
        // input values for test case 1
        double defence = 345;
        double attack = 235;
        
        // create instance of GameControl class
        GameControl instance = new GameControl();
        
        double expResult = 110; //expected output returned value
        
        // call function to run test
        double result = instance.calcHealth(defence, attack);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.001);

                
        /*******************************
         *  Test CalcHealth case #2
         *******************************/
        System.out.println("\tTest calcHealth case #2");
        
        // input values for test case 2
        defence = -124;
        attack = 23;

        expResult = -147; //expected output returned value
        
        // call function to run test
        result = instance.calcHealth(defence, attack);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.001);

                
        /*******************************
         *  Test CalcHealth case #3
         *******************************/
        System.out.println("\tTest calcHealth case #3");
        
        // input values for test case 3
        defence = 324;
        attack = 0;

        expResult = 324; //expected output returned value
        
        // call function to run test
        result = instance.calcHealth(defence, attack);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.001);

                
        /*******************************
         *  Test CalcHealth case #4
         *******************************/
        System.out.println("\tTest calcHealth case #4");
        
        // input values for test case 4
        defence = 0;
        attack = 234;

        expResult = -234; //expected output returned value
        
        // call function to run test
        result = instance.calcHealth(defence, attack);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.001);

                
        /*******************************
         *  Test CalcHealth case #5
         *******************************/
        System.out.println("\tTest calcHealth case #5");
        
        // input values for test case 5
        defence = 524;
        attack = 177;

        expResult = 347; //expected output returned value
        
        // call function to run test
        result = instance.calcHealth(defence, attack);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.001);

                
        /*******************************
         *  Test CalcHealth case #6
         *******************************/
        System.out.println("\tTest calcHealth case #6");
        
        // input values for test case 6
        defence = 228;
        attack = 228;

        expResult = 0; //expected output returned value
        
        // call function to run test
        result = instance.calcHealth(defence, attack);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.001);
    }
}
