/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princessbride;

//All imports required by the classes done by Lai, Jack, Ben and Dan.

import byui.cit260.princessBride.model.BackPack;
import byui.cit260.princessBride.model.Game;
import byui.cit260.princessBride.model.Item;
import byui.cit260.princessBride.model.Location;
import byui.cit260.princessBride.model.Map;
import byui.cit260.princessBride.model.NPC;
import byui.cit260.princessBride.model.Player;
import byui.cit260.princessBride.model.Scene;
import byui.cit260.princessBride.model.Skills;
import byui.cit260.princessBride.model.Store;
import byui.cit260.princessBride.model.Traps;

/**
 *
 * @author Jack Wilson
 */
public class PrincessBride {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {   
        
        
        // Testing classes by Jack 
	Location locationOne = new Location(); 
        locationOne.setRow(15);
        locationOne.setColumn(34);
        locationOne.setVisited(true);
        locationOne.setAmountRemaining(25);
        
        String locationInfo = locationOne.toString();
        System.out.println(locationInfo);


        Player playerOne = new Player();  
        
        playerOne.setName("Westley");
        playerOne.setHealth(100);
        playerOne.setDefense(75);
        playerOne.setAttack(125);
        playerOne.setGold(65);
                
                
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        Store storeOne = new Store();  
        
        storeOne.setItemDescription("Rock-Pick up the Rock, Stand behind the bolder and throw it at his head!");
        storeOne.setItemCost(10);
      
        String storeInfo = storeOne.toString();
        System.out.println(storeInfo);
        
        Traps trapsOne = new Traps();  

        trapsOne.setName("Lightening Quick Sand");
        trapsOne.setDescription("The ground beneath your foot immediatly gives way, hurry and grab a vine!");
        trapsOne.setDamage(50);
        trapsOne.setDisarm(60);
              
        String trapsInfo = trapsOne.toString();
        System.out.println(trapsInfo);
   
       
        //added Item and Skills entries by Lai
        Item itemOne = new Item();  
        
        itemOne.setName("Rock");
        itemOne.setType("heavy");
        itemOne.setPointRequired(40);
        itemOne.setRowCount(53);
        itemOne.setColumnCount(54);
        
        String intemInfo = itemOne.toString();
        System.out.println(intemInfo);
        
        Skills skillsOne = new Skills();
        
        skillsOne.setTrueLove(70);
        skillsOne.setFencing(70);
        skillsOne.setArchery(60);
        skillsOne.setCast(65);
        skillsOne.setWisdom(90);
        skillsOne.setIntrepidity(80);
        skillsOne.setImmunity(85);
        
        String skillsInfo = skillsOne.toString();
        System.out.println(skillsInfo);
        
        //Calling and testing classes included by Dan
        
        //Class 1
        Game firstGame = new Game();
        firstGame.setTotalTime(1.45);
        firstGame.setNoPeople(4);
        
        String gameInfo = firstGame.toString();
        System.out.println(gameInfo);
   
        //Class 2
        Map hereTheMap = new Map();
        hereTheMap.setColumnCount(5);
        hereTheMap.setRowCount(18);
        
        String mapInfo = hereTheMap.toString();
        System.out.println(mapInfo);
        
        //Class 3
        BackPack myBack = new BackPack();
        myBack.setPocket1("Knife");
        myBack.setPocket2("Iocane Powder");
        myBack.setPocket3("Mask");
        myBack.setPocket4("Rubik's Cube");
        
        String backPackinfo = myBack.toString();
        System.out.println(backPackinfo);


        
        //Classes by Ben
        Scene sceneOne = new Scene();
    
        sceneOne.setDescription("The Great Forest");
        sceneOne.setTravelTime(7.00);
        sceneOne.setType("friendly");

        String sceneInfo = sceneOne.toString();
        System.out.println(sceneInfo);
        
        
        NPC npcOne = new NPC();
        npcOne.setName("Goblin");
        npcOne.setHealth(10.0);
        npcOne.setDefence(5.0);
        npcOne.setSkill("sword");
        npcOne.setDescription("Green and Scary");

        String npcinfo = npcOne.toString();
        System.out.println(npcinfo);

    }

    
}
