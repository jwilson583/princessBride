/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.princessBride.view;

import buyi.cit260.princessBride.control.GameControl;
import byui.cit260.princessBride.model.Player;
import java.util.Scanner;

/**
 *
 * @author Lai
 */
public class StartProgramView {
    
    private String promptMessage;
    
    public StartProgramView() {
        
        // promptMessage = "Please enter your name"
        this.promptMessage = "\nPlease enter your name: ";
        // display the baner when view is created
        this.displayBanner();
    }
    
    private void displayBanner() {
        
        // throw new UnsupportedOperationException("Not supported yet.");
        
        System.out.println(
              "\n*******************************************************"
            + "\n*                                                     *"
            + "\n* This is the game of Princess Bride.                 *"
            + "\n* This begins with our hero, Wesley. He falls in love *"
            + "\n* with his beloved Buttercup.  Wesley is taken away   *"
            + "\n* and must go through a series of adventures to get   *"
            + "\n* back to his beloved Buttercup.  The game will       *"
            + "\n* follow his journey of fighting with pirates, going  *"
            + "\n* through the fire swamp and taking a wisdom          *"
            + "\n* challenge; all to win the heart of his beloved      *"
            + "\n* Buttercup.                                          *"
            + "\n* Have fun and find the True Love!                    *"                      
            + "\n*                                                     *"
            + "\n*******************************************************"
            );
    }

    
    /**
     * displays the start program view
     */
    
    public void displayStartProgramView() {
        
        boolean done = false; // set flag to not done
        do {
            //prompt for and get players name
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q")) // useer wants to quit
                return; // exit the game
            
            // do the requestted action and display the next view
            done = this.doAction(playersName);
            
        } while (!done);
    
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("\n*** displayStartProgram() function called ***");
    }
        
    private String getPlayersName() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //System.out.println("\n*** getPlayersName() called ***");
        //return "Joe";

        /*WHILE a valid value has not been entered
        DISPLAY a message prompting the user to enter a value
        GET the value entered from keyboard
        Trim front and trailing blanks off of the value
        IF the length of the value is blank THEN
          DISPLAY “Invalid value: The value cannot be blank”
          CONTINUE
        ENDIF
        BREAK
        ENDWHILE
        RETURN value END
        */
     
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
     
        while (!valid) { // loop while an invalid value is enter
            System.out.println("\n" + this.promptMessage);
         
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

    
    private boolean doAction(String playersName) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //System.out.println("\n*** doAction() called ***");
        //return true;
        
        if (playersName.length() < 2) {
            System.out.println("\nInvalid player's name: "
                             + "The name must be greater than one character in length");
            return false;
        }

        // call createPlayer() control function
        Player player = GameControl.createPlayer(playersName);
    
        if (player == null) { // if unsuccessful
            System.out.println("\nError creating the player.");
            return false;
        }
        // display next view
        this.displayNextView(player);
        
        return true; // success!
    }

    private void displayNextView(Player player) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //System.out.println("\n*** displayNextView() called ***)");
        
        // display a custom welcome message
        System.out.println("\n======================================================="
                         + "\n Welcome to the game " + player.getName() + "."
                         + "\n We hope you hava a lot of fun!"
                         + "\n======================================================="
                         );
        
        // Create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
                
        // Display the main menu view
        mainMenuView.displayMainMenuView();

    }
}
