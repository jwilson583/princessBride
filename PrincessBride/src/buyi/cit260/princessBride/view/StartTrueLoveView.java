/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.princessBride.view;

import java.util.Scanner;

/**
 *
 * @author Lai
 */
public class StartTrueLoveView {

    private String menu;
    private int inventoryLove = 1;
    private boolean trueLove;
    
    // display start ture menu
    public StartTrueLoveView() {
        
        this.menu = "\n"
                   + "\n ----------------------------------------"
                   + "\n|   True Love Menu                      |"
                   + "\n ----------------------------------------"
                   + "\n S - Start"
                   + "\n I - Inventory"
                   + "\n H - Help"
                   + "\n Q - Return"
                   + "\n----------------------------------------"; 
    }

    /**
     *
     */
    void displayStartTrueLoveView() {
    
        boolean done = false; // set flag to not done
        do {
            //prompt for and get response
            String menuLove = this.getMenuLove();
            if (menuLove.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game
            
            done = this.doAction(menuLove);
            
        } while (!done);

    }
    
    private String getMenuLove() {

        Scanner keyboard = new Scanner(System.in);
        String menuLove = ""; // ans to be returned
        boolean valid = false; // initialize to not valid
        
        while (!valid) { // loop while an invalid value is enter
            System.out.println("\n" + this.menu);
            
            menuLove = keyboard.nextLine(); // get next line typed on keyboard
            menuLove = menuLove.trim(); // trim off leading and trailing blanks
            
            //if (menuLove.length() < 1) { // value is blank
            //    System.out.println("\nInvalid value: value cannot be blank");
            //    continue;
            //}
            break; //end the loop
        }
        
        return menuLove;
    }

    private boolean doAction(String menuLove) {

        menuLove = menuLove.toUpperCase(); // convert menuLove to upper case
        switch (menuLove) {
            case "S": // start True Love section
                if (inventoryLove > 0) {
                    this.setTrueLove();
                    return true;
                } else {
                    System.out.println("\nSorry! True Love always sold out!");
                }
                break;
            case "I": // check if True Love available
                this.startInventory();
                break;
            case "H": // display help menu
                this.displayHelp();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
            }
        return false;
    }
    
    private void setTrueLove() {
        
   
              
        
        String request1 = 
                "\n*******************************************************"
                  + "\n*                                                     *"
                  + "\n* Wesley, you do not have enough desirer to save      *"
                  + "\n* Princess Buttercup. You must develop a True Love    *"
                  + "\n* with her before starting the journey. When          *"
                  + "\n* Buttercup was young and she lived in a farm where   *"
                  + "\n* you were working. She liked to ride her horse and   *"
                  + "\n* taunt you as the farm boy.                          *"
                  + "\n* In order to prove you have the true love with her.  *"
                  + "\n* You must response to all her requests correctly     *"
                  + "\n* to prove you have developed the 'True Love' with    *"
                  + "\n* her.                                                *"
                  + "\n* Here are of five her requests:                      *"
                  + "\n*                                                     *"
                  + "\n*******************************************************"
                  + "\n"
                        + "\n 1. Buttercup is asking:"
                        + "\n Farm Boy, fetch me this."
                        + "\n";
        
        String request2 = "\n 2. Buttercup is asking:"
                        + "\n Get me that, Farm Boy quickly, lazy thing, trot now or I'll tell Father."
                        + "\n";
        
        String request3 = "\n 3. Buttercup is asking:"
                        + "\n Fetch that, Farm Boy."
                        + "\n";
        
        String request4 = "\n 4. Buttercup is asking:"
                        + "\n Dry this, Farm Boy."
                        + "\n";
        
        String request5 = "\n 5. Buttercup is asking:"
                        + "\n I didn't excuse you, Farm Boy. I don't like "
                        + "\n what you're doing with Horse. What you're not "
                        + "\n doing with Horse is more to the point. I want "
                        + "\n him cleaned. Tonight. I want his hoofs varnished."
                        + "\n Tonight. I want his tail plaited and his ears"
                        + "\n massaged. This very evening. I want his stables"
                        + "\n spotless. Now. I want him glistening, and if it"
                        + "\n takes you all night, it takes you all night."
                        + "\n";
        
        String responses = "\n Select your response:"
                         + "\n 1 - Okay"
                         + "\n 2 - Just do it"
                         + "\n 3 - Yes"
                         + "\n 4 - As you wish"
                         + "\n 5 - I love you"
                         + "\n";


        System.out.println(request1);
        System.out.println(responses);
        Scanner choice = new Scanner(System.in);
        String input1 = ""; // ans to be returned
        input1 = choice.nextLine(); // get next line typed on keyboard
        input1 = input1.trim();
        boolean love = false;
        trueLove = false;
        int i = 1;
        

        switch (input1) {
                case "4":  // have true love
                    love = true;
                    System.out.println("\n You may love her.");
                    break;       
                default: // false love for anything else
                    System.out.println("\n You don't have true love! Try again.");
                    love = false;
                    break;
                }
  
        System.out.println(request2);
        System.out.println(responses);
        Scanner choice2 = new Scanner(System.in);
        String input2 = ""; // ans to be returned
        input2 = choice.nextLine(); // get next line typed on keyboard
        input2 = input2.trim();
        
        switch (input2) {
                case "4":  // have true love
                    System.out.println("\n You may love her.");
                    break;
                    
                default: // false love for anything else
                    System.out.println("\n You don't have true love! Try again.");
                    love = false;
                    break;
                }
       
        System.out.println(request3);
        System.out.println(responses);
        Scanner choice3 = new Scanner(System.in);
        String input3 = ""; // ans to be returned
        input3 = choice.nextLine(); // get next line typed on keyboard
        input3 = input3.trim();

        switch (input3) {
                case "4":  // have true love
                    System.out.println("\n You love her but you are not there, yet.");
                    break;
                    
                default: // false love for anything else
                    System.out.println("\n You don't have true love! Try again.");
                    love = false;
                    break;
                }

        System.out.println(request4);
        System.out.println(responses);
        Scanner choice4 = new Scanner(System.in);
        String input4 = ""; // ans to be returned
        input4 = choice.nextLine(); // get next line typed on keyboard
        input4 = input4.trim(); 

        switch (input4) {
                case "4":  // have true love
                    System.out.println("\n You love her but you are not there, yet.");
                    break;
                    
                default: // false love for anything else
                    System.out.println("\n You don't have true love! Try again.");
                    love = false;
                    break;
                }

        System.out.println(request5); 
        System.out.println(responses);
        Scanner choice5 = new Scanner(System.in);
        String input5 = ""; // ans to be returned
        input5 = choice.nextLine(); // get next line typed on keyboard
        input5 = input5.trim();         

        
        switch (input5) {
                case "4":  // have true love
                    break;
                    
                default: // false love for anything else
                    love = false;
                    break;
                }
        
        if (love) {
        trueLove = true;
        System.out.println("\n Congratulations! You have the True Love.");
        } else {
                System.out.println("\n You don't have true love! Try again.");
                }
    }

    private void startInventory() {
        if (inventoryLove < 1) {
            System.out.println("\nSorry! True Love always sold out!");
        }
    }

    private void displayHelp() {
        HelpMenuView helpMenu= new HelpMenuView ();
        helpMenu.display();
    }
}