/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.princessBride.view;

import byui.cit260.princessBride.model.Actor;
import byui.cit260.princessBride.model.Game;
import java.awt.Point;
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
            + "\n F - Florin Farm"
            + "\n I - Cliffs of Insanity"
            + "\n G - Guilder Frontier"
            + "\n S - Fire Swamp"
            + "\n L - Greenland"
            + "\n T - Thieves Forest"
            + "\n P - Pit of Despair"
            + "\n C - Florin Castle"
            + "\n R - Print Actor Report"
            + "\n Q - Return to Main Menu"
            + "\n------------------------------------------");
    }
    
    

    @Override
    public boolean doAction(String value){
        
        
        value = value.toUpperCase(); // convert menuOption to upper case
        
        switch (value) {
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
        // get the filepath and name of the file
        this.console.println("\nEnter the file path where the report is to be saved");
        
        String filePath = this.getInput();
        if (filePath == null) {
            return;
        }
        
        // Create a new printwriter
        try (PrintWriter reportFile = new PrintWriter(filePath)) {
            
            
            LocalDateTime currentTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            String dateTime = formatter.format(currentTime);
            
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
}