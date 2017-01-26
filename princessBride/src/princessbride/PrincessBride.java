/*Hello 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princessbride;

import byui.cit260.princessBride.model.Location;

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
    }
    
}
