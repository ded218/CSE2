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
        double Num2 = (Math.random()*2)+1; //generating random number 
        int num2 = (int) Num2; //explcitly casting from double to int
        double Num3 = (Math.random()*2)+1; //generating random number
        int num3 = (int) Num3; //explcitly casting from double to int
        double Num4 = (Math.random()*2)+1; //generating random number
        int num4 = (int) Num4; //explcitly casting from double to int
        double Num5 = (Math.random()*2)+1; //generating random number
        int num5 = (int) Num5; //explcitly casting from double to int
        boolean one = true, two = true, three = true;//arbitrary initialization
        if (num1==1){ //if statement for assigning true and false to randomly generate for 1 or 2
            one= true;
        }
        else{
            one=false;
        }
        if (num2==1){ //if statement for assigning true and false to randomly generated for 1 or 2
            two= true;
        }
        else{ 
            two=false;
        }
        if (num3==1){ //if statement for assigning true and false to randomly generated for 1 or 2 
            three= true;
        }
        else{
            three=false;
        }
        String sign1 = "", sign2 = "";
        if (num4==1){ // if statement for assigning || or && to a randomly generated for 1 or 2
            sign1 = " || ";
        }
        else{
            sign1 = " && ";
        }
        if (num5==1){ // if statement for assigning || or && to a randomly generated for 1 or 2
            sign2 = " || ";
        }
        else{
            sign2 = " && ";
        }
        System.out.println("Does "+one+sign1+two+sign2+three+" have the value (t/T) or false (f/F)?"); //asking user question and prompting for input 
        
        
        boolean eval=true; //arbitrarily initialized boolean
        switch (sign1){ //switch statement for each case
            case " && ":  // if the first symbol is &&
                    switch (sign2){ 
                            case " && ": eval = (one && two) && three; break; //switch statement for if the two symbols are && and &&
                                            
                            case " || ": eval = (one && two) || three; break; //switch statement for if the two symbols are && and ||
                    }//end of inner switch 
                    break;
            case " || ": //if the first symbol is ||
                    switch (sign2){
                            case " && ": eval = (one || two) && three; break; //switch statement for if the two symbols are || and &&
                            case " || ": eval = (one || two) || three; break; //switch statement for if the two symbols are || and ||
                    }// end of inner switch 
        } //end of outer switch 
        String trueFalse = myScanner.next(); //accepting user input for answer

        switch (trueFalse) { //switch statement for evaluating user input
            case "T":   if (eval) { //if user inputs T and expression is true
                            System.out.println("Correct");
                        } //end of case T if
                        else {
                            System.out.println("Sorry, try again."); //if user inputs T and expression is false
                        }//end of case T else 
                        break;
            case "t":   if (eval) { //if user inputs t and expression is true
                            System.out.println("Correct"); 
                        }//end of case t if
                        else {
                            System.out.println("Sorry, try again."); //if user inputs T and expression is true
                        }//end of case t else
                        break;
            case "F":   if (!eval) {
                            System.out.println("Correct"); //if user inputs F and expression is true
                        } //end of case F if
                        else {
                            System.out.println("Sorry, try again."); //if user inputs F and expression is false
                        } //end of case F else
                        break;
            case "f":   if (!eval) {
                            System.out.println("Correct"); //if user inputs f and expression is true
                        } //end of case f if 
                        else {
                            System.out.println("Sorry, try again."); //if user inputs T and expression is false
                        } //end of case f else
                        break;
            default: System.out.println("You did not enter T,t,F, or f."); //if user inputs anything besies TtFf
        } //end of overall switch statement 
        
        
        } //end of main method
} //end of class
