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
                  + "\n B - Dispaly Backpack"
                  + "\n K - Display Skills"
                  + "\n A - Display Attack"
                  + "\n L - Load Game"
                  + "\n G - Save Game"
                  + "\n Q - Return to Main Menu"
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
                this.MapMenuView();
                break;
            case "B": // display backpack
                this.BackpackMenuView();
                break;
            case "K": // display skills
                this.displaySkills();
                break;
            case "A": // display the attack menu
                this.AttackMenuView();
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

    private void startNewGame() {
        GameControl.createNewGame(InitialPlayer.getPlayer());
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void MiracleMaxStoreView() {
        MiracleMaxStoreView MiracleMaxStore = new MiracleMaxStoreView();
        MiracleMaxStore.display();
    }
    private void MapMenuView() {
        MapMenuView MapMenu = new MapMenuView();
        MapMenu.display();
    }
    private void BackpackMenuView() {
        BackpackMenuView BackpackMenu = new BackpackMenuView();
        BackpackMenu.display();
    }
    private void displaySkills() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("\n*** displaySkills() function called ***");
    }
    private void AttackMenuView() {
        AttackMenuView AttackMenu = new AttackMenuView();
        AttackMenu.display();
    }
    private void loadGame() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("\n*** loadGame() function called ***");
    }
    private void saveGame() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("\n*** saveGame() function called ***");
    }

    private void displayMenu() {
        System.out.println("\n*** displayMenu() function called ***");
    }
}
