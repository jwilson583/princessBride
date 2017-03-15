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
import java.io.PrintWriter;

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
                this.displayInventory();
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
        
        String leftIndicator;
        String rightIndicator;

        Game game = InitialPlayer.getCurrentGame(); // retreive the game
        Map map = game.getMap(); // retreive the map from game
        Location[][] locations = map.getLocations(); // retreive the locations from map

        System.out.println("               The LAND OF FLORIN");
        System.out.println("\n");
        System.out.print("  |");
        for (int column = 0; column < locations[0].length; column++) {
            System.out.print("  " + column + " |"); // print col numbers to side of map
        }
        System.out.println();
        for (int row = 0; row < locations.length; row++) {
            System.out.print(row + " "); // print row numbers to side of map
            for (Location location : locations[row]) {
                leftIndicator = " ";
                rightIndicator = " ";
                if (location == map.getCurrentLocation()) {
                    leftIndicator = "*"; // can be stars or whatever these are indicators showing visited
                    rightIndicator = "*"; // same as above
                } else if (location.isVisited()) {
                    leftIndicator = ">"; // can be stars or whatever these are indicators showing visited
                    rightIndicator = "<"; // same as above
                }
                System.out.print("|"); // start map with a |
                if (location.getScene() == null) {
                    System.out.print(leftIndicator + "??" + rightIndicator);
                } else {
                    System.out.print(leftIndicator + location.getScene().getMapSymbol() + rightIndicator);
                }
            }
            System.out.println("|");

        }

    

    }
 private void displayInventory() {
        this.viewInventory(InitialPlayer.getOutFile());
 }
 
   private void viewInventory(PrintWriter out) {
        // get the sorted list of inventory items for the current game
        InventoryItem[] inventory = GameControl.getSortedInventoryList();
        
        out.println("\n        LIST OF INVENTORY ITEMS");
        StringBuilder line = new StringBuilder("                                                          ");
        line.insert(0, "DESCRIPTION"); 
        line.insert(20, "REQUIRED");
        line.insert(30, "IN STOCK");
        out.println(line.toString());
        
        // for each inventory item
        for (InventoryItem inventoryItem : inventory) {
            line = new StringBuilder("                                                          ");
            line.insert(0, inventoryItem.getDescription());
            line.insert(23, inventoryItem.getRequiredAmount());
            line.insert(33, inventoryItem.getQuantityInStock());
            
            // DISPLAY the description, the required amount and amount in stock
            out.println(line.toString());
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
