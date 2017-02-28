/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.princessBride.view;

import InitialPlayer.InitialPlayer;
import buyi.cit260.princessBride.control.GameControl;
import java.util.Scanner;

/**
 *
 * @author Lai
 */
public class MainMenuView {

    private String menu;
    
    public MainMenuView() {
        this.menu = "\n"
                  + "\n----------------------------------------"
                  + "\n| Main Menu                            |"
                  + "\n----------------------------------------"
                  + "\n N - Start new game"
                  + "\n G - Get and start save game"
                  + "\n H - Get help on how to play the game"
                  + "\n S - Save game"
                  + "\n Q - Quit"
                  + "\n----------------------------------------";
    }
    
    void displayMainMenuView() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //System.out.println("\n*** displayMenu() function called ***");
        
        /**
         * displays the start program view
         */
        
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
            case "N": // create and start a new game
                this.startNewGame();
                break;
            case "G": // get and start an existing game
                this.startExistingGame();
                break;
            case "H": // display the help menu
                this.displayHelpMenu();
                break;
            case "S": // save the current game
                this.saveGame();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }

    private void startNewGame() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //System.out.println("\n*** startNewGame() function called ***");
        GameControl.createNewGame(InitialPlayer.getPlayer());
        
        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void startExistingGame() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("\n*** startExistingGame() function called ***");
    }

    private void displayHelpMenu() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("\n*** displayHelpMenu() function called ***");
        HelpMenuView helpMenu= new HelpMenuView ();
        helpMenu.displayHelpMenuView();
        
    }

    private void saveGame() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("\n*** saveGame() function called ***");
    }
    
}