/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InitialPlayer;

import byui.cit260.princessBride.view.StartProgramView;
import byui.cit260.princessBride.model.Game;
import byui.cit260.princessBride.model.Player;
import java.io.PrintWriter;

/**
 *
 * @author Lai
 */
public class InitialPlayer {
    
    private static Game currentGame = null;
    private static Player player = null;
    
    public static void main(String[] args) {
        StartProgramView startProgramView = new StartProgramView();
        try {
            startProgramView.display();
      
        } catch (Throwable te) {
                System.out.println(te.getMessage());
                startProgramView.display();
        }
        
        
    }
        public static Game getCurrentGame() {
            return currentGame;
        }
        
        public static void setCurrentGame(Game currentGame) {
            InitialPlayer.currentGame = currentGame;
        }
        
        public static Player getPlayer() {
            return player;
        }
        
        public static void setPlayer(Player player) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            InitialPlayer.player = player; 
        }

    public static Object getRowCount() {
         throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static PrintWriter getOutFile() {
         throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.;
        
    }
    
}

