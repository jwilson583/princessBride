/*USA is A OK
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princessbride;

import byui.cit260.princessBride.model.Item;  //imported by Lai
import byui.cit260.princessBride.model.Location;
import byui.cit260.princessBride.model.Player;
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
       
        Location locationOne= new Location(); 
        
        locationOne.setName("Florin Castle");
        locationOne.setBestTime(7.00);
        
        String locationInfo = locationOne.toString();
        System.out.println(locationInfo);
        
        Item itemOne = new Item();  //added Item and Skills entries by Lai
        
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
        
        // Testing classes by Jack 
        
        Player playerOne = new Player();  
        
        playerOne.setName("Westley");
        playerOne.setBestTime(7.00);
                
                
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        Store storeOne = new Store();  
        
        storeOne.setName("Miracle Max's Miracle Shop");
        storeOne.setBestTime(7.00);
              
        String storeInfo = storeOne.toString();
        System.out.println(storeInfo);
        
        Traps trapsOne = new Traps();  
        
        trapsOne.setName("Lightening Quick Sand");
        trapsOne.setDamage(50);
        trapsOne.setDisarm(60);
              
        String trapsInfo = trapsOne.toString();
        System.out.println(trapsInfo);
    }
    
}
