/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.princessBride.control;

import byui.cit260.princessBride.model.BackPack;

/**
 *
 * @author Jack Wilson
 */
public class BackPackControl {

  static BackPack createBackPack() {
        BackPack backpack = new Backpack();
        return backpack;
    }
    


 public int sumCredits(int array[]){
        int sum = 0;
        for(int a: array){
            sum += a;
        }
        return sum;
    }

    private static class Backpack extends BackPack {

        public Backpack() {
        }
    }
 
   
}
