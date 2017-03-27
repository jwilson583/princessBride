/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.princessBride.view;

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
            + "\n M - View Map of Florin"
            + "\n F - Florin Farm"
            + "\n I - Cliffs of Insanity"
            + "\n G - Guilder Frontier"
            + "\n S - Fire Swamp"
            + "\n L - Greenland"
            + "\n T - Thieves Forest"
            + "\n P - Pit of Despair"
            + "\n C - Florin Castle"
            + "\n R - Print Actor Report"
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
            case "F": // display Florin Farm Map
                this.displayFlorinFarmMap();
                break;
            case "I": // display Florin Farm Map
                this.displayCliffsOfInsanityMap();
                break;
            case "G": // display Florin Farm Map
                this.displayGuilderFrontierMap();
                break;
            case "S": // display Florin Farm Map
                this.displayFireSwampMap();
                break;
            case "L": // display Florin Farm Map
                this.displayGreenlandMap();
                break;
            case "T": // display Florin Farm Map
                this.displayThievesForestMap();
                break;
            case "P": // display Florin Farm Map
                this.displayPitOfDespairMap();
                break;
            case "C": // display Florin Farm Map
                this.displayFlorinCastleMap();
                break;
            case "R": // Print Actor Report
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

    private void displayFlorinFarmMap() {
        System.out.println("\n*** displayFlorinFarmMap() function called ***");
    }

    private void displayCliffsOfInsanityMap() {
        System.out.println("\n*** displayCliffsOfInsanityMap() function called ***");
    }

    private void displayGuilderFrontierMap() {
        System.out.println("\n*** displayGuilderFrontierMap() function called ***");
    }

    private void displayFireSwampMap() {
        System.out.println("\n*** displayFireSwampMap() function called ***");
    }

    private void displayGreenlandMap() {
        System.out.println("\n*** displayGreenlandMap() function called ***");
    }

    private void displayThievesForestMap() {
        System.out.println("\n*** displayThievesForestMap() function called ***");
    }

    private void displayPitOfDespairMap() {
        System.out.println("\n*** displayPitOfDespairMap() function called ***");
    }

    private void displayFlorinCastleMap() {
        System.out.println("\n*** displayFlorinCastleMap() function called ***");
    }

    private void displayMainMenuView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
            Point coordinates = game.getActorsLocation()[actor.ordinal()];
            line = new StringBuilder("                                                          ");
            line.insert(0, actor.name());
            int row = coordinates.x+1;
            int column = coordinates.y+1;
            line.insert(17,  + row + ", " + column);
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
   
   private void displayMap() {
        
        String leftIndicator;
        String rightIndicator;
        String greenBackgroundColor;
        String whiteBackgroundColor;

        Game game = PrincessBride.getCurrentGame(); // retreive the game
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
   
   private void MapReport() {
        
        Game game = PrincessBride.getCurrentGame();
        Map map = game.getMap(); // retreive the map from game
        Location[][] locations = map.getLocations(); // retreive the locations from map
        
        LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        String dateTime = formatter.format(currentTime);

        this.console.println("\nEnter the file path for file where the Map Report"
                            + "is to be saved.");
        String filePath = this.getInput();
        
        //create BufferedReader object for input file e.g. /Users/edwinyam/Downloads/test.txt
        try (FileWriter outFile = new FileWriter(filePath, false)) {
            
            outFile.write("\n" + dateTime);
            // print title and column headings
            outFile.write("\n\n               Map Report            \n");  //change out.println to System.out.println
            outFile.write(String.format("%n%-20s%10s%10s", "Place Name", "Symbol", "Location"));
            outFile.write(String.format("%n%-20s%10s%10s", "------------------", "--------", "------"));
            
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
}