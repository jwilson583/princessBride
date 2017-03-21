/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.princessBride.view;

import java.util.Scanner;

/**
 *
 * @author Jack Wilson + Ben
 */
public class HelpMenuView extends View{

    private String menu;
    
    public HelpMenuView() {
     super("\n"
            + "\n-------------------------------------------"
            + "\n|              Help Menu                  |"
            + "\n-------------------------------------------"
            + "\n G- What is the Goal of the game           "
            + "\n L- Load Saved Game                        "
            + "\n W- List of Weapons and Descriptions       "
            + "\n R- Return to Main Menu                    "
            + "\n-------------------------------------------");
    }

    @Override
    public boolean doAction(String value) {
     
        
        value = value.toUpperCase(); // convert menuOption to upper case
        
        switch (value) {
            case "G": // create and start a new game
                this.startGoal();
                break;
            case "L": // get and start an existing game
                this.startExistingGame();
                break;
            case "W": // display the help menu
                this.startWeaponList();
                break;
            case "R": // save the current game
                this.displayMainMenu();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }

    private void startGoal() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("\n*The goal of the game is to find Westleys True love, make friends battle enemies*"   );
    }

    private void startExistingGame() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("\n*** startExistingGame() function called ***");
    }

    private void startWeaponList() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("\n***Rock-Throw it at his Head Sword-Fence with your left hand first*");
    }

    private void displayMainMenu() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //System.out.println("\n*** displayMainMenu() function called ***");
            MainMenuView mainMenu= new MainMenuView ();
            mainMenu.display();
    
    }
}
    
