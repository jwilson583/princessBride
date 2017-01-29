/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.princessBride.model;

import java.io.Serializable;
        
/**
 *
 * @author Jack Wilson
 */
import java.util.Objects;/**
 *
 * @author Jack Wilson
 */
public class Store {
    // class instance variables
    private String itemDescription;
    private int itemCost;

    public Store() {
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public int getItemCost() {
        return itemCost;
    }

    public void setItemCost(int itemCost) {
        this.itemCost = itemCost;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.itemDescription);
        hash = 89 * hash + this.itemCost;
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
        final Store other = (Store) obj;
        if (this.itemCost != other.itemCost) {
            return false;
        }
        if (!Objects.equals(this.itemDescription, other.itemDescription)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Store{" + "itemDescription=" + itemDescription + ", itemCost=" + itemCost + '}';
    }



}