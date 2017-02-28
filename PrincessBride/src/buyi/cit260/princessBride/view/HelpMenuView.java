/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.princessBride.view;

import java.util.Scanner;

/**
 *
 * @author Jack Wilson
 */
public class HelpMenuView {

    private String menu;
    
    public HelpMenuView() {
    this.menu= "\n"
            + "\n-------------------------------------------"
            + "\n|              Help Menu                  |"
            + "\n-------------------------------------------"
            + "\n G- What is the Goal of the game           "
            + "\n L- Load Saved Game                        "
            + "\n W- List of Weapons and Descriptions       "
            + "\n R- Return to Main Menu                    "
            + "\n-------------------------------------------";
    }

    void displayHelpMenuView() {
        
        boolean done = false; // set flag to not done
        do {
            // prompt for and get plyers name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(menuOption);
            
        } while (!done);       
    }

    private String getMenuOption() {
       //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //System.out.println("\n*** getMenuOption() function call ***");
        //return "N";
        //System.out.println(this.menu); // display Menu Option
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
     
        while (!valid) { // loop while an invalid value is enter
            System.out.println("\n" + this.menu);
         
            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks
         
            if (value.length() < 1) { // value is blank
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }
          
            break; //end the loop
        
        }
        
        return value; // return the value entered
    }

    private boolean doAction(String choice) {
         //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //System.out.println("\n*** doAction() function called ***)");
        //return true;
        
        choice = choice.toUpperCase(); // convert menuOption to upper case
        
        switch (choice) {
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
        System.out.println("\n*** displayMainMenu() function called ***");
            MainMenuView mainMenu= new MainMenuView ();
            mainMenu.displayMainMenuView();
    
    }
}
    