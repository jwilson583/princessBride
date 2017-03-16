/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.princessBride.control;

import InitialPlayer.InitialPlayer;
import byui.cit260.princessBride.model.Actor;
import byui.cit260.princessBride.model.Game;
import byui.cit260.princessBride.model.InventoryItem;
import byui.cit260.princessBride.model.Item;
import byui.cit260.princessBride.model.Location;
import byui.cit260.princessBride.model.Map;
import byui.cit260.princessBride.model.Player;
import byui.cit260.princessBride.model.Scene;
import byui.cit260.princessBride.model.SceneType;
import java.util.Arrays;

/**
 *
 * @author Lai
 */

public class GameControl {
      
    public static Player createPlayer(String name) {
        
        if (name == null) {
            return null;
        }
        
        Player player = new Player();
        player.setName(name);
        
        InitialPlayer.setPlayer(player); // save the player
        
        return player;
    }

    public static void createNewGame(Player player) {
        
        Game game = new Game(); // create new game
        InitialPlayer.setCurrentGame(game); // save in InitialPlayer
        
        game.setPlayer(player);
        
        //create the inventory list and save in the game
        InventoryItem[] inventoryList = GameControl.createInventoryList();
        game.setInventory(inventoryList);
        
        Map map = MapControl.createMap(); // create and initialize new map
        game.setMap(map); // save map in game
        
        // move actors to starting position in the map
        MapControl.moveActorsToStartingLocation(map);
        
    }
    
    int startStrengthPt = 100;
    int miraclePotionPt = 100;
    int travelPt = 1;
    int runPt = 2;
    int dodgePt = 4;
    int attackPt = 2;
    int swordPt = 50;
    int rockPt = 30;
    int daggerPt = 10;
    int iocanPowderPt = 100;
    int gameIndx = 2;
    String [] usedName = {"Game2", "Used Name", "Old Name"};
    
    
    public String getnewGame(String newName) {
        if ((newName.length() == 0)||(newName.length() < 0)||(newName.length() > 31)||(Arrays.asList(usedName).contains(newName))) {
        return "Error";
        }
        
        String newGame = newName;
        
        return newGame;
    }    
    
    
    public String getnewPlayer(String newName) {
        if ((newName.length() == 0)||(newName.length() < 0)||(newName.length() > 21)||(Arrays.asList(usedName).contains(newName))) {
        return "Error";
        }
        
        String newPlayer = newName;
        
        return newPlayer;
    }   
    
    public double calcStrength(int numMiraclePotion, int travelTime, int runTime, int numDodge, int numAttack) {
                    
        if (numMiraclePotion < 0) {
            return -1;
        }

        if (travelTime < 0) {
            return -1;
        }
        
        if (runTime < 0) {
            return -1;
        }
        
        if (numDodge < 0) {
            return -1;
        }
        
        if (numAttack < 0) {
            return -1;
        }
        
        double strength = startStrengthPt+miraclePotionPt*numMiraclePotion-travelPt*travelTime-runPt*runTime-dodgePt*numDodge-attackPt*numAttack;
        
        return strength;
    }
    
    public double calcAttack(int numSword, int numRock, int numDagger, int numIocanePowder, int gameLevel) {
        
        if ((gameLevel < 0) || (gameLevel > 3)) {
            return -1;
        }
            
        if (numSword < 0) {
            return -1;
        }
        
        if (numRock < 0) {
            return -1;
        }
        
        if (numDagger < 0) {
            return -1;
        }
        
        if (numIocanePowder < 0) {
            return -1;
        }
        
        double attack = (((swordPt*numSword)+(rockPt*numRock)+(daggerPt*numDagger))/(Math.pow(gameIndx, gameLevel)))+(iocanPowderPt*numIocanePowder);
        
        return attack;
    }
    
    
    public double calcHealth(double strength, double attack) {
                           
        double health = strength-attack;
        
        return health;
    }

    double calcVolume(int height, int width, int length) {
        System.out.println("\n*** calcVolume() function called ***");
        return 0;
    }
    
    public static InventoryItem[] createInventoryList() {
        //System.out.println("\n*** createInventoryList() function called ***");
        //return null;
        InventoryItem[] inventory = new InventoryItem[12];
        
        InventoryItem trueLove = new InventoryItem();
        trueLove.setName("True Love");
        trueLove.setDescription("Evertything you've ever wanted in a pill");
        trueLove.setType("health");
        trueLove.setQuantityInStock(0);
        trueLove.setPointRequired(0);
        trueLove.setPowerPoint(100);
        trueLove.setRowCount(0);
        trueLove.setColumnCount(0);
        inventory[Item.trueLove.ordinal()] = trueLove;
        
        InventoryItem sword = new InventoryItem();
        sword.setName("Sword");
        sword.setDescription("    ");
        sword.setType("health");
        sword.setQuantityInStock(10);
        sword.setPointRequired(50);
        sword.setPowerPoint(50);
        sword.setRowCount(0);
        sword.setColumnCount(0);
        inventory[Item.sword.ordinal()] = sword;
        
        InventoryItem rock = new InventoryItem();
        rock.setName("Rock");
        rock.setDescription("    ");
        rock.setType("attack");
        rock.setQuantityInStock(20);
        rock.setPointRequired(4);
        rock.setPowerPoint(30);
        rock.setRowCount(0);
        rock.setColumnCount(0);
        inventory[Item.rock.ordinal()] = rock;
        
        InventoryItem dagger = new InventoryItem();
        dagger.setName("Dagger");
        dagger.setDescription("     ");
        dagger.setType("attack");
        dagger.setQuantityInStock(2);
        dagger.setPointRequired(20);
        dagger.setPowerPoint(10);
        dagger.setRowCount(4);
        dagger.setColumnCount(2);
        inventory[Item.dagger.ordinal()] = dagger;
        
        InventoryItem iocanePowder = new InventoryItem();
        iocanePowder.setName("IocanePowder");
        iocanePowder.setDescription("   ");
        iocanePowder.setType("attack");
        iocanePowder.setQuantityInStock(2);
        iocanePowder.setPointRequired(10);
        iocanePowder.setPowerPoint(100);
        iocanePowder.setRowCount(1);
        iocanePowder.setColumnCount(2);
        inventory[Item.iocanePowder.ordinal()] = iocanePowder;
        
        InventoryItem moneyBag = new InventoryItem();
        moneyBag.setName("MoneyBag");
        moneyBag.setDescription("   ");
        moneyBag.setType("attack");
        moneyBag.setQuantityInStock(10);
        moneyBag.setPointRequired(20);
        moneyBag.setPowerPoint(0);
        moneyBag.setColumnCount(3);
        inventory[Item.moneyBag.ordinal()] = moneyBag;
        
        InventoryItem miraclePotions = new InventoryItem();
        miraclePotions.setName("Miracle Potion");
        miraclePotions.setDescription("aka its kind of a big deal potion");
        miraclePotions.setType("health");
        miraclePotions.setQuantityInStock(10);
        miraclePotions.setPointRequired(15);
        miraclePotions.setPowerPoint(100);
        miraclePotions.setRowCount(2);
        miraclePotions.setColumnCount(8);
        inventory[Item.miraclePotions.ordinal()] = miraclePotions;
        
        InventoryItem map = new InventoryItem();
        map.setName("Map");
        map.setDescription("Map of Florin");
        map.setType("attack");
        map.setQuantityInStock(50);
        map.setPointRequired(10);
        map.setPowerPoint(0);
        map.setRowCount(0);
        map.setColumnCount(2);
        inventory[Item.map.ordinal()] = map;
        
        InventoryItem holocaustCloak = new InventoryItem();
        holocaustCloak.setName("HolocaustCloak");
        holocaustCloak.setDescription("   ");
        holocaustCloak.setType("attack");
        holocaustCloak.setQuantityInStock(8);
        holocaustCloak.setPointRequired(50);
        holocaustCloak.setPowerPoint(40);
        holocaustCloak.setRowCount(4);
        holocaustCloak.setColumnCount(5);
        inventory[Item.holocaustCloak.ordinal()] = holocaustCloak;
        
        InventoryItem egg = new InventoryItem();
        egg.setName("Egg");
        egg.setDescription("Round and full of surprises");
        egg.setType("health");
        egg.setQuantityInStock(100);
        egg.setPointRequired(10);
        egg.setPowerPoint(10);
        egg.setRowCount(8);
        egg.setColumnCount(3);
        inventory[Item.egg.ordinal()] = egg;
        
        return inventory;
        }

    
    public static InventoryItem[] getSortedInventoryList() {
        
        // get inventory list for the current game
        InventoryItem[] originalInventoryList = 
                
                InitialPlayer.getCurrentGame().getInventory();
        
        // clone (make a copy) orignalList
        InventoryItem[] inventoryList = originalInventoryList.clone();
        
       // using a BubbleSort to sort the list of inventoryList by name
        InventoryItem tempInventoryItem;
        for (int i = 0; i < inventoryList.length-1; i++) {
            for (int j = 0; j < inventoryList.length-1-i; j++) {
                if (inventoryList[j].getDescription().
                        compareToIgnoreCase(inventoryList[j + 1].getDescription()) > 0) {
                    tempInventoryItem = inventoryList[j];
                    inventoryList[j] = inventoryList[j+1];
                    inventoryList[j+1] = tempInventoryItem;
                }
            }
        }
        
        return inventoryList;
    }
    
    public static InventoryItem[] getInventory() {
        return InitialPlayer.getCurrentGame().getInventory();
    }
        static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();

        locations[0][0].setScene(scenes[SceneType.florinFarm.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.cliffsOfInsanity.ordinal()]);
        locations[1][6].setScene(scenes[SceneType.guilderFrontier.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.fireSwamp.ordinal()]);
        locations[5][9].setScene(scenes[SceneType.greenland.ordinal()]);
        locations[7][1].setScene(scenes[SceneType.thievesForest.ordinal()]);
        locations[8][6].setScene(scenes[SceneType.pitOfDespair.ordinal()]);
        locations[9][8].setScene(scenes[SceneType.florinCastle.ordinal()]);

        }
        
    public static CollectedItem[] createCollectedList() {
	
        CollectedItem[] collect = new CollectedItem[4];
        
        CollectedItem inigoMontoya = new CollectedItem();
        inigoMontoya.setActorName("Inigo Montoya");
        inigoMontoya.setTrueLove(0);
        inigoMontoya.setSword(1);
        inigoMontoya.setRock(0);
        inigoMontoya.setDagger(0);
        inigoMontoya.setIocanePowder(0);
        inigoMontoya.setMoneyBag(0);
        inigoMontoya.setMiraclePotions(0);
	inigoMontoya.setMap(0);
	inigoMontoya.setHolocaustCloak(0);
	inigoMontoya.setEgg(0);
        collect[Actor.inigoMontoya.ordinal()] = inigoMontoya;

	CollectedItem fezzik = new CollectedItem();
        fezzik.setTrueLove(0);
        fezzik.setSword(0);
        fezzik.setRock(10);
        fezzik.setDagger(0);
        fezzik.setIocanePowder(0);
        fezzik.setMoneyBag(0);
        fezzik.setMiraclePotions(0);
	fezzik.setMap(0);
	fezzik.setHolocaustCloak(0);
	fezzik.setEgg(100);
        collect[Actor.fezzik.ordinal()] = fezzik;

	CollectedItem miracleMax = new CollectedItem();
        miracleMax.setTrueLove(0);
        miracleMax.setSword(0);
        miracleMax.setRock(0);
        miracleMax.setDagger(0);
        miracleMax.setIocanePowder(0);
        miracleMax.setMoneyBag(0);
        miracleMax.setMiraclePotions(10);
	miracleMax.setMap(0);
	miracleMax.setHolocaustCloak(0);
	miracleMax.setEgg(50);
        collect[Actor.miracleMax.ordinal()] = miracleMax;

	CollectedItem vizzini = new CollectedItem();
        vizzini.setTrueLove(0);
        vizzini.setSword(1);
        vizzini.setRock(0);
        vizzini.setDagger(0);
        vizzini.setIocanePowder(0);
        vizzini.setMoneyBag(0);
        vizzini.setMiraclePotions(0);
	vizzini.setMap(1);
	vizzini.setHolocaustCloak(1);
	vizzini.setEgg(40);
        collect[Actor.vizzini.ordinal()] = vizzini;
        
        return collect;
        
    }
}
