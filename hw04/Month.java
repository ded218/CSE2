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
    Scanner myScanner;
    myScanner = new Scanner( System.in );
    System.out.print("Enter an in giving the number of the month (1-12)");
    if(myScanner.hasNextInt()){ //making overall if statement
        int nMonth = myScanner.nextInt(); //accepting user input for month
        if (nMonth<1 || nMonth>12){
            System.out.println("You did not enter an int between 1 and 12");
            return; //terminate program
        }
    switch (nMonth) {
        case 1:System.out.println("The month has 31 days."); break;
        case 2:System.out.println("Enter a given year-");
                int year=myScanner.nextInt();
                if(((year%4==0)&&(year%100!=0)) || year%400==0){
                   System.out.println("The month has 29 days.");
                }
                else{
                    System.out.println("The month has 28 days.");
                }
                break;
        case 3:System.out.println("The month has 31 days."); break;
        case 4:System.out.println("The month has 30 days."); break;
        case 5:System.out.println("The month has 31 days."); break;
        case 6:System.out.println("The month has 30 days."); break;
        case 7:System.out.println("The month has 31 days."); break;
        case 8:System.out.println("The month has 31 days."); break;
        case 9:System.out.println("The month has 30 days."); break;
        case 10:System.out.println("The month has 31 days."); break;
        case 11:System.out.println("The month has 30 days."); break;
        case 12:System.out.println("The month has 31 days."); break;
    
    }
    
    }
    }
}