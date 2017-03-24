/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princessbride;

//All imports required by the classes done by Lai, Jack, Ben and Dan.

import byui.cit260.princessBride.view.StartProgramView;
import byui.cit260.princessBride.model.BackPack;
import byui.cit260.princessBride.model.Game;
import byui.cit260.princessBride.model.InventoryItem;
import byui.cit260.princessBride.model.Location;
import byui.cit260.princessBride.model.Map;
import byui.cit260.princessBride.model.Actor;
import byui.cit260.princessBride.model.Player;
import byui.cit260.princessBride.model.Scene;
import byui.cit260.princessBride.model.Skills;
import byui.cit260.princessBride.model.Store;
import byui.cit260.princessBride.model.Traps;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author Jack Wilson
 */
public class PrincessBride {
    
    
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    private static PrintWriter logFile = null;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {   
        
        try {
        PrincessBride.inFile =
                new BufferedReader(new InputStreamReader(System.in));
        
        PrincessBride.outFile = new PrintWriter(System.out, true);
        
        String filePath = "log.txt";
            PrincessBride.logFile = new PrintWriter(filePath);
        
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();
            return;
        
        }
        catch(Throwable e){
        System.out.println("Exception: " + e.toString() + 
                                   "\nCause: " + e.getCause() + 
                                   "\nMessage: " + e.getMessage());

                e.printStackTrace();;
        }
        finally {
            try{
                if(PrincessBride.inFile != null)
                   PrincessBride.inFile.close();
                
                if(PrincessBride.outFile !=null)
                   PrincessBride.outFile.close();
                
                if(PrincessBride.logFile !=null)
                   PrincessBride.logFile.close();
                               
            }
            catch (IOException ex){
            System.out.println("Error closing Files");
            return;
            }
        }
    }

  
    public static PrintWriter getOutFile() {
        return outFile;
    }
    public static void setOutFile(PrintWriter outFile) {
        PrincessBride.outFile = outFile;
    }
    public static BufferedReader getInFile() {
        return inFile;
    }
    public static void setInFile(BufferedReader inFile) {
        PrincessBride.inFile = inFile;
    }  

    public static PrintWriter getLogFile() {
       return logFile;
    }
    public static void setLogFile(PrintWriter logFile) {
        PrincessBride.logFile = logFile;
    }
}
