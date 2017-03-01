/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.princessBride.view;

import java.util.Scanner;

/**
 *
 * @author Lai
 */
public class StartTrueLoveView {

    private String menu;
    private int inventoryLove = 1;
    
    // display start ture menu
    public StartTrueLoveView() {
        
        this.menu = "\n"
                          + "\n ----------------------------------------"
                          + "\n|   True Love Menu                      |"
                          + "\n ----------------------------------------"
                          + "\n S - Start"
                          + "\n I - Inventory"
                          + "\n H - Help"
                          + "\n Q - Return"
                          + "\n----------------------------------------"; 
    }

    /**
     *
     */
    void displayStartTrueLoveView() {
    
        boolean done = false; // set flag to not done
        do {
            //prompt for and get response
            String menuLove = this.getMenuLove();
            if (menuLove.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game

            //System.out.println("\n Edwin");
            
            done = this.doAction(menuLove);
            
        } while (!done);

    }
    
    private String getMenuLove() {

        Scanner keyboard = new Scanner(System.in);
        String menuLove = ""; // ans to be returned
        boolean valid = false; // initialize to not valid
        
        while (!valid) { // loop while an invalid value is enter
            System.out.println("\n" + this.menu);
            
            menuLove = keyboard.nextLine(); // get next line typed on keyboard
            menuLove = menuLove.trim(); // trim off leading and trailing blanks
            
            if (menuLove.length() < 1) { // value is blank
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }
            break; //end the loop
        }
        
        //System.out.println(ans + "Edwin");
        return menuLove;
    }

    private boolean doAction(String menuLove) {

        menuLove = menuLove.toUpperCase(); // convert menuLove to upper case
        switch (menuLove) {
            case "S": // start True Love section
                if (inventoryLove > 0) {
                    this.TrueLove();
                } else {
                    System.out.println("\nSorry! True Love always sold out!");
                }
                break;
            case "I": // check if True Love available
                this.startInventory();
                break;
            case "H": // display help menu
                this.displayHelp();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
            }
        return false;
    }
    
    private void TrueLove() {
        System.out.println("\n*** TrueLove() function called ***");
    }

    private void startInventory() {
        System.out.println("\n*** startInventory() function called ***");
    }

    private void displayHelp() {
        System.out.println("\n*** displayHelp() function called ***");
    }

}