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
    
    int startStrengthPt = 100;
    int miraclePotionPt = 100;
    int travelPt = 1;
    int runPt = 2;
    int dodgePt = 4;
    int attackPt = 2;
    int swordPt = 50;
    int rockPt = 30;
    int daggerPt = 10;
    int iocanPowderPt = 100;
    int gameIndx = 2;
        

    
    
    public double calcStrength(int numMiraclePotion, int travelTime, int runTime, int numDodge, int numAttack) {
                    
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
        
        if (numAttack < 0) {
            return -1;
        }
        
        double strength = startStrengthPt+miraclePotionPt*numMiraclePotion-travelPt*travelTime-runPt*runTime-dodgePt*numDodge-attackPt*numAttack;
        
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
        
        double attack = (((swordPt*numSword)+(rockPt*numRock)+(daggerPt*numDagger))/(Math.pow(gameIndx, gameLevel)))+(iocanPowderPt*numIocanePowder);
        
        return attack;
    }

    
    
    
    public double calcHealth(double strength, double attack) {
                           
        double health = strength-attack;
        
        return health;
    }
    
}
