/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princessbride;

//All imports required by the classes done by Lai, Jack, Ben and Dan.

import byui.cit260.princessBride.view.StartProgramView;
import byui.cit260.princessBride.model.BackPack;
import byui.cit260.princessBride.model.Game;
import byui.cit260.princessBride.model.InventoryItem;
import byui.cit260.princessBride.model.Location;
import byui.cit260.princessBride.model.Map;
import byui.cit260.princessBride.model.Actor;
import byui.cit260.princessBride.model.Player;
import byui.cit260.princessBride.model.Scene;
import byui.cit260.princessBride.model.Skills;
import byui.cit260.princessBride.model.Store;
import byui.cit260.princessBride.model.Traps;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author Jack Wilson
 */
public class PrincessBride {
    
    
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    private static PrintWriter logFile = null;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {   
        
        try {
        PrincessBride.inFile =
                new BufferedReader(new InputStreamReader(System.in));
        
        PrincessBride.outFile = new PrintWriter(System.out, true);
        
         String filePath = "log.txt";
            PrincessBride.logFile = new PrintWriter(filePath);
        
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();
            return;
        
        }
        catch(Throwable e){
        System.out.println("Exception: " + e.toString() + 
                                   "\nCause: " + e.getCause() + 
                                   "\nMessage: " + e.getMessage());

                e.printStackTrace();;
        }
        finally {
            try{
                if(PrincessBride.inFile != null)
                   PrincessBride.inFile.close();
                
                if(PrincessBride.outFile !=null)
                   PrincessBride.outFile.close();
                
                if(PrincessBride.logFile !=null)
                   PrincessBride.logFile.close();
                               
            }
            catch (IOException ex){
            System.out.println("Error closing Files");
            return;
            }
        }
        
        
        // create StartProgramVieewOrig and display the start program view
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();
        
        // Testing classes by Jack 
	Location locationOne = new Location(); 
        locationOne.setRow(15);
        locationOne.setColumn(34);
        locationOne.setVisited(true);
              
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
   
       
        //added InventoryItem and Skills entries by Lai
        InventoryItem itemOne = new InventoryItem();  
        
        itemOne.setName("Rock");
        itemOne.setType("heavy");
        itemOne.setPointRequired(40);
        itemOne.setRowCount(53);
        itemOne.setColumnCount(54);
        
        String intemInfo = itemOne.toString();
        System.out.println(intemInfo);
        
        Skills skillsOne = new Skills();
        
        skillsOne.setSkillName("Wisdom");
        skillsOne.setSkillLevel(70);
        
        String skillsInfo = skillsOne.toString();
        System.out.println(skillsInfo);
        
        //Calling and testing classes included by Dan
        
        //Class 1
        Game firstGame = new Game();
        firstGame.setTotalTime(1.45);
        firstGame.setNoPeople(1);
        
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
        
        }
        
    public static PrintWriter getOutFile() {
        return outFile;
    }
    public static void setOutFile(PrintWriter outFile) {
        PrincessBride.outFile = outFile;
    }
    public static BufferedReader getInFile() {
        return inFile;
    }
    public static void setInFile(BufferedReader inFile) {
        PrincessBride.inFile = inFile;
    }  

    public static PrintWriter getLogFile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static void setLogFile(PrintWriter logFile) {
        PrincessBride.logFile = logFile;
    }
}
