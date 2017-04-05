/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.princessBride.view;

import java.util.Scanner;

/**
 *
 * @author Ben
 */
public class BackpackMenuView extends View {
    
    public BackpackMenuView() {
    super("\n"
            + "\n-------------------------------------------"
            + "\n|              Backpack                   |"
            + "\n-------------------------------------------"
            + "\n 1- Pocket 1                               "
            + "\n 2- Pocket 2                               "
            + "\n 3- Pocket 3                               "
            + "\n 4- Pocket 4                               "
            + "\n Q- Return to Game Menu                      "
            + "\n-------------------------------------------");
    }   
    
    
@Override 
    public boolean doAction(String value) {
       
        
        value = value.toUpperCase(); // convert menuOption to upper case
        
        switch (value) {
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
                 case "Q": // return to Game Menu
                this.displayGameMenuView();
                break;  
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }

    private void getPocket2() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void getPocket1() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void getPocket3() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void getPocket4() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   private void displayGameMenuView() {
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }
    
}

