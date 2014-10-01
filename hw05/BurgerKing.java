////////////////////////////////
//Deepshikha Das
//9.27.14
//CSE 2 SECT 111
//i'm making a program that prompts the user to enter their meal choices. 
//
import java.util.Scanner;
// I am now adding the class
//
public class BurgerKing {
    //adding the main method which is required for every java program
    public static void main(String[] args) {
    Scanner myScanner; //declaring instance of a scanner object
    myScanner = new Scanner( System.in ); //calling the scanner constructor
    System.out.println("Enter a letter to indicate choice of"); //prompting user for input
    System.out.println("Burger (B or b)"); //showing user options
    System.out.println("Soda (S or s)"); //showing user options
    System.out.println("Fries (F or f)"); //showing user options
    if(myScanner.hasNext()){ 
        String order = myScanner.next(); // accepting user input for order
        if (order.equalsIgnoreCase("B")){ //creating if statement that ignore case
            System.out.println("Enter A or a for all the fixins"); //showing user options
            System.out.println("C or c for cheese"); //showing user options
            System.out.println("N or n for none of the above"); //showing user options
            String burger = myScanner.next(); // accepting user input for order
            switch (burger) { //switch statement
                case "A": System.out.println("You ordered a burger with all the fixins."); break; // output for A
                case "a": System.out.println("You ordered a burger with all the fixins."); break; // output for a
                case "C": System.out.println("You ordered a burger with cheese."); break; // output for C
                case "c": System.out.println("You ordered a burger with cheese."); break; // output for c
                case "N": System.out.println("You ordered a burger."); break; // output for N
                case "n": System.out.println("You ordered a burger."); break; // output for n
                default: System.out.println("You did not enter A,a,C,c,N, or n."); break;
            } // end of swtich statement
        } //end of if statement
        /*else if(order.length()>1)*/
        if (order.equalsIgnoreCase("S")){ //creating if statement that ignore case
            System.out.println("Do you want Pepsi (P or p)"); //showing user options
            System.out.println("Coke (C or c)"); //showing user options
            System.out.println("Sprite (S or s)"); //showing user options
            System.out.println("or Mountain Dew (M or m) - "); //showing user options
            String soda = myScanner.next(); // accepting user input for order
            switch (soda) { //switch statement
                case "P": System.out.println("You ordered a Pepsi."); break; // output for P
                case "p": System.out.println("You ordered a Pepsi."); break; // output for p
                case "C": System.out.println("You ordered a Coke."); break; // output for C
                case "c": System.out.println("You ordered a Coke."); break; // output for c
                case "S": System.out.println("You ordered a Sprite."); break; // output for S
                case "s": System.out.println("You ordered a Sprite."); break; // output for s
                case "M": System.out.println("You ordered a Mountain Dew."); break; // output for M
                case "m": System.out.println("You ordered a Mountain Dew."); break; // output for m
                default: System.out.println("You did not enter P,p,C,c,S,s,M or m."); break; 
            } //end of switch statement
        } //end of if statement
        if (order.equalsIgnoreCase("F")){ //creating if statement that ignore case
            System.out.println("Do you want a large (L or l)"); //showing user options
            System.out.println("or small (S or s) order of fries?"); //showing user options
            String fries = myScanner.next(); // accepting user input for order
            switch (fries) { //switch statement
                case "L": System.out.println("You ordered large fries."); break; // output for L
                case "l": System.out.println("You ordered large fries."); break; // output for l
                case "S": System.out.println("You ordered a small fries."); break; // output for S
                case "s": System.out.println("You ordered a small fries."); break; // output for s
                default: System.out.println("you did not enter L,l,S,or s."); break;
            } //end of switch statement 
        } //end of if statement
        if(order.length()>1){ //creating if statement for if input is more than 1 character
            System.out.println ("A single character expected."); //output if input is more than 1 character
            return; //leaves program
        } //end of if statement
    }// end of overall if statement
    else{ //else statement 
        System.out.println("You did not enter any of B, b, S, s,F, or f"); //output if character besides bBSsF or f is entered
        return; //leaves program
        }//end of else statement
    } //end of main method
} // end of class