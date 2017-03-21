/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.princessBride.control;

/**
 *
 * @author Jack Wilson
 */
public class AttackControl {

    public double calcPercentHealth(double health){
        
        if (health <= 0) {return -1;}
        if (health > 200) {return -1;}
        
        double percentHealth = health/100;
        
        return percentHealth;
    }
    
    public double calcAttackStrength(double percentHealth, double attack, double skill){
    
        if (percentHealth <=0) {return -1;}
        if (percentHealth > 2.00) {return -1;}
        if (attack <= 0) {return -1;}
        if (attack > 200) {return -1;}
        if (skill <= 0) {return -1;}
        if (skill > 200) {return -1;}
        
        double attackStrength = percentHealth * attack + skill;
        
        return attackStrength;

    }

    public double calcDefenseStrength (double percentHealth, double defense, double skill){
    
        if (percentHealth <= 0) {return -1;}
        if (percentHealth > 2.00) {return-1;}
        if (defense <= 0) {return -1;}
        if (defense > 200) {return -1;}
        if (skill <= 0) {return -1;}
        if (skill > 200) {return -1;}
        
        double defenseStrength = percentHealth * defense + skill;
        
        return defenseStrength;
    
    }

    public double calcDamageDone(double attackStrength, double defenseStrength){
        
        if (attackStrength <= defenseStrength) {return -1;}
        
        double damageDone = attackStrength - defenseStrength;
        
        return damageDone;
    
    }

    public double calcNewHealth( double damageDone, double health){
        if (health <= damageDone) {return -1;}
        
        double newHealth = health - damageDone;
        
        return newHealth;
    
    }
}
