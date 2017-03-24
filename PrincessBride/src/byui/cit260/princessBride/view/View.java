/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.princessBride.view;

import princessbride.PrincessBride;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


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
        
        
        String value = null; // value to be returned
        boolean valid = false; // initialize to not valid
     
      
            while (!valid) {
                this.console.println("\n" + this.displayMessage);
                
                try {
                    value = this.keyboard.readLine(); // get next line typed on keyboard
                }
                catch (IOException ex){
                    Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
                }
                value = value.trim(); //Trim off leading and trailing blanks
            
            if (value.length() < 1) { //Value is blank
                ErrorView.display(this.getClass().getName(),
                        "\nInvalid: entry required.");
                continue;
            }
            break; //End the loop
        }
        
        return value; //Return entered value
    }
    
}
