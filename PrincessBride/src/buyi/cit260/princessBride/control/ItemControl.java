/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.princessBride.control;

import byui.cit260.princessBride.model.Item;

/**
 *
 * @author Ben
 */
public class ItemControl {
    
 static Item[] createInventory() {
        
        //created array (list) of inventory items
        Item[] inventory = new Item[3];
        
        Item egg = new Item();
        egg.setName("Egg");
        egg.setDescription("Round and full of surprises");
        egg.setAmmount(0);
        inventory[ItemEnum.egg.ordinal()] = egg;
        
        Item MiraclePotion = new Item();
        MiraclePotion.setName("Miracle Potion");
        MiraclePotion.setDescription("aka its kind of a big deal potion");
        MiraclePotion.setAmmount(0);
        inventory[ItemEnum.MiraclePotion.ordinal()] = MiraclePotion;
        
        Item trueLove = new Item();
        trueLove.setName("True Love");
        trueLove.setDescription("Evertything you've ever wanted in a pill");
        trueLove.setAmmount(0);
        inventory[ItemEnum.trueLove.ordinal()] = trueLove;
        
        return inventory;
    }
    
            public enum ItemEnum {
        egg, MiraclePotion, trueLove;
    }
    
}
