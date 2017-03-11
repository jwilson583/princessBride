/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.princessBride.control;

import byui.cit260.princessBride.model.Map;

/**
 *
 * @author Lai
 */
public class MapControl {
    public static Map createMap() throws MapControlException {
        // create the map
        Map map = null;
        
        System.out.println("\n *** createMap() called *** ");
        
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
