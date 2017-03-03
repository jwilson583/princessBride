/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.princessBride.view;

import java.util.Scanner;

/**
 * 
 *
 * @author Lai
 */
public class GameMenuView extends View{
    
    
    
    public GameMenuView() {
              super("\n"
                  + "\n----------------------------------------"
                  + "\n| Game Menu                            |"
                  + "\n----------------------------------------"
                  + "\n S - Miracle Max Store"
                  + "\n M - Display Map"
                  + "\n B - Dispaly Backpage"
                  + "\n K - Display Skills"
                  + "\n A - Display Attack"
                  + "\n L - Load Game"
                  + "\n G - Save Game"
                  + "\n R - Return"
                  + "\n----------------------------------------");
    }
   @Override 
    public boolean doAction(String value){
        
        value = value.toUpperCase(); // convert input to upper case
        
        switch (value) {
            case "S": // create and start a new game
                this.MiracleMaxStoreView();
                break;
            case "M": // get and start an existing game
                this.displayMap();
                break;
            case "B": // display backpack
                this.displayBackpack();
                break;
            case "K": // display skills
                this.displaySkills();
                break;
            case "A": // display the attack menu
                this.displayAttack();
                break;
            case "L": // Load Game
                this.loadGame();
                break;
            case "G": // Save Game
                this.saveGame();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }

//    private void startNewGame() {
//        GameControl.createNewGame(InitialPlayer.getPlayer());
//        GameMenuView gameMenu = new GameMenuView();
//        gameMenu.displayMenu();
//    }

    private void MiracleMaxStoreView() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        MiracleMaxStoreView MiracleMaxStore = new MiracleMaxStoreView();
        MiracleMaxStore.displayMiracleMaxStoreView();
    }
    private void displayMap() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("\n*** dispalyMap() function called ***");
    }
    private void displayBackpack() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("\n*** dispalyBackpack() function called ***");
    }
    private void displaySkills() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("\n*** displaySkills() function called ***");
    }
    private void displayAttack() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("\n*** displayAttack() function called ***");
    }
    private void loadGame() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("\n*** loadGame() function called ***");
    }
    private void saveGame() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("\n*** saveGame() function called ***");
    }
}
