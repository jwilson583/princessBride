/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InitialPlayer;

import byui.cit260.princessBride.model.Game;
import byui.cit260.princessBride.model.Player;

/**
 *
 * @author Lai
 */
public class InitialPlayer {
    
    private static Game currentGame = null;
    private static Player player = null;
    
    public static void main(String[] args) {
    }
        public static Game getCurrentGame() {
            return currentGame;
        }
        
        public static void setCurrentgame(Game currentGame) {
            InitialPlayer.currentGame = currentGame;
        }
        
        public static Player getPlayer() {
            return player;
        }
        
        public static void setPlayer(Player player) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            InitialPlayer.player = player; 
        }
    
}

