//////////////////////////////////////////////////////
//Deepshikha Das
//9.23.14
//CSE 2 sect 111
//I'm making a program that accepts the number of seconnds and displays it in conventional form. 
//
import java.util.Scanner;
//I am now adding the class
//
public class TimePadding {
    //adding the main method which is required for every java program
    public static void main(String[] args) {
    Scanner myScanner; // declaring instance of a scanner object
    myScanner = new Scanner( System.in ); // calling the scanner constructor
    System.out.println("Enter the time in seconds: "); //prompting the user to input 
    if(myScanner.hasNextInt()){ //making overall if statement 
        int nSec = myScanner.nextInt(); //accepting user input for month
        int nHours = nSec /3600; // calculating hours
        int nMin = (nSec % 3600) / 60; // calculating minutes
        int sec = nSec % 60; //calculating seconds
       
        if(nSec>0){ //creating overall if statement
            if (sec<10 && !(nMin<10)) { //defining inputs for if statement
                String time = nHours + ":" + nMin + ":0" + sec; //string for output
                System.out.println (time); //output with string used
            }//if statement closed
            if (!(sec<10) && nMin<10) { //defining inputs for if statement
                String time = nHours + ":0" + nMin + ":" + sec; //string for ouptput
                System.out.println (time); //output with string used
            }//if statement closed
            if (sec<10 && nMin<10) { //defining inputs for if statement
                String time = nHours + ":0" + nMin + ":0" + sec; //string for output
                System.out.println (time); // output with string used
            }//if statement closed
            else { //else statement
                String time = nHours + ":" + nMin + ":" + sec; //string for output
                System.out.println (time); //output with string used
            }//else statement closed
        }//overall if statement closed
        else{
            System.out.println("Incorrect."); //else statement for incorrect input
        }//else statement closed
        }//overall if statement closed   
    
    }//end of main method
}//end of class