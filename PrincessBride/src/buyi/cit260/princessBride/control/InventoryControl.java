/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.princessBride.control;

import byui.cit260.princessBride.model.InventoryItem;

/**
 *
 * @author Ben Lacusta
 */
public class InventoryControl {
    
    int height = 3;
    int width = 4;
    int length = 5;
    int qItem = 1;
    
    public double calcVolume (int height, int width, int length) 
    {
        if (height < 0){
            return -1;
        }
        if (width < 0){
            return -1;
        }
          if (length < 0){
            return -1;
        }
          
          
          double volume = height*width*length;
                 
                return volume;
    }
 
    public double calcItemVolume (int qItem, double volume){
        if (qItem < 0){
            return -1;
                    }
        double totalVolume = qItem*volume;
    
       return totalVolume;
        }
    
    
    public static void sortByDescription(InventoryItem[] items) {

        InventoryItem tempItem;
        for (int i = 0; i < items.length-1; i++) {
            for (int j = 0; j < items.length-1-i; j++) {
                if (items[j].getDescription().compareToIgnoreCase(items[j + 1].getDescription()) > 0) {
                    tempItem = items[j];
                    items[j] = items[j+1];
                    items[j+1] = tempItem;
                }
            }
        }

    }
            }
            
