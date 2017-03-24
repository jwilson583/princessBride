/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.princessBride.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import princessbride.PrincessBride;

/**
 *
 * @author Jack Wilson
 */
public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    
    protected final BufferedReader keyboard = PrincessBride.getInFile();
    protected final PrintWriter console = PrincessBride.getOutFile();
    
    public View (){
      
    }
    public View (String message) {
        this.displayMessage = message;
    }
@Override
public void display() {
              
        boolean done = false; // set flag to not done
        do {
            // prompt for and get plyers name
            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(value);
            
        } while (!done);
}

@Override
public String getInput() {
        
        
        String selection = null; // value to be returned
        boolean valid = false; // initialize to not valid
     
      
            while (!valid) { try {
                // loop while an invalid value is enter
                                
                
                selection = this.keyboard.readLine(); // get next line typed on keyboard
                selection = selection.trim(); // trim off leading and trailing blanks
                
                if (selection.length() < 1) { // value is blank
                    ErrorView.display(this.getClass().getName(), 
                                      "You must enter a value.");
                    continue;
                }
                
                break; //end the loop
            } catch (Exception e) {
            ErrorView.display(this.getClass().getName(), 
                              "Error reading input: " + e.getMessage());
            return null;
            }
        }
        
        
        return selection; // return the value entered
    }        
}

