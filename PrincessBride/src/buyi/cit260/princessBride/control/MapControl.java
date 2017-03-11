/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.princessBride.control;

import byui.cit260.princessBride.model.Map;
import static byui.cit260.princessBride.model.Map.createScenes;
import byui.cit260.princessBride.model.Scene;

/**
 *
 * @author Lai
 */
public class MapControl {
    public static Map createMap() {
        // create the map
        Map map = new Map(10, 10);
        
        //create the scenes for the game
        Scene[] scenes = createScenes();
        
        //assign scenes to locations
        GameControl.assignScenesToLocations(map, scenes);
        
        return map;
    }

    static void moveActorsToStartingLocation(Map map) {
        System.out.println("\n*** moveActorsToStartingLocation() function called ***");
    }

    private static class MapControlException extends Exception {

        public MapControlException() {
        }
    }
    
}
