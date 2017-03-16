/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.princessBride.model;

import buyi.cit260.princessBride.control.CollectedItem;
import java.io.Serializable;

/**
 *
 * @author danortega
 */
public class Game implements Serializable{
    
    private double totalTime;
    private long noPeople;
    private Player player;
    private InventoryItem[] inventory;
    private Map map;
    private BackPack backPack;
    private CollectedItem[] collect;

    public Game() {
    }

    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    public long getNoPeople() {
        return noPeople;
    }

    public void setNoPeople(long noPeople) {
        this.noPeople = noPeople;
    }

        public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
    
        public InventoryItem[] getInventory() {
        return inventory;
    }

    public void setInventory(InventoryItem[] inventory) {
        this.inventory = inventory;
    }
    
        public BackPack getBackPack() {
        return backPack;
    }

    public void setBackPack(BackPack backPack) {
        this.backPack = backPack;
    }
    
    
    
    /*@Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.totalTime) ^ (Double.doubleToLongBits(this.totalTime) >>> 32));
        hash = 79 * hash + this.noPeople;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.totalTime) != Double.doubleToLongBits(other.totalTime)) {
            return false;
        }
        if (this.noPeople != other.noPeople) {
            return false;
        }
        return true;
    }*/

    //@Override
    public String toString() {
        return "Game{" + "totalTime=" + totalTime + ", noPeople=" + noPeople + '}';
    }

    /*public void setPlayer(Player player) {
        System.out.println("\n*** setPlayer() function called ***");
    }

    public void setItem(InventoryItem[] itemList) {
        System.out.println("\n*** setItem() function called ***");
    }*/

    public void setMap(Map map) {
        this.map = map;
        //System.out.println("\n*** setMap() function called ***");
    }

    //public void setInventory(InventoryItem[] inventoryList) {
    //    System.out.println("\n*** setInventory() function called ***");
    //}

    //public InventoryItem[] getInventory() {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}

    public Map getMap() {
        return map;
    }


    public CollectedItem[] getCollect() {
        return collect;
    }


}
