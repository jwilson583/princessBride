/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.princessBride.control;

import InitialPlayer.InitialPlayer;
import byui.cit260.princessBride.model.Game;
import byui.cit260.princessBride.model.InventoryItem;
import byui.cit260.princessBride.model.Item;
import byui.cit260.princessBride.model.Player;
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
        
/*        Map map = MapControl.createMap(); // create and initialize new map
        game.setMap(map); // save map in game
        
        // move actors to starting position in the map
        MapControl.moveActorsToStartingLocation(map);*/
        
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
    
    private static InventoryItem[] createInventoryList() {
        //System.out.println("\n*** createInventoryList() function called ***");
        //return null;
        InventoryItem[] inventory = new InventoryItem[12];
        
        InventoryItem trueLove = new InventoryItem();
        trueLove.setDescription("TrueLove");
        trueLove.setQuantityInStock(0);
        trueLove.setPointRequired(0);
        inventory[Item.trueLove.ordinal()] = trueLove;
        
        InventoryItem sword = new InventoryItem();
        sword.setDescription("Sword");
        sword.setQuantityInStock(0);
        sword.setPointRequired(0);
        inventory[Item.sword.ordinal()] = sword;
        
        InventoryItem rock = new InventoryItem();
        rock.setDescription("Rock");
        rock.setQuantityInStock(0);
        rock.setPointRequired(0);
        inventory[Item.rock.ordinal()] = rock;
        
        InventoryItem dagger = new InventoryItem();
        dagger.setDescription("Dagger");
        dagger.setQuantityInStock(0);
        dagger.setPointRequired(0);
        inventory[Item.dagger.ordinal()] = dagger;
        
        InventoryItem iocanePowder = new InventoryItem();
        iocanePowder.setDescription("IocanePowder");
        iocanePowder.setQuantityInStock(0);
        iocanePowder.setPointRequired(0);
        inventory[Item.iocanePowder.ordinal()] = iocanePowder;
        
        InventoryItem moneyBag = new InventoryItem();
        moneyBag.setDescription("MoneyBag");
        moneyBag.setQuantityInStock(0);
        moneyBag.setPointRequired(0);
        inventory[Item.moneyBag.ordinal()] = moneyBag;
        
        InventoryItem miraclePotions = new InventoryItem();
        miraclePotions.setDescription("MiraclePotions");
        miraclePotions.setQuantityInStock(0);
        miraclePotions.setPointRequired(0);
        inventory[Item.miraclePotions.ordinal()] = miraclePotions;
        
        InventoryItem map = new InventoryItem();
        map.setDescription("Map");
        map.setQuantityInStock(0);
        map.setPointRequired(0);
        inventory[Item.map.ordinal()] = map;
        
        InventoryItem holocaustCloak = new InventoryItem();
        holocaustCloak.setDescription("HolocaustCloak");
        holocaustCloak.setQuantityInStock(0);
        holocaustCloak.setPointRequired(0);
        inventory[Item.holocaustCloak.ordinal()] = holocaustCloak;
        
        InventoryItem egg = new InventoryItem();
        egg.setDescription("Egg");
        egg.setQuantityInStock(0);
        egg.setPointRequired(0);
        inventory[Item.egg.ordinal()] = egg;
        
        return inventory;
        }
    }