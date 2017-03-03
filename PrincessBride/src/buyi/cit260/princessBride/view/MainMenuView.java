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
public class MainMenuView extends View{

    
    
                public MainMenuView (){
                    super("\n"
                  + "\n----------------------------------------"
                  + "\n| Main Menu                            |"
                  + "\n----------------------------------------"
                  + "\n N - Start new game"
                  + "\n G - Get and start save game"
                  + "\n H - Get help on how to play the game"
                  + "\n S - Save game"
                  + "\n Q - Quit"
                  + "\n----------------------------------------");
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
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //System.out.println("\n*** startNewGame() function called ***");
        GameControl.createNewGame(InitialPlayer.getPlayer());
        
        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();

    }

    private void startExistingGame() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("\n*** startExistingGame() function called ***");
    }

    private void displayHelpMenu() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        System.out.println("\n*** displayHelpMenu() function called ***");
        HelpMenuView helpMenu= new HelpMenuView ();
        helpMenu.displayHelpMenuView();
        
    }

    private void saveGame() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("\n*** saveGame() function called ***");
    }
    
}
