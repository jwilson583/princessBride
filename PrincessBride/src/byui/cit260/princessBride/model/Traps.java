/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.princessBride.model;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Jack Wilson
 */
public class Traps{
    private String name;
    private String description;
    private int damage;
    private int disarm;

    public Traps() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDisarm() {
        return disarm;
    }

    public void setDisarm(int disarm) {
        this.disarm = disarm;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Objects.hashCode(this.description);
        hash = 97 * hash + this.damage;
        hash = 97 * hash + this.disarm;
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
        final Traps other = (Traps) obj;
        if (this.damage != other.damage) {
            return false;
        }
        if (this.disarm != other.disarm) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Traps{" + "name=" + name + ", description=" + description + ", damage=" + damage + ", disarm=" + disarm + '}';
    }
    
}
   