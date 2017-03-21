/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.princessBride.view;

import byui.cit260.princessBride.control.MapControl;
import byui.cit260.princessBride.model.Actor;
import java.awt.Point;

/**
 *
 * @author school
 */
public class MoveActorView {
    
 public MoveActorView() {
     String name = "\n"
             + "\n---------------------------------------------"
             + "\n| Select actor to move                       |"
             + "\n---------------------------------------------"
             + "\nV - Vizzini"
             + "\nF - Fezzik"
             + "\nM - Miracle Max"
             + "\nI - Inigo Montoya"
             + "\nQ - Quit"
             + "\n---------------------------------------------";
    }

    public boolean doAction(String choice) {
        Actor actor; 
        
        choice = choice.trim().toUpperCase(); // trim blanks and uppercase
        
        // check for valid actor
        switch (choice) {
            case "V":
                actor = Actor.vizzini;
                break;
            case "F":
                actor = Actor.fezzik;
                break;   
            case "M":
                actor = Actor.miracleMax;
                break;  
            case "I":
                actor = Actor.inigoMontoya;
                break; 
            case "Q":
                return true;
            default:
                System.out.println("Invalid selection");
                return false;
        }
        
       
        boolean done = false;
        do {

            // prompt for and get the row and column numbers
            System.out.println("\nEnter the row and column number of the location (e.g., 1 3)");
            Point coordinates = this.getCoordinates(); // get the row and column
            if (coordinates == null) // entered "Q" to quit
                break;

            // move actor to specified location
            int returnValue = MapControl.moveActorToLocation(actor, coordinates);
            if (returnValue < 0) {
                System.out.println("\nERROR" + actor + 
                               " counld not be moved to location: " + 
                               coordinates.x + ", " + coordinates.y);
            }

            System.out.println("\n" + actor + 
                               " was successfully moved to location: " + 
                               coordinates.x + ", " + coordinates.y);
            done = true;

        } while (!done);

        return false;  
    }
    
    public Point getCoordinates() {
        
        String value = this.getInput();
        value = value.trim().toUpperCase();
        if (value.equals("Q"))
            return null;

        //tokenize values int string
        String[] values = value.split(" ");

        if (values.length < 2) {
            System.out.println("You must enter both a row and column number.");
            return null;
        }

        // parse out row and column numbers
        int row = Integer.parseInt(values[0]);
        int column = Integer.parseInt(values[1]);
        return new Point(row, column);
     
    }

    private String getInput() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
