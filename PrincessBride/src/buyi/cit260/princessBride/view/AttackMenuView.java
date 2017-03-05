/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.princessBride.view;

import buyi.cit260.princessBride.control.AttackControl;
import java.util.Scanner;

/**
 *
 * @author Jack Wilson
 */
public class AttackMenuView extends View {
   
    public AttackMenuView () {
             super("\n"
                 + "\n------------------------------"
                 + "\n|   You Are Being Attacked   |"
                 + "\n------------------------------"
                 + "\n|         A- Attack          |"
                 + "\n|          F- Flee           |"
                 + "\n|        S- Surrender        |"
                 + "\n------------------------------");
    }   
@Override
    public boolean doAction (String value){
        value = value.toUpperCase();
          
        switch (value){
            case "A":
            this.attackCharacter();
            break;
            case "F":
            this.fleeMap();
            break;
            default:
                System.out.println("\n ***Invalid Selection Try Again***");
                break;
        }
        return false;
    }
    
    private void attackCharacter() {
    AttackControl attack= new AttackControl();
    System.out.println("\n ***Attacking***");
    
    }
   
    private void fleeMap(){
    System.out.println("\n ***Fleeing***");
    }
    
    
}