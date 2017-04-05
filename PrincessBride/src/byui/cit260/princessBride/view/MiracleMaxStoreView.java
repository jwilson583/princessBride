/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.princessBride.view;

import byui.cit260.princessBride.model.Game;
import byui.cit260.princessBride.model.InventoryItem;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import princessbride.PrincessBride;

/**
 *
 * @author lai/Ben
 */
public class MiracleMaxStoreView extends View {

    
    public MiracleMaxStoreView() {
        
        // display the banner and menu

        
        super("\n*******************************************************"
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
              + "\n"
              + "\n"
              + "\n  ----------------------------------------"
              + "\n  | Miracle Max Store Item Menu          |"
              + "\n  ----------------------------------------"
              + "\n    M - Miracle Potion"
              + "\n    E - Egg"
            //+ "\n L - Potion of True Love"
              + "\n    O - Print Inventory"
              + "\n    Q - Return to Game Menu"
              + "\n  ----------------------------------------");
        
    }
    

@Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase(); // convert itemOption to upper case
        
        switch (value) {
            case "M": // create and start Miracle Potion Menu
                this.startMiraclePotion();
                break;
            case "E": // get and start Egg Menu
                this.startEgg();
                break;
                case "O":    
                this.PrintInventory ();
                break;
            //case "L": // get and start Love Menu
            //    this.startTrueLoveView();
            //    break;
            case "Q": // return to Game Menu
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

    /*private void startTrueLoveView() {
        StartTrueLoveView trueLove= new StartTrueLoveView();
        trueLove.display();
    }*/

    private void displayGameMenuView() {
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }
    
     private void PrintInventory() {
     
        Game game = PrincessBride.getCurrentGame();
        InventoryItem[] inventory = game.getInventory();
        this.console.println("\nEnter the file path where the report is to be saved");
        
        String filePath = this.getInput();
        if (filePath == null) {
            return;
        }
        
        try (PrintWriter out = new PrintWriter(filePath)){
           out.println("\n\n          Inventory Sheet                        ");
           out.printf("%n%-20s%20s%20s","Name","Quantity","Description");
           out.printf("%n%-20s%20s%20s","-----","-------","-----------");
                      
           for (InventoryItem item : inventory){
               out.printf("%n%-20s%20s%20s", item.getName()
                                           , item.getQuantityInStock()
                                           , item.getDescription());
           }
           
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GameMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }System.out.println(" Inventory sheet has been saved.");
    }
}
