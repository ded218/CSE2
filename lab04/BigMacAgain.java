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
    if(myScanner.hasNextInt()){
        int nBigMacs = myScanner.nextInt(); //accpeting user input for the number of burgers
        double tCost = nBigMacs*2.22;
        if(nBigMacs > 0){
            System.out.println("You ordered "+nBigMacs+" for a cost of "+nBigMacs+"x2.22 = $"+tCost+".");
        }//end of if statement
        else{
            System.out.println("You did not enter an int>0.");
        }//end of else statement 
        System.out.println("Do you want an order of fries(Y/y/N/n)?");
        String fries = myScanner.next(); //accepting user input for fries
        if (fries.equalsIgnoreCase("Y")){
            double tTCost = tCost + 2.15;
            System.out.println ("You ordered fries at a cost of $2.15.");
            System.out.println ("The total cost of the meal is $"+tTCost+".");
        }
        if (fries.equalsIgnoreCase("N")){
            System.out.println ("The total cost of the meal is $"+tCost+".");
            } //end of fries yes if statement
        else{
            System.out.println ("You did not enter Y, y, N, or n.");
        }//end of else statement 
        }//end of big if statement
        else{
            System.out.println("You did not enter an int.");
        }//end of else statement
        } //end of main method
} //end of class