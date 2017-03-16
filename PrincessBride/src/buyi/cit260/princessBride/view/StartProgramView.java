/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.princessBride.view;

import buyi.cit260.princessBride.control.GameControl;
import byui.cit260.princessBride.model.Player;
import exceptions.GameControlException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lai
 */
public class StartProgramView extends View {
    
    //private String promptMessage;
    
    public StartProgramView() {
        
        // display the banner and menu

        super (
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
            + "\n"
            + "\n"
            + "\nPlease enter your name: ");
        
    }
    

@Override

    public boolean doAction(String value) {
        
        try {
            if ((value.length() < 2) || (value.length()) > 20) {
                System.out.println("\nInvalid player's name: "
                        + "The name must be greater than 1 and less than 20 characters in length");
                return false;
            }
            
            // call createPlayer() control function
            Player player = GameControl.createPlayer(value);
            
            if (player == null) { // if unsuccessful
                System.out.println("\nError creating the player.");
                return false;
            }
            // display next view
            this.displayNextView(player);
            
            return true; // success!
        } catch (GameControlException me) {
            Logger.getLogger(StartProgramView.class.getName()).log(Level.SEVERE, null, me);
        }
        return false;
    }

    private void displayNextView(Player player) {
        
        // display a custom welcome message
        System.out.println("\n======================================================="
                         + "\n Welcome to the game " + player.getName() + "."
                         + "\n We hope you hava a lot of fun!"
                         + "\n======================================================="
                         );
        
        // Create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
                
        // Display the main menu view
        mainMenuView.display();

    }
}
