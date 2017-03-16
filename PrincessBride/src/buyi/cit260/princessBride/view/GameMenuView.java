/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.princessBride.view;

import InitialPlayer.InitialPlayer;
import buyi.cit260.princessBride.control.CollectedItem;
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
                this.viewInventory();
                break;
            case "P": // View list of people (actors)
                this.viewActorHealth();
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
        String greenBackgroundColor;
        String whiteBackgroundColor;
        //String textColor;
        

        Game game = InitialPlayer.getCurrentGame(); // retreive the game
        Map map = game.getMap(); // retreive the map from game
        Location[][] locations = map.getLocations(); // retreive the locations from map

        System.out.println("                 The LAND OF FLORIN");
        //System.out.println("\n");
        System.out.print("\n  ");
        for (int column = 0; column < locations[0].length; column++) {
            System.out.print("  " + column + "  "); // print col numbers to side of map
        }
        System.out.println();
        System.out.print("   ");
        for (int i = 1; i < 50; i++) {
            System.out.print("-");
            }
        System.out.println();
        for (int row = 0; row < locations.length; row++) {
            System.out.print(row + " "); // print row numbers to side of map
            for (int column = 0; column < locations[row].length; column++) {
                leftIndicator = " ";
                rightIndicator = " ";
                if (locations[row][column] == map.getCurrentLocation()) {
                    leftIndicator = "*"; // can be stars or whatever these are indicators showing visited
                    rightIndicator = "*"; // same as above
                } else if (locations[row][column].isVisited()) {
                    leftIndicator = ">"; // can be stars or whatever these are indicators showing visited
                    rightIndicator = "<"; // same as above
                }
                System.out.print("|"); // start map with a |
                if (locations[row][column].getScene() == null) {
                    System.out.print(leftIndicator + "??" + rightIndicator);
                } else {
                    greenBackgroundColor = "\u001B[42m";
                    whiteBackgroundColor = "\u001B[0m";
                            //textColor = "\b\u001B[37m";
                    System.out.print(leftIndicator + greenBackgroundColor + locations[row][column].getScene().getMapSymbol() + whiteBackgroundColor + rightIndicator);
                }
            }
            System.out.println("|");
            System.out.print("   ");
                for (int i = 1; i < 50; i++) {
                    System.out.print("-");
                    }
            System.out.println();
        }
    }

    private void viewInventory() {
        StringBuilder line;
        
        Game game = InitialPlayer.getCurrentGame();
        InventoryItem[] inventory = game.getInventory();
        
        System.out.println("              LIST OF INVENTORY ITEMS");
        System.out.println();
        line = new StringBuilder("                                  ");
        line.insert(0, "Name");
        line.insert(20, "Point Required");
        line.insert(40, "Quantity In Stock");
        System.out.println(line.toString());
        
        
        for (InventoryItem item: inventory) {
            line = new StringBuilder("                                  ");
            line.insert(0, item.getName());
            line.insert(20, item.getPointRequired());
            line.insert(40, item.getQuantityInStock());
 
            // display the line
            System.out.println(line.toString());
        }
    }

    private void viewActorHealth() {
        
        StringBuilder line;
        
        Game game = InitialPlayer.getCurrentGame();
        CollectedItem[] collect = game.getCollect();
        
        System.out.println("              LIST OF ACTOR COLLECTION");
        System.out.println();
        line = new StringBuilder("                                  ");
        line.insert(0, "Name");
        line.insert(20, "True Love");
        line.insert(40, "Iocane Power");
        System.out.println(line.toString());
        
        
        for (CollectedItem actor: collect) {
            line = new StringBuilder("                                  ");
            line.insert(0, actor.getActorName());
            line.insert(20, actor.getTrueLove());
            line.insert(40, actor.getIocanePowder());
 
            // display the line
            System.out.println(line.toString());
        }
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
