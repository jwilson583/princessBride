/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.princessBride.model;

import java.io.Serializable;

/**
 *
 * @author Lai
 */
public class Skills implements Serializable{
    
    // class instance variables
    private double trueLove;
    private double fencing;
    private double archery;
    private double cast;
    private double wisdom;
    private double intrepidity;
    private double immunity;

    public Skills() {
    }
    
    public double getTrueLove() {
        return trueLove;
    }

    public void setTrueLove(double trueLove) {
        this.trueLove = trueLove;
    }

    public double getFencing() {
        return fencing;
    }

    public void setFencing(double fencing) {
        this.fencing = fencing;
    }

    public double getArchery() {
        return archery;
    }

    public void setArchery(double archery) {
        this.archery = archery;
    }

    public double getCast() {
        return cast;
    }

    public void setCast(double cast) {
        this.cast = cast;
    }

    public double getWisdom() {
        return wisdom;
    }

    public void setWisdom(double wisdom) {
        this.wisdom = wisdom;
    }

    public double getIntrepidity() {
        return intrepidity;
    }

    public void setIntrepidity(double intrepidity) {
        this.intrepidity = intrepidity;
    }

    public double getImmunity() {
        return immunity;
    }

    public void setImmunity(double immunity) {
        this.immunity = immunity;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.trueLove) ^ (Double.doubleToLongBits(this.trueLove) >>> 32));
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.fencing) ^ (Double.doubleToLongBits(this.fencing) >>> 32));
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.archery) ^ (Double.doubleToLongBits(this.archery) >>> 32));
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.cast) ^ (Double.doubleToLongBits(this.cast) >>> 32));
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.wisdom) ^ (Double.doubleToLongBits(this.wisdom) >>> 32));
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.intrepidity) ^ (Double.doubleToLongBits(this.intrepidity) >>> 32));
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.immunity) ^ (Double.doubleToLongBits(this.immunity) >>> 32));
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
        if (Double.doubleToLongBits(this.trueLove) != Double.doubleToLongBits(other.trueLove)) {
            return false;
        }
        if (Double.doubleToLongBits(this.fencing) != Double.doubleToLongBits(other.fencing)) {
            return false;
        }
        if (Double.doubleToLongBits(this.archery) != Double.doubleToLongBits(other.archery)) {
            return false;
        }
        if (Double.doubleToLongBits(this.cast) != Double.doubleToLongBits(other.cast)) {
            return false;
        }
        if (Double.doubleToLongBits(this.wisdom) != Double.doubleToLongBits(other.wisdom)) {
            return false;
        }
        if (Double.doubleToLongBits(this.intrepidity) != Double.doubleToLongBits(other.intrepidity)) {
            return false;
        }
        if (Double.doubleToLongBits(this.immunity) != Double.doubleToLongBits(other.immunity)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Skills{" + "trueLove=" + trueLove + ", fencing=" + fencing + ", archery=" + archery + ", cast=" + cast + ", wisdom=" + wisdom + ", intrepidity=" + intrepidity + ", immunity=" + immunity + '}';
    }
    
}
