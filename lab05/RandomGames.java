///////////////////////////////////////////////////////////
//Deepshikha Das
//9.23.14
//CSE 2 SECT 111
// I'm making a program that plays random games. 
//
import java.util.Scanner;
// I am now adding the class
//
public class RandomGames {
        //adding the main method which is required for every java program 
        public static void main(String[] args) {
        Scanner myScanner;// declaring instance of scanner object
        myScanner = new Scanner( System.in ); //calling scanner contructor
        System.out.println("Enter R or r for Roulette, C or c for craps, P or p for pick a card: "); //prompting user for the input 
            String game = myScanner.next(); //accepting user input for game
            if (game.equalsIgnoreCase("R")){ //creating if statement that ignores the case of the letter
                double randomn = ((Math.random())*38); //defining random number in variable
                int randomN= (int) randomn; //explicitly casting 
                System.out.println(randomN); //print random number
            
                switch (randomN) { //switch statement
                    case 37: System.out.println ("0"); break; //case fo 0
                    case 38: System.out.println ("00"); break; //casefor 00
                }
            }
        if (game.equalsIgnoreCase("C")){ //if statement that ignore case of letter
                System.out.println ("Craps option is yet to be implemented."); //output where option is not implemented
            } // end of if statement for c 
        if (game.equalsIgnoreCase("P")){ //if statement that ignores case of letter
                System.out.println ("Picking a card is not yet implemented."); //output where option is not implemented
            }//end of if statment for p
        else{  
            System.out.println(game+" is not one of R, r,C,c,P or p");//else statement that ensure the program doesn't accept anything besides p,r, or c
            
        } //end of else statement
        } // end of main method 
} //end of class