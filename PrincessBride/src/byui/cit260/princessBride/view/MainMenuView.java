/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.princessBride.view;

import InitialPlayer.InitialPlayer;
import byui.cit260.princessBride.control.GameControl;
import byui.cit260.princessBride.exceptions.GameControlException;
import byui.cit260.princessBride.exceptions.MapControlException;
import java.util.Scanner;
import princessbride.PrincessBride;

/**
 *
 * @author Lai
 */
public class MainMenuView extends View{

    
    
                public MainMenuView (){
                    super("\n"
                  + "\n ----------------------------------------"
                  + "\n|      Main Menu                         |"
                  + "\n ----------------------------------------"
                  + "\n  N - Start new game"
                  + "\n  G - Get and start save game"
                  + "\n  H - Get help on how to play the game"
                  + "\n  S - Save game"
                  + "\n  Q - Quit"
                  + "\n-----------------------------------------");
    }
    
    

    @Override
    public boolean doAction(String value){
        
        
        value = value.toUpperCase(); // convert menuOption to upper case
        
        switch (value) {
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

        try {
            // create a new game
        GameControl.createNewGame(InitialPlayer.getPlayer());
        } catch (MapControlException mce) {
            System.out.println(mce.getMessage());
            return;
        } catch (Throwable te) {
            System.out.println(te.getMessage());
            te.printStackTrace();
            return;
        }
        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void startExistingGame() {
       this.console.println("\n\nEnter the file path for file where the game "
                           + "is to be saved.");
        
        String filePath = this.getInput();
        
        try {
            // start a saved game
            GameControl.getSaveGame(filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        } 

        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu= new HelpMenuView ();
        helpMenu.display();
    }

    private void saveGame() {
        // prompt for and get the name of the file to save the game in
        this.console.println("\n\nEnter the file path for file where the game "
                           + "is to be saved.");
        String filePath = this.getInput();     
        
        try {
            // save the game to the speciried file
            GameControl.saveGame(InitialPlayer.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        } 
    }
    
}
