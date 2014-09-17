////////////////////////////////////////
//Deepshikha Das
//9.16.14
//CSE 2 sect. 111
//I'm making a program that computes the distance an average miles per hour from inputs.
//
import java.util.Scanner;
//I am now adding the class
//
//
public class Bicycle {
        //adding the main method that is always required
        public static void main(String[] args) {
        Scanner myScanner; //declaring an instance of a scanner object
        myScanner = new Scanner( System.in ); //calling the scanner constructor
        System.out.print(
            "Enter the number of seconds: "); //prompting user for number of seconds
            int nSeconds=myScanner.nextInt(); //accepting user input
            System.out.print("Enter the number of counts: "); // prompting user for number of counts
            int nCounts= myScanner.nextInt();//accepting user input
            double nMinutes=nSeconds/60.0; //converting to minutes from seconds
            double circumference=27*3.14; //calculating circumference
            double inchesTraveled=circumference*nCounts;//calculating inches traveled
            double milesTraveled=inchesTraveled/63360;// converting to miles traveled from inches
            double milesPerHour=milesTraveled/(nMinutes/60);// calculating miles per hour
            System.out.println ("The distance was "+(Math.round(100*milesTraveled)/100)+" miles and took "+(nMinutes)+" minutes.");//calcuating distancee and time
            System.out.println ("The average mph was "+(Math.round(100*milesPerHour)/100.00)); // calculating the average miles per hour.
        } //end of main method
}//end of class