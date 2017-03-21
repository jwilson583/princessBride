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



public class CollectedItem implements Serializable {
    
    private double life;
    private double trueLove;
    private double sword;
    private double rock;
    //private double swrockord;
    private double dagger;
    private double iocanePowder;
    private double moneyBag;
    private double miraclePotions;
    private double map;
    private double holocaustCloak;
    private double egg;
    private String actorName;
    
    public CollectedItem() {
    }
    
    public String getActorName() {
        return actorName;
    }
    public void setActorName(String actorName) {
        this.actorName = actorName;
    }
    
    public double getTrueLove() {
        return trueLove;
    }
    public void setTrueLove(double trueLove) {
        this.trueLove = trueLove;
    }

    public double getLife() {
        return life;
    }
    public void setLife(double life) {
        this.life = life;
    }
    
    public double getSword() {
        return sword;
    }
    public void setSword(double sword) {
        this.sword = sword;
    }
    
    public double getRock() {
        return rock;
    }
    public void setRock(double rock) {
        this.rock = rock;
    }
    
    public double getDagger() {
        return dagger;
    }
    public void setDagger(double dagger) {
        this.dagger = dagger;
    }

    public double getIocanePowder() {
        return iocanePowder;
    }
    public void setIocanePowder(double iocanePowder) {
        this.iocanePowder = iocanePowder;
    }

    public double getMoneyBag() {
        return moneyBag;
    }
    public void setMoneyBag(double moneyBag) {
        this.moneyBag = moneyBag;
    }

    public double getMiraclePotions() {
        return miraclePotions;
    }
    public void setMiraclePotions(double miraclePotions) {
        this.miraclePotions = miraclePotions;
    }

    public double getMap() {
        return map;
    }
    public void setMap(double map) {
        this.map = map;
    }

    public double getHolocaustCloak() {
        return holocaustCloak;
    }
    public void setHolocaustCloak(double holocaustCloak) {
        this.holocaustCloak = holocaustCloak;
    }
    
    public double getEgg() {
        return egg;
    }
    public void setEgg(double egg) {
        this.egg = egg;
    }
}
