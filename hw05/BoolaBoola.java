//////////////////////////////////////////////////////////
//Deepshikha Das
//9.27.14
//cse 2 sect 111
//I'm making a program that has three boolean variable which are assigned randomly then evaulated. 
//
import java.util.Scanner;
//i am now adding the class
//
public class BoolaBoola {
        //adding the main method which is required for every java program
        public static void main(String[] args) {
        Scanner myScanner; //declaring the instance of a scanner object
        myScanner = new Scanner(System.in ); //calling the scanner constructor 
        double Num1 = (Math.random()*2)+1; 
        int num1 = (int) Num1; //explcitly casting from double to int
        double Num2 = (Math.random()*2)+1; 
        int num2 = (int) Num2; //explcitly casting from double to int
        double Num3 = (Math.random()*2)+1; 
        int num3 = (int) Num3; //explcitly casting from double to int
        double Num4 = (Math.random()*2)+1; 
        int num4 = (int) Num4; //explcitly casting from double to int
        double Num5 = (Math.random()*2)+1; 
        int num5 = (int) Num5; //explcitly casting from double to int
        boolean one = true, two = true, three = true;//arbitrary initialization
        if (num1==1){
            one= true;
        }
        else{
            one=false;
        }
        if (num2==1){
            two= true;
        }
        else{
            two=false;
        }
        if (num3==1){
            three= true;
        }
        else{
            three=false;
        }
        String sign1 = "", sign2 = "";
        if (num4==1){
            sign1 = " || ";
        }
        else{
            sign1 = " && ";
        }
        if (num5==1){
            sign2 = " || ";
        }
        else{
            sign2 = " && ";
        }
        System.out.println("Does "+one+sign1+two+sign2+three+" have the value (t/T) or false (f/F)?");
        
        
        boolean eval=true;
        switch (sign1){
            case " && ": 
                    switch (sign2){
                            case " && ": eval = (one && two) && three; break;
                                            
                            case " || ": eval = (one && two) || three; break;
                    }
                    break;
            case " || ":
                    switch (sign2){
                            case " && ": eval = (one || two) && three; break;
                            case " || ": eval = (one || two) || three; break;
                    }
        }            
        String trueFalse = myScanner.next(); //accepting user input for answer

        switch (trueFalse) {
            case "T":   if (eval) {
                            System.out.println("Correct");
                        }
                        else {
                            System.out.println("Sorry, try again.");
                        }
                        break;
            case "t":   if (eval) {
                            System.out.println("Correct");
                        }
                        else {
                            System.out.println("Sorry, try again.");
                        }
                        break;
            case "F":   if (!eval) {
                            System.out.println("Correct");
                        }
                        else {
                            System.out.println("Sorry, try again.");
                        }
                        break;
            case "f":   if (!eval) {
                            System.out.println("Correct");
                        }
                        else {
                            System.out.println("Sorry, try again.");
                        }
                        break;
            default: System.out.println("You did not enter T,t,F, or f.");
        }
        
        
        } //end of main method
} //end of class
