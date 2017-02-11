/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.princessBride.control;

/**
 *
 * @author school
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
   
            }
            
