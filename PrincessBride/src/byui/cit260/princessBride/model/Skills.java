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
 * @author Lai
 */
public class Skills implements Serializable{
    
    // class instance variables
    private String skillName;
    private double skillLevel;

    public Skills() {
    }
 
    public String getskillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public double getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(double skillLevel) {
        this.skillLevel = skillLevel;
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.skillName);
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.skillLevel) ^ (Double.doubleToLongBits(this.skillLevel) >>> 32));
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
        final Skills other = (Skills) obj;
        if (Double.doubleToLongBits(this.skillLevel) != Double.doubleToLongBits(other.skillLevel)) {
            return false;
        }
        if (!Objects.equals(this.skillName, other.skillName)) {
            return false;
        }
        
        return true;
    }

    @Override
    public String toString() {
        return "Skills{" + "skillName=" + skillName + ", skillLevel=" + skillLevel + '}';
    }
    
}