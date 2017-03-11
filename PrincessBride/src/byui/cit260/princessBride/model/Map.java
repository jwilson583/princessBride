/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.princessBride.model;

import java.io.Serializable;

/**
 *
 * @author danortega
 */
public class Map implements Serializable {

    private int rowCount;
    private int columnCount;
    private Location currentLocation;
    private Location[][] locations;

    public Map() {     
    }
    
    public Map(int rowCount, int columnCount) {
        
        if (rowCount < 1 || columnCount < 1) {
            System.out.println("The number of rows and columns must be > zero");
            return;
        }
        
        this.rowCount = rowCount;
        this.columnCount = columnCount;
        
        // create 2-D array for Location objects
        this.locations = new Location[rowCount][columnCount];
        
        for (int row = 0; row < rowCount; row++) {
            for(int column = 0; column < columnCount; column++) {
                // create and initialize new Location object instance
                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);
                location.setVisited(false);
                
                // assign the Location object to the current position in array
                locations[row][column] = location;          
            }
        }
    }

    
    
    public long getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public long getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }

    
    public Location getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
    }
    
    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }
    
    public static Scene[] createScenes() {
        
        Scene[] scenes = new Scene[SceneType.values().length];   
        
        
        Scene florinFarmScene = new Scene();
        florinFarmScene.setDescription(
            "Description about florinFarm");
        florinFarmScene.setMapSymbol("FF");
        florinFarmScene.setBlocked(false);
        florinFarmScene.setTravelTime(100);
        scenes[SceneType.florinFarm.ordinal()] = florinFarmScene;
        
        Scene cliffsOfInsanityScene = new Scene();
        cliffsOfInsanityScene.setDescription(
            "Description about cliffsOfInsanity");
        cliffsOfInsanityScene.setMapSymbol("CI");
        cliffsOfInsanityScene.setBlocked(false);
        cliffsOfInsanityScene.setTravelTime(100);
        scenes[SceneType.cliffsOfInsanity.ordinal()] = cliffsOfInsanityScene;
        
        Scene guilderFrontierScene = new Scene();
        guilderFrontierScene.setDescription(
            "Description about guilderFrontier");
        guilderFrontierScene.setMapSymbol("GF");
        guilderFrontierScene.setBlocked(false);
        guilderFrontierScene.setTravelTime(100);
        scenes[SceneType.guilderFrontier.ordinal()] = guilderFrontierScene;
        
        Scene fireSwampScene = new Scene();
        fireSwampScene.setDescription(
            "Description about fireSwamp");
        fireSwampScene.setMapSymbol("FS");
        fireSwampScene.setBlocked(false);
        fireSwampScene.setTravelTime(100);
        scenes[SceneType.fireSwamp.ordinal()] = fireSwampScene;
        
        Scene greenlandScene = new Scene();
        greenlandScene.setDescription(
            "Description about greenland");
        greenlandScene.setMapSymbol("GL");
        greenlandScene.setBlocked(false);
        greenlandScene.setTravelTime(100);
        scenes[SceneType.greenland.ordinal()] = greenlandScene;
        
        Scene thievesForestScene = new Scene();
        thievesForestScene.setDescription(
            "Description about thievesForest");
        thievesForestScene.setMapSymbol("TF");
        thievesForestScene.setBlocked(false);
        thievesForestScene.setTravelTime(100);
        scenes[SceneType.thievesForest.ordinal()] = thievesForestScene;
        
        Scene pitOfDespairScene = new Scene();
        pitOfDespairScene.setDescription(
            "Description about pitOfDespair");
        pitOfDespairScene.setMapSymbol("PD");
        pitOfDespairScene.setBlocked(false);
        pitOfDespairScene.setTravelTime(100);
        scenes[SceneType.pitOfDespair.ordinal()] = pitOfDespairScene;
        
        Scene florinCastleScene = new Scene();
        florinCastleScene.setDescription(
            "Description about florinCastle");
        florinCastleScene.setMapSymbol("FC");
        florinCastleScene.setBlocked(false);
        florinCastleScene.setTravelTime(100);
        scenes[SceneType.florinCastle.ordinal()] = florinCastleScene;
        
        return scenes;
    }
    
private static void assignScenesToLocations(Map map, Scene[] scenes) {
    Location[][] locations = map.getLocations();

    // start point
    locations[0][0].setScene(scenes[SceneType.florinFarm.ordinal()]);
    locations[0][1].setScene(scenes[SceneType.cliffsOfInsanity.ordinal()]);
    locations[0][2].setScene(scenes[SceneType.guilderFrontier.ordinal()]);
    locations[0][3].setScene(scenes[SceneType.fireSwamp.ordinal()]);
    locations[0][4].setScene(scenes[SceneType.greenland.ordinal()]);
    locations[0][5].setScene(scenes[SceneType.thievesForest.ordinal()]);
    locations[0][6].setScene(scenes[SceneType.pitOfDespair.ordinal()]);
    locations[0][7].setScene(scenes[SceneType.florinCastle.ordinal()]);

}
    
    @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", columnCount=" + columnCount + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (int) (this.rowCount ^ (this.rowCount >>> 32));
        hash = 37 * hash + (int) (this.columnCount ^ (this.columnCount >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Map other = (Map) obj;
        if (this.rowCount != other.rowCount) {
            return false;
        }
        if (this.columnCount != other.columnCount) {
            return false;
        }
        return true;
    }
}