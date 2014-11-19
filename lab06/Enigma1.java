/* The user is supposed to enter a number between 0 and 99.
 * The program interprets that as a percentage, converts it to
 * a prorportion and then displays the proportion (out of 1) 
 * remaining. It does not always work. Find out when it doesn't
 */

import java.util.Scanner; // importing the scanner
public class Enigma1{ //class 
  public static void main(String []arg){ // main method
    System.out.print("Enter a value for the percent (0, 1,...99)- "); // prompting user for input  
    double x=((new Scanner(System.in)).nextDouble()); // declaring/ calling the scanner & accepting user input
   System.out.println("You entered "+x+"%"); //telling user what they inputted in the form of a percentage 
   double perC = x/100; // converts user input into a percent 
   double reM = 1 - perC; // subtracts percentage that user inputted from one
   if(x>0 && x<100){ // if statement limiting user input 
     System.out.println("The proportion remaining is "+Math.round(100*reM)/100.00); //prints out portion remaining 
   } //end of of if statment limiting income 
   
   } // end of main method 
} // end of class 

/* Error report: 
 *    (Exlain the error(s) that occur here, in this comment,
 *    and fix the errors)
 *    Hint: What kinds of input are unacceptable? What kinds of
 *        acceptable input don't produce the correct answer?
 * 
 * The problem with the program is that it is limited in the 
 * types of input it can take in. The if/else if statements 
 * only account for specific numbers (94, 60 etc.). 
 * Also the user's input is never actually converted into a
 * percentage, it just prints the user's input with a "%" at the end
 * To fix this problem I created a new double called perC, which 
 * divided the user's input by 100 to convert it into a percent
 * Then I created another double that subtracts the percentage 
 * from perC from 1, called reM, so that you get the proportion 
 * remaining which I then printed out, and used math.round to 
 * ensure even decimals. i also deleted previous double called percentage.
 * Then around all of that i added an if statement that limits the
 * user input. 
 */

