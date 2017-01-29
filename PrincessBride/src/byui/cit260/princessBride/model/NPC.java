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
 * @author school
 */
public class NPC implements Serializable{
    
    // class instance variables
    private String name;
    private double Health;
    private double Defence;
    private String Skill;
    private String Description;

    public NPC() {
    }

    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHealth() {
        return Health;
    }

    public void setHealth(double Health) {
        this.Health = Health;
    }

    public double getDefence() {
        return Defence;
    }

    public void setDefence(double Defence) {
        this.Defence = Defence;
    }

    public String getSkill() {
        return Skill;
    }

    public void setSkill(String Skill) {
        this.Skill = Skill;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.name);
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.Health) ^ (Double.doubleToLongBits(this.Health) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.Defence) ^ (Double.doubleToLongBits(this.Defence) >>> 32));
        hash = 79 * hash + Objects.hashCode(this.Skill);
        hash = 79 * hash + Objects.hashCode(this.Description);
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
        final NPC other = (NPC) obj;
        if (Double.doubleToLongBits(this.Health) != Double.doubleToLongBits(other.Health)) {
            return false;
        }
        if (Double.doubleToLongBits(this.Defence) != Double.doubleToLongBits(other.Defence)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.Skill, other.Skill)) {
            return false;
        }
        if (!Objects.equals(this.Description, other.Description)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "NPC{" + "name=" + name + ", Health=" + Health + ", Defence=" + Defence + ", Skill=" + Skill + ", Description=" + Description + '}';
    }
            

    
}
