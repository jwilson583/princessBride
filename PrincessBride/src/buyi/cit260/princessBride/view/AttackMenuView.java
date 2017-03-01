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
public class AttackMenuView {
   
    private String menu;
    
    public AttackMenuView () {
       this.menu = "\n"
                 + "\n------------------------------"
                 + "\n|   You Are Being Attacked   |"
                 + "\n------------------------------"
                 + "\n|         A- Attack          |"
                 + "\n|          F- Flee           |"
                 + "\n|        S- Surrender        |"
                 + "\n------------------------------";
    }   
    void displayAttackMenuView () {
        boolean done = false;
        do {
            String menuOption = this.getMenuOption ();
            if (menuOption.toUpperCase().equals ("S"))
                return;
            done = this.doAction(menuOption);
        }
        while (!done);
}
    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while (!valid) {
           System.out.println("\n" +this.menu);
           value = keyboard.nextLine();
           value = value.trim();
           
           if (value.length()<1 ){
               System.out.println("\n Invalid Value: Value Cannot be Blank!");
               continue;
           }
           break;
        }
        return value;
    }
    private boolean doAction (String choice){
        choice = choice.toUpperCase();
          
        switch (choice){
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