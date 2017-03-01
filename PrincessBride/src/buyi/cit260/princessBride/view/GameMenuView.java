/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.princessBride.view;

import java.util.Scanner;

/**
 * 
 *
 * @author Lai
 */
public class GameMenuView {
    //void displayMenu() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      //  System.out.println("\n*** displayMenu stub function called ***");
    //}
    private String menu;
    
    public GameMenuView() {
        this.menu = "\n"
                  + "\n----------------------------------------"
                  + "\n| Game Menu                            |"
                  + "\n----------------------------------------"
                  + "\n S - Miracle Max Store"
                  + "\n M - Display Map"
                  + "\n B - Dispaly Backpage"
                  + "\n K - Display Skills"
                  + "\n A - Display Attack"
                  + "\n L - Load Game"
                  + "\n G - Save Game"
                  + "\n R - Return"
                  + "\n----------------------------------------";
    }
    
    void displayGameMenuView() {
        
        boolean done = false; // set flag to not done
        do {
            // prompt for and get plyers name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("R")) // user wants to return to Main Menu
                return; // return to main Menu
            
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
        
        choice = choice.toUpperCase(); // convert input to upper case
        
        switch (choice) {
            case "S": // create and start a new game
                this.MiracleMaxStoreView();
                break;
            case "M": // get and start an existing game
                this.displayMap();
                break;
            case "B": // display backpack
                this.displayBackpack();
                break;
            case "K": // display skills
                this.displaySkills();
                break;
            case "A": // display the attack menu
                this.displayAttack();
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

//    private void startNewGame() {
//        GameControl.createNewGame(InitialPlayer.getPlayer());
//        GameMenuView gameMenu = new GameMenuView();
//        gameMenu.displayMenu();
//    }

    private void MiracleMaxStoreView() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        MiracleMaxStoreView MiracleMaxStore = new MiracleMaxStoreView();
        MiracleMaxStore.displayMiracleMaxStoreView();
    }
    private void displayMap() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("\n*** dispalyMap() function called ***");
    }
    private void displayBackpack() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("\n*** dispalyBackpack() function called ***");
    }
    private void displaySkills() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("\n*** displaySkills() function called ***");
    }
    private void displayAttack() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("\n*** displayAttack() function called ***");
    }
    private void loadGame() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("\n*** loadGame() function called ***");
    }
    private void saveGame() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("\n*** saveGame() function called ***");
    }
}
