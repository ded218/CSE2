///////////////////////////////////////////////
//Deepshikha Das
//10.13.14
//CSE 2 SECT 111
//I'm writing a program that calculates square roots. 
//
import java.util.Scanner; //I am importing the scanner
//adding class
//
// 
public class Root {
    //adding the main method which is always required.
    public static void main(String[] args) {
    Scanner myScanner;  //declaring instance of scanner object
    myScanner = new Scanner( System.in ); //calling the scanner constructor
    System.out.println("Enter a number"); //prompting the user
        double x = myScanner.nextDouble(); //accepting user input
        double low = 0;//setting low 
        double high = 1 + x; //setting the high 
    while(true){
        double middle = (low+high)/2; 
        double middleSqr = middle* middle; 
        if(middleSqr> x){
            high=middle; 
        } // end of if1
        if(middleSqr<x){
            low=middle;
        }//end of if2
        double interval = high-low; 
        if(interval <=0.0000001*high){
            double cInterval = interval/2;
            System.out.println("The square root is "+middle+".");
            break; 
        }//end of if statement for break
    }//end of infinite while loop
    }//end of main method
}//end of class