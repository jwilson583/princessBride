/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.princessBride.view;

import java.util.Scanner;

/**
 *
 * @author school
 */
public class BackpackMenuView {
 private String menu;
    
    public BackpackMenuView() {
    this.menu= "\n"
            + "\n-------------------------------------------"
            + "\n|              Backpack                   |"
            + "\n-------------------------------------------"
            + "\n 1- Pocket 1                               "
            + "\n 2- Pocket 2                               "
            + "\n 3- Pocket 3                               "
            + "\n 4- Pocket 4                               "
            + "\n E- exit back to game                      "
            + "\n-------------------------------------------";
    }   
void displayBackpackMenuView() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //System.out.println("\n*** displayMenu() function called ***");
        
        /**
         * displays the start program view
         */
        
        boolean done = false; // set flag to not done
        do {
            // prompt for and get plyers name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("E")) // user wants to quit
                return; // exit to the game
            
            // do the requested action and display the next view
            done = this.doAction(menuOption);
            
        } while (!done);
    }

    private String getMenuOption() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //System.out.println("\n*** getMenuOption() function call ***");
        //return "N";
        //System.out.println(this.menu); // display Menu Option
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
     
        while (!valid) { // loop while an invalid value is enter
            System.out.println("\n" + this.menu);
         
            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks
         
            if (value.length() < 1) { // value is blank
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }
          
            break; //end the loop
        
        }
        
        return value; // return the value entered
    }

    private boolean doAction(String choice) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //System.out.println("\n*** doAction() function called ***)");
        //return true;
        
        choice = choice.toUpperCase(); // convert menuOption to upper case
        
        switch (choice) {
            case "1": //open pocket 1
                this.getPocket1();
                break;
            case "2": // open pocket 2
                this.getPocket2();
                break;
            case "3": // open pocket 3
                this.getPocket3();
                break;
            case "4": // open pocket 4
                this.getPocket4();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }

    private void getPocket2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void getPocket1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void getPocket3() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void getPocket4() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

