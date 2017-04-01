/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.princessBride.view;

import byui.cit260.princessBride.control.MapControl;
import byui.cit260.princessBride.model.Actor;
import byui.cit260.princessBride.model.Game;
import byui.cit260.princessBride.model.Location;
import byui.cit260.princessBride.model.Map;
import java.awt.Point;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import princessbride.PrincessBride;
import byui.cit260.princessBride.model.Player;


/**
 *
 * @author Lai/Ben
 */
public class MapMenuView extends View{

    public MapMenuView (){
        super("\n"
            + "\n  ----------------------------------------"
            + "\n | Map Menu                               |"
            + "\n  ----------------------------------------"
            + "\n M - Map of Florin"
            + "\n K - Map Legend"
            + "\n U - Move Up"
            + "\n D - Move Down"
            + "\n L - Move Left"
            + "\n R - Move Right"
            + "\n F - Florin Farm"
            + "\n I - Cliffs of Insanity"
            + "\n G - Guilder Frontier"
            + "\n S - Fire Swamp"
            + "\n T - Thieves Forest"
            + "\n P - Pit of Despair"
            + "\n C - Florin Castle"
            + "\n A - Print Actor Report"
            + "\n W - Write Map Report"
            + "\n Q - Return to Main Menu"
            + "\n------------------------------------------");
    }
    
    

    @Override
    public boolean doAction(String value){
        
        
        value = value.toUpperCase(); // convert menuOption to upper case
        
        switch (value) {
            case "M": // display map of Florin
                this.displayMap();
                break;
            case "K": // list scenes on map
                this.displaylegend();
                break;
            case "U": // Move up
                this.moveUp();
                break;
            case "D": // Move down
                this.moveDown();
                break;
            case "L": // Move left
                this.MoveLeft();
                break;
            case "R": // Move right
                this.moveRight();
                break;
            case "F": // display Florin Farm Menu
                this.displayFlorinFarmMap();
                break;
            case "I": // display Cliffs of Insanity Menu
                this.displayCliffsOfInsanityMap();
                break;
            case "G": // display Gilder Frontier Menu
                this.displayGilderFrontierMap();
                break;
            case "S": // display Fire Swamp Menu
                this.displayFireSwampMap();
                break;
            case "T": // display FThieves Forest Menu
                this.displayThievesForestMap();
                break;
            case "P": // display Pit of Despair Menu
                this.displayPitOfDespairMap();
                break;
            case "C": // display Florin Castle Menu
                this.displayFlorinCastleMap();
                break;
            case "A": // Print Actor Report
                this.printActorReport();
                break;
            case "W": // print list of Scenes
                this.MapReport();
                break;
            case "Q": // return to main menu
                this.displayMainMenuView();
                break;
                
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void displayMainMenuView() {
        MainMenuView mainMenu= new MainMenuView ();
        mainMenu.display();
    }
    
    private void viewActors(PrintWriter out) {
        Game game = PrincessBride.getCurrentGame();
        out.println("\n    LIST OF ACTORS");
        StringBuilder line = new StringBuilder("                                                          ");
        line.insert(0, "NAME"); 
        line.insert(15, "LOCATION");
        out.println(line.toString());
        
        Actor[] actors = Actor.values();
        for (Actor actor : actors) {
            //Point coordinates = game.getActorsLocation()[actor.ordinal()];
            line = new StringBuilder("                                                          ");
            line.insert(0, actor.name());
            //int row = coordinates.x+1;
            //int column = coordinates.y+1;
            //line.insert(17,  + row + ", " + column);
            out.println(line.toString());
        }
        
     }
 
   public void printActorReport() {
        LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        String dateTime = formatter.format(currentTime);
       
        // get the filepath and name of the file
        this.console.println("\nEnter the file path where the report is to be saved");
        
        String filePath = this.getInput();
        if (filePath == null) {
            return;
        }
        
        // Create a new printwriter
        try (PrintWriter reportFile = new PrintWriter(filePath)) {
            
            

            reportFile.println("Report printed: " + dateTime);
          
            reportFile.println();
            this.viewActors(reportFile); 
            
            PrincessBride.getOutFile().println(
                    "\n*** Report printed to file: " + filePath + " ***");
            
        } catch (Exception ex) {
            ErrorView.display("GameMenuView", "Error writing to game report file. "
                    + "\n\t" + ex.getMessage());
        }
   }

    private void moveUp() {
        Game game = PrincessBride.getCurrentGame(); // retreive the game
        Map map = game.getMap(); // retreive the map from game
        //Location[][] locations = map.getLocations(); // retreive the locations from map

        if (map.getCurrentRow() > 0) {
            MapControl.movePlayer(map, map.getCurrentRow() - 1, map.getCurrentColumn());
        } else {
            this.console.println("\nCannot move up any further.");
        }
    }

    private void moveDown() {
        Game game = PrincessBride.getCurrentGame(); //retrieve the game
        Map map = game.getMap(); // retreive the map from game

        if (map.getCurrentRow() < map.getRowCount() - 1) {
            MapControl.movePlayer(map, map.getCurrentRow() + 1, map.getCurrentColumn());
        } else {
            this.console.println("\nCannot move down any furter.");
        }
    }

    private void MoveLeft() {
        Game game = PrincessBride.getCurrentGame(); // retreive the game
        Map map = game.getMap(); // retreive the map from game
        //Location[][] locations = map.getLocations(); // retreive the locations from map

        if (map.getCurrentColumn() > 0) {
            MapControl.movePlayer(map, map.getCurrentRow(), map.getCurrentColumn() - 1);
        } else {
            this.console.println("\nCannot move any further to the left.");
        }
    }

    private void moveRight() {
        Game game = PrincessBride.getCurrentGame(); // retreive the game
        Map map = game.getMap(); // retreive the map from game
        //Location[][] locations = map.getLocations(); // retreive the locations from map

        if (map.getCurrentColumn() < map.getColumnCount() - 1) {
            MapControl.movePlayer(map, map.getCurrentRow(), map.getCurrentColumn() + 1);
        } else {
            this.console.println("\nCannot move any further to the right.");
        }
        
        
    }
   
   
   
   private void displayMap() {
        
        String indicator;

        Game game = PrincessBride.getCurrentGame(); // retreive the game
        Map map = game.getMap(); // retreive the map from game
        Location[][] locations = map.getLocations(); // retreive the locations from map

        System.out.println("\n                 The LAND OF FLORIN");
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
                indicator = "\u001B[0m";

                if (locations[row][column] == map.getCurrentLocation()) {
                    indicator = "\u001B[45m"; // indicators showing player current location

                } else if (locations[row][column].isVisited()) {
                    indicator = "\u001B[46m"; // indicators showing visited

                }
                System.out.print("|"); // start map with a |
                if (locations[row][column].getScene() == null) {
                    System.out.print(indicator + "    " + "\u001B[0m");
                } else {
                    System.out.print(indicator + " " + "\u001B[44;37m" + locations[row][column].getScene().getMapSymbol() + indicator + " " + "\u001B[0m");
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
   
   private void MapReport() {
        
        Game game = PrincessBride.getCurrentGame();
        Map map = game.getMap(); // retreive the map from game
        Location[][] locations = map.getLocations(); // retreive the locations from map
        
        LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        String dateTime = formatter.format(currentTime);

        this.console.println("\nEnter the file path for file where the Map Report"
                            + " is to be saved.");
        String filePath = this.getInput();
        
        //create BufferedReader object for input file e.g. /Users/edwinyam/Downloads/test.txt
        try (FileWriter outFile = new FileWriter(filePath, false)) {
            
            outFile.write("\n" + dateTime);
            // print title and column headings
            outFile.write("\n\n               Map Report            \n");  //change out.println to System.out.println
            outFile.write(String.format("%n%-20s%10s%10s", "Place Name", "Symbol", "Location"));
            outFile.write(String.format("%n%-20s%10s%10s", "------------------", "--------", "--------"));
            
            // print the description, quanity and pric of each item
            for (int row = 0; row < locations.length; row++) {
            
                for (int column = 0; column < locations[row].length; column++) {

                    if (locations[row][column].getScene() != null) {

                        outFile.write(String.format("%n%-20s%10s%10s", locations[row][column].getScene().getDescription() 
                                                            , locations[row][column].getScene().getMapSymbol()
                                                            , "(" + row + "," + column + ")"));
                    }
                }
            }
            outFile.flush(); // flush out any data left in the file stream
            
        } catch (Exception ex) {
            ErrorView.display("MapMenuView", "Error writing to game report file. "
                    + "\n\t" + ex.getMessage());
        }
                    System.out.println("Map Report has been saved.");
    }

    private void displaylegend() {
        Game game = PrincessBride.getCurrentGame();
        Map map = game.getMap(); // retreive the map from game
        Location[][] locations = map.getLocations(); // retreive the locations from map

            // print title and column headings*/
            System.out.println("\n\n               Map Report            \n");  //change out.println to System.out.println
            System.out.printf("%n%-20s%10s%10s", "Place Name", "Symbol", "Location");
            System.out.printf("%n%-20s%10s%10s", "------------------", "--------", "--------");
            
            // print the description, quanity and pric of each item
            for (int row = 0; row < locations.length; row++) {
            
                for (int column = 0; column < locations[row].length; column++) {

                    if (locations[row][column].getScene() != null) {

                        System.out.printf("%n%-20s%10s%10s", locations[row][column].getScene().getDescription() 
                                                            , "       \u001B[44;37m" + locations[row][column].getScene().getMapSymbol() + "\u001B[0m "
                                                            , "(" + row + "," + column + ")");
                    }
                }
            }
            System.out.printf("%n%-20s%10s%10s", "Player"
                                                , "      \u001B[45m" + "    " + "\u001B[0m"
                                                , "(" + map.getCurrentRow() + "," + map.getCurrentColumn() + ")");
            //System.out.println(player.getName());
    }

    private void displayFlorinFarmMap() {
        System.out.println("Menu is not avariable until you have reached the Location.");
    }

    private void displayCliffsOfInsanityMap() {
        System.out.println("Menu is not avariable until you have reached the Location.");
    }

    private void displayGilderFrontierMap() {
        System.out.println("Menu is not avariable until you have reached the Location.");
    }

    private void displayFireSwampMap() {
        System.out.println("Menu is not avariable until you have reached the Location.");
    }

    private void displayThievesForestMap() {
        System.out.println("Menu is not avariable until you have reached the Location.");
    }

    private void displayPitOfDespairMap() {
        System.out.println("Menu is not avariable until you have reached the Location.");
    }

    private void displayFlorinCastleMap() {
        System.out.println("Menu is not avariable until you have reached the Location.");
    }
}