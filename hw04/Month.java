//////////////////////////////////////////////////
//Deepshikha Das
//9.23.14
//CSE 2 sect. 111
//I'm making a program that calculate the number of days in a month which is inputted. 
//
import java.util.Scanner;
//
//
public class Month {
    //adding the main class required for every java program
    public static void main(String[] args) {
    Scanner myScanner; //declaring an instance of a scanner object
    myScanner = new Scanner( System.in ); //calling the scanner constructor
    System.out.print("Enter an in giving the number of the month (1-12)"); //prompting the user for the input
    if(myScanner.hasNextInt()){ //making overall if statement
        int nMonth = myScanner.nextInt(); //accepting user input for month
        if (nMonth<1 || nMonth>12){ //overall if statement
            System.out.println("You did not enter an int between 1 and 12");
            return; //terminate program
        }
    switch (nMonth) { //switch statement
        case 1:System.out.println("The month has 31 days."); break; //january
        case 2:System.out.println("Enter a given year-"); 
                int year=myScanner.nextInt();
                if(((year%4==0)&&(year%100!=0)) || year%400==0){
                   System.out.println("The month has 29 days.");
                }
                else{
                    System.out.println("The month has 28 days.");
                }
                break; //february and in special case with leap years
        case 3:System.out.println("The month has 31 days."); break; //march
        case 4:System.out.println("The month has 30 days."); break; //april
        case 5:System.out.println("The month has 31 days."); break; //may
        case 6:System.out.println("The month has 30 days."); break; //june
        case 7:System.out.println("The month has 31 days."); break; //july
        case 8:System.out.println("The month has 31 days."); break; //august
        case 9:System.out.println("The month has 30 days."); break; //september
        case 10:System.out.println("The month has 31 days."); break; //october
        case 11:System.out.println("The month has 30 days."); break; //november
        case 12:System.out.println("The month has 31 days."); break; //december
    
    }
    
    }
    else{
        System.out.println("Not an int.");
    }
    }
    }
}