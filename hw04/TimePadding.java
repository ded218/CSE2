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
        int nHours = nSec /3600;
        int nMin = (nSec % 3600) / 60;
        int sec = nSec % 60;
       
        if(nSec>0){
            if (sec<10 && !(nMin<10)) {
                String time = nHours + ":" + nMin + ":0" + sec;
                System.out.println (time);
            }
            if (!(sec<10) && nMin<10) {
                String time = nHours + ":0" + nMin + ":" + sec;
                System.out.println (time);
            }
            if (sec<10 && nMin<10) {
                String time = nHours + ":0" + nMin + ":0" + sec;
                System.out.println (time);
            }
            else {
                String time = nHours + ":" + nMin + ":" + sec;
                System.out.println (time);
            }
        }
        else{
            System.out.println("Incorrect.");
        }
        }    
    
    }
}