/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.princessBride.view;

/**
 *
 * @author Lai
 */
public class MapMenuView extends View{

    public MapMenuView (){
        super("\n"
            + "\n  ----------------------------------------"
            + "\n | Map Menu                               |"
            + "\n  ----------------------------------------"
            + "\n F - Florin Farm"
            + "\n I - Cliffs of Insanity"
            + "\n G - Guilder Frontier"
            + "\n S - Fire Swamp"
            + "\n L - Greenland"
            + "\n T - Thieves Forest"
            + "\n P - Pit of Despair"
            + "\n C - Florin Castle"
            + "\n Q - Return to Main Menu"
            + "\n------------------------------------------");
    }
    
    

    @Override
    public boolean doAction(String value){
        
        
        value = value.toUpperCase(); // convert menuOption to upper case
        
        switch (value) {
            case "F": // display Florin Farm Map
                this.displayFlorinFarmMap();
                break;
            case "I": // display Florin Farm Map
                this.displayCliffsOfInsanityMap();
                break;
            case "G": // display Florin Farm Map
                this.displayGuilderFrontierMap();
                break;
            case "S": // display Florin Farm Map
                this.displayFireSwampMap();
                break;
            case "L": // display Florin Farm Map
                this.displayGreenlandMap();
                break;
            case "T": // display Florin Farm Map
                this.displayThievesForestMap();
                break;
            case "P": // display Florin Farm Map
                this.displayPitOfDespairMap();
                break;
            case "C": // display Florin Farm Map
                this.displayFlorinCastleMap();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void displayFlorinFarmMap() {
        System.out.println("\n*** displayFlorinFarmMap() function called ***");
    }

    private void displayCliffsOfInsanityMap() {
        System.out.println("\n*** displayCliffsOfInsanityMap() function called ***");
    }

    private void displayGuilderFrontierMap() {
        System.out.println("\n*** displayGuilderFrontierMap() function called ***");
    }

    private void displayFireSwampMap() {
        System.out.println("\n*** displayFireSwampMap() function called ***");
    }

    private void displayGreenlandMap() {
        System.out.println("\n*** displayGreenlandMap() function called ***");
    }

    private void displayThievesForestMap() {
        System.out.println("\n*** displayThievesForestMap() function called ***");
    }

    private void displayPitOfDespairMap() {
        System.out.println("\n*** displayPitOfDespairMap() function called ***");
    }

    private void displayFlorinCastleMap() {
        System.out.println("\n*** displayFlorinCastleMap() function called ***");
    }
}
