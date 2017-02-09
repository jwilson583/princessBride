/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.princessBride.control;

/**
 *
 * @author Lai
 */
public class GameControl {
    
    int defaulStrength = 100;
    int miraclePotion = 100;
    int travel = 1;
    int run = 2;
    int dodge = 4;
    int attackE = 2;
    int sword = 50;
    int rock = 30;
    int dagger = 10;
    int iocanPowder = 100;
    int gameIndx = 2;
        

    
    
    public double calcStrength(int numMiraclePotion, int travelTime, int runTime, int numDodge, int numAttackE) {
                    
        if (numMiraclePotion < 0) {
            return -1;
        }

        if (travelTime < 0) {
            return -1;
        }
        
        if (runTime < 0) {
            return -1;
        }
        
        if (numDodge < 0) {
            return -1;
        }
        
        if (numAttackE < 0) {
            return -1;
        }
        
        double strength = defaulStrength+miraclePotion*numMiraclePotion-travel*travelTime-run*runTime-dodge*numDodge-attackE*numAttackE;
        
        return strength;
    }

    
    
    
    public double calcAttack(int numSword, int numRock, int numDagger, int numIocanePowder, int gameLevel) {
        
        if ((gameLevel < 0) || (gameLevel > 3)) {
            return -1;
        }
            
        if (numSword < 0) {
            return -1;
        }
        
        if (numRock < 0) {
            return -1;
        }
        
        if (numDagger < 0) {
            return -1;
        }
        
        if (numIocanePowder < 0) {
            return -1;
        }
        
        double attack = (((sword*numSword)+(rock*numRock)+(dagger*numDagger))/(Math.pow(gameIndx, gameLevel)))+(iocanPowder*numIocanePowder);
        
        return attack;
    }

    
    
    
    public double calcHealth(double strength, double attack) {
                           
        double health = strength-attack;
        
        return health;
    }
    
}
