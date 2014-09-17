//////////////////////////////////////////////////////
//Deepshikha Das
//9.16.14
//CSE 2 sect. 111
//I'm making a program
//
import java.util.Scanner;
// I am now adding the class
//
//
public class Root {
        //adding main method which is alway required
        public static void main(String[]args) {
        Scanner myScanner;//declaring an instance of a scanner object
        myScanner = new Scanner( System.in ); //calling the scanner constructor
        System.out.print(
            "Enter a double, and I print its cube root-");// prompting user for input
            double x=myScanner.nextDouble(); //accepting user input
            double guess=x/3; //guess number one
            double guess2= (2*guess*guess*guess+x)/(3*guess*guess);// guess number two, improving estimate
            double guess3= (2*guess2*guess2*guess2+x)/(3*guess2*guess2); //guess number three, improving estimate
            double guess4= (2*guess3*guess3*guess3+x)/(3*guess3*guess3); //guess number four, improving estimate
            double guess5= (2*guess4*guess4*guess4+x)/(3*guess4*guess4); //guess number five, improving estimate
            double guess6= (2*guess5*guess5*guess5+x)/(3*guess5*guess5); //guess number six, improving estimate
            System.out.println ("The cube root is"+(guess6)+"."); //defining the cube root
            System.out.println (guess6+"*"+guess6+"*"+guess6+"="); //multiplying guess 6 three times
            System.out.println (guess6*guess6*guess6); // actually multiplying guess three times
            
            
        }  // end of main method
} //end of class
