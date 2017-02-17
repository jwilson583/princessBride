/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.princessBride.view;

import java.util.Scanner;

/**
 *
 * @author Jack Wilson
 */
public class HelpMenuView {
    private String menu;
    
    public HelpMenuView() {
    this.menu= "\n"
            + "\n-------------------------------------------"
            + "\n|              Help Menu                  |"
            + "\n-------------------------------------------"
            + "\n G- What is the Goal of the game           "
            + "\n L- Load Saved Game                        "
            + "\n W- List of Weapons and Descriptions       "
            + "\n R- Return to Main Menu"
            + "\n-------------------------------------------";
    }

    public void displayHelpMenuView() {
        System.out.println("\n" +this.menu);
                
    }


}
    