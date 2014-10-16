//////////////////////////////////////////////////////
//Deepshikha Das
//9.19.14
//CSE 2 sect 111
//I'm making a program that obtains information from a user to see
//how many bigmacs they want and if they want fries. 
//
import java.util.Scanner; //i am importing the scanner
//I am now adding the class which is always necessary
//
//
public class BigMacAgain {
    //adding main method which is always necessary 
    public static void main(String[] args) {
    Scanner myScanner; //declaring instance of a scanner object
    myScanner = new Scanner( System.in ); // calling the scanner constructor
    System.out.print("Enter the number of Big Macs: "); // prompting the user for the number of big macs
    if(myScanner.hasNextInt()){ //overall if statement 
        int nBigMacs = myScanner.nextInt(); //accpeting user input for the number of burgers
        double tCost = nBigMacs*2.22; //declaring a double to calculate total cost of just the burgers 
        if(nBigMacs > 0){ //if statement to prevent user for entering negative numbers
            System.out.println("You ordered "+nBigMacs+" for a cost of "+nBigMacs+"x2.22 = $"+tCost+"."); // telling user their purchase
        }//end of if statement
        else{ //else statement to tell user what they were supposed to enter
            System.out.println("You did not enter an int>0."); //output for else statement 
        }//end of else statement 
        System.out.println("Do you want an order of fries(Y/y/N/n)?"); //asking user if they want fries
        String fries = myScanner.next(); //accepting user input for fries 
        if (fries.equalsIgnoreCase("Y")){ //if statemnet for if y or Y is entered
            double tTCost = tCost + 2.15; //double that calculates total cost of burgers and fries
            System.out.println ("You ordered fries at a cost of $2.15."); //informing user of the cost of fries
            System.out.println ("The total cost of the meal is $"+tTCost+"."); //informing user their total cost
        }
        if (fries.equalsIgnoreCase("N")){
            System.out.println ("The total cost of the meal is $"+tCost+"."); //informing user the total cost of the meal 
            } //end of fries yes if statement
        else{//else statement for if user enters anything besides Y y N or n
            System.out.println ("You did not enter Y, y, N, or n."); // telling user what they should've entered
        }//end of else statement 
    }//end of big if statement
    else{ //else statement for if the person does not initally enter an int. 
            System.out.println("You did not enter an int.");
    }//end of else statement
        } //end of main method
} //end of class