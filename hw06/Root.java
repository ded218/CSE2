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
    System.out.println("Enter a double that is greater than zero: "); //prompting the user
    double x = myScanner.nextDouble(); //accepting user input
    if (x>0){
            double low = 0;//setting low 
            double high = 1 + x; //setting the high 
        while(true){ //infite loop
            double middle = (low+high)/2; //calculating the middle of the low and the high 
            double middleSqr = middle* middle; //calculating the square of the middle
            if(middleSqr> x){ //if statement for if the sqrdmiddle number is greater than x
                high=middle; //making the high equal the middle 
            } // end of if1
            if(middleSqr<x){ //if statement for if the sqrdmiddle number is less than x
                low=middle; //making the low equal the middle 
            }//end of if2
            double interval = high-low; //declaring the interval
            if(interval <=0.0000001*high){ //if statment to end loop
                System.out.println("The square root is "+middle+"."); //printing the square root
                break; //ending loop
            }//end of if statement for break
        }//end of infinite while loop
    }//end of overall if statement
    else{
        System.out.println("You did not enter an double greater than zero."); //output to tell user they did not enter the right input
        return; //end program 
    }//end of else statement 
    }//end of main method
}//end of class