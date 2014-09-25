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
        public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner( System.in );
        System.out.print("Enter the number of Big Macs: "); // prompting the user for the number of big macs
            int nBigMacs = myScanner.nextInt();
        if(myScanner.hasNextInt())
            if(nBigMacs<0){
            double BigPrice$ = nBigMacs*2.22;
            System.out.println("You ordered "+nBigMacs+"for a cost of"+BigPrice$+".");
        }
        else{
            System.out.println("You did not enter an int");
            return; // leaves the program, i.e.
                        //the p{rogram terminates
                        
        }
        
            
        } //end of main method
} //end of class