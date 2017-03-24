/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.princessBride.control;

import princessbride.PrincessBride;
import byui.cit260.princessBride.exceptions.MapControlException;
import byui.cit260.princessBride.model.Actor;
import byui.cit260.princessBride.model.Map;
import static byui.cit260.princessBride.model.Map.createScenes;
import byui.cit260.princessBride.model.Scene;
import java.awt.Point;


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

    public static void moveActorsToStartingLocation(Map map) 
                        throws MapControlException {
        // for every actor
        Actor[] actors = Actor.values();
        
        for (Actor actor : actors) {
            Point coordinates = actor.getCoordinates();
            MapControl.moveActorToLocation(actor, coordinates);
        }
    }

    public static Object getLocation(Point blockedLocation) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void moveActorToLocation(Actor actor, Point coordinates) 
                            throws MapControlException {
        
        Map map = PrincessBride.getCurrentGame().getMap();
        int newRow = coordinates.x-1;
        int newColumn = coordinates.y-1;
        
        if (newRow < 0 || newRow >= map.getRowCount() ||
            newColumn < 0 || newColumn >= map.getColumnCount()) {
            //return -1;
            throw new MapControlException("Cannot move actor to location "
                                         + coordinates.x + ", " + coordinates.y
                                         + " because that location is outside "
                                         + " the bounds of the map.");
        }
        //return 0;
    }
    
}
