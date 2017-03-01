/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.princessBride.view;

/**
 *
 * @author Ben
 */

public class Travelview{
private String menu;
   public Travelview(){
        this.menu=
                  "\n"
                + "\n-----------"
                + "\nACTION MENU"
                + "\n-----------"  
                + "\nO = Open an unlocked door"
                + "\nT = Talk to someone next to you"
                + "\nP = Pick up an Item"
                + "\nA = interAct with the environment"
                + "\nH = Help Menu"
                + "\nQ = Quit back to GAME MENU";
    }
public boolean doAction(String value) {
        
        value = value.toUpperCase();
        
        switch (value) {
            case "O": //open an unlocked door
                this.openDoor();
                break;
            case "T": //talk to someone next to you
                this.talk();
                break;
            case "P": //Pick up an item
                this.pickUpItem();
                break;
            case "A": //interAct with the environement
                this.interact();
                break;
            case "H": //help menu
                this.displayHelpMenu();
                break;
            default:
                System.out.println("\n***Invalid selection, please enter a menu option***");
                break;
        }

        return false;


    }

    private void openDoor() {
        System.out.println("\n***openDoor called***");
    }

    private void talk() {
        System.out.println("\n***talk called***");
    }

    private void pickUpItem() {
        System.out.println("\n***pickUpItem called***");
    }

    private void interact() {
        System.out.println("\n***interact called");
    }

    private void displayHelpMenu() {
        // Create HelpMenuView object
        HelpMenuView helpMenu = new HelpMenuView();
                
        //display the help menu
        helpMenu.displayHelpMenuView();  
    }
}