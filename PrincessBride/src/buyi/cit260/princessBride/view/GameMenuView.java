/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.princessBride.view;

import InitialPlayer.InitialPlayer;
import buyi.cit260.princessBride.control.GameControl;
import byui.cit260.princessBride.model.Game;
import byui.cit260.princessBride.model.InventoryItem;
import byui.cit260.princessBride.model.Location;
import byui.cit260.princessBride.model.Map;
import java.util.Scanner;

/**
 * 
 *
 * @author Lai
 */
public class GameMenuView extends View{
    
    
    
    public GameMenuView() {
              super("\n"
                  + "\n ----------------------------------------"
                  + "\n|               Game Menu                |"
                  + "\n ----------------------------------------"
                  + "\n  M - View Map"
                  + "\n  I - View list of items in inventory"
                  + "\n  S - Miracle Max Store" //will move to Map sub-menu
                  + "\n  B - Dispaly Backpack"  //will move to Map sub-menu
                  + "\n  P - View List of People (Actors)"   
                  + "\n  K - Display Skills"
                  + "\n  A - Display Attack"
                  + "\n  L - Load Game"
                  + "\n  G - Save Game"
                  + "\n  Q - Return to Main Menu"
                  + "\n -----------------------------------------");
    }
   @Override 
    public boolean doAction(String value){
        
        value = value.toUpperCase(); // convert input to upper case
        
        switch (value) {
            case "M": // travel to new location
                this.displayMap();
                break;
            case "I": // view list of items in inventory
                this.viewInventory();
                break;
            case "P": // View list of people (actors)
                this.viewActor();
                break;
            case "S": // travel to Miracle Max Store // will move to Map sub-menu
                this.MiracleMaxStoreView();
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

    /*private void startNewGame() {
        GameControl.createNewGame(InitialPlayer.getPlayer());
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }*/
    
    private void displayMap() {

    }

    private void viewInventory() {
        StringBuilder line;
        
        Game game = InitialPlayer.getCurrentGame();
        InventoryItem[] inventory = game.getInventory();
        
        System.out.println("\n      LIST OF INVENTORY ITEMS");
        line = new StringBuilder("                                  ");
        //line.insert(0, "DESCRIPTION");
        line.insert(20, "Point Required");
        line.insert(30, "Quantity In Stock");
        System.out.println(line.toString());
        
        // for each inventory item
        for (InventoryItem item: inventory) {
            line = new StringBuilder("                                  ");
            //line.insert(0, item.getDescription());
            line.insert(23, item.getPointRequired());
            line.insert(33, item.getQuantityInStock());
            
            // display the line
            System.out.println(line.toString());
        }
    }
    private void viewActor() {
        System.out.println("\n*** viewActor() function called ***");
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
        System.out.println("\n*** displaySkills() function called ***");
    }
    private void AttackMenuView() {
        AttackMenuView AttackMenu = new AttackMenuView();
        AttackMenu.display();
    }
    private void loadGame() {
        System.out.println("\n*** loadGame() function called ***");
    }
    private void saveGame() {
        System.out.println("\n*** saveGame() function called ***");
    }

    private void displayMenu() {
        System.out.println("\n*** displayMenu() function called ***");
    }
}
