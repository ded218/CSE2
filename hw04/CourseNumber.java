///////////////////////////////////////////////////////////
//Deepshikha Das
//9.23.14
//CSE 2 sect. 111
//I'm making a program that reads a six digit number and prints when the course corresponding with the number happens.
//
import java.util.Scanner;
//I am now adding the class
//
public class CourseNumber {
    //adding the main method which is required for every java program
    public static void main(String[] args) {
    Scanner myScanner; //declaring instance of scanner object
    myScanner = new Scanner( System.in ); // calling the scanner constuctor
    System.out.println("Enter a six digit number giving the course semester- "); //prompting user for the input
   
    if(myScanner.hasNextInt()){ //making overall if statement
        int number=myScanner.nextInt(); //defining scanner
        int nYear = number/100; //defining year for input
        int semester=number % 100; //defining number for input
        if(number<186510 || number>201440){ //creating condition to avoid 
           System.out.println("The number was outside the range [186510,201440]"); //output 
        }
        switch (semester) { //switch statement
            case 10: System.out.println ("The course was offered in the Spring semester of "+nYear+"."); break; //for spring semester
            case 20: System.out.println ("The course was offered in the Summer 1 semester of "+nYear+"."); break; //for summer 1 semester
            case 30: System.out.println ("The course was offered in the Summer 2 semester of "+nYear+"."); break; //for summer 2 semester
            case 40: System.out.println ("The course was offered in the Fall semester of "+nYear+"."); break; //for fall semester
                
        }//end of swtich statement
    }//end of if statement
    
    }//end of main method
}//end of class