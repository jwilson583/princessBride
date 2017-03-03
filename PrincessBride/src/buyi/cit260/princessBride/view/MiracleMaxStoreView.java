/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.princessBride.view;

import java.util.Scanner;

/**
 *
 * @author lai
 */
public class MiracleMaxStoreView {

    private String promptMessage;
    private String menu;
    
    public MiracleMaxStoreView() {
        
        // display the banner when view is created
        this.displayBanner();
    }
    
    // banner and menu
    private void displayBanner() {
    
        System.out.println(
                "\n*******************************************************"
              + "\n*                                                     *"
              + "\n* Welcome to Miracle Max Store!                       *"
              + "\n* Wesley, you will need the necessary items with you  *"
              + "\n* in the journey. These items will help you to save   *"
              + "\n* Princess Buttercup successfully. Some of the some   *"
              + "\n* items are not available until you have reached      *"
              + "\n* certain places. You should return to this store to  *"
              + "\n* pickup the items as they will help you to move on   *"
              + "\n* to next level.                                      *"
              + "\n*                                                     *"
              + "\n*******************************************************"
              );

        
        this.menu = "\n"
                  + "\n----------------------------------------"
                  + "\n| Miracle Max Store Item Menu          |"
                  + "\n----------------------------------------"
                  + "\n M - Miracle Potion"
                  + "\n E - Egg"
                  + "\n L - Potion of True Love"
                  + "\n Q - Return to Game Menu"
                  + "\n----------------------------------------";
    }
    
    void displayMiracleMaxStoreView() {
        
        boolean done = false; // set flag to not done
        do {
            // prompt for and get item
            String itemOption = this.getItemOption();
            if (itemOption.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the store
            
            // do the requested action and display the next view
            done = this.doAction(itemOption);
            
        } while (!done);
    }

    private String getItemOption() {
        //System.out.println(this.menu); // display Item Option
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
        
        choice = choice.toUpperCase(); // convert itemOption to upper case
        
        switch (choice) {
            case "M": // create and start Miracle Potion Menu
                this.startMiraclePotion();
                break;
            case "E": // get and start Egg Menu
                this.startEgg();
                break;
            case "L": // get and start Love Menu
                this.startTrueLoveView();
                break;
            case "R": // return to Main Menu
                this.displayGameMenuView();
                break;   
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void startMiraclePotion() {
        // temporary fundtion end
        System.out.println("\n*** startMiraclePotion() function called ***");
    }

    private void startEgg() {
        // temporary fundtion end
        System.out.println("\n*** startEgg() function called ***");
    }

    private void startTrueLoveView() {
        StartTrueLoveView trueLove= new StartTrueLoveView();
        trueLove.displayStartTrueLoveView();
    }

    private void displayGameMenuView() {
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }
}
