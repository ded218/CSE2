////////////////////////////////////////
//Deepshikha Das
//9.23.14
//CSE 2 sect. 111
//I'm making a program that takes income and writes out the tax on the inputted income.
//
import java.util.Scanner;
//I am now adding the class
//
public class IncomeTax {
    //adding the main class required for every java program 
    public static void main(String[] args) {
    Scanner myScanner; //declaring an instance of a scanner object
    myScanner = new Scanner( System.in ); //calling the scanner constructor
    System.out.println("Enter an int giving the number of thousands- "); //prompting the user for the input
    if(myScanner.hasNextInt()){ //making an overall if statement
        int nTax = myScanner.nextInt(); //accepting user input
        double taxOne = 0.05; //defining tax percentage for first tax bracket
        double taxTwo = 0.07; //defining tax percentage for second tax bracket
        double taxThree = 0.12; //defining tax percentage for third tax bracket
        double taxFour = 0.14; // defining tax percentage for fourth tax brackete
        if((nTax<20)&&(nTax>0)){ 
            System.out.println("The tax rate on $"+ nTax * 1000+" is "+taxOne*100+"%, and the tax is $"+(nTax*1000)*taxOne+".");
            } // if statement for first tax bracket
        if((nTax<40)&&(nTax>=20)){
            System.out.println("The tax rate on $"+ nTax * 1000+" is "+(taxTwo*1000)/10.0+"%, and the tax is $"+(Math.round(nTax*1000))*taxTwo+".");
            } //if statement for second tax bracket
        if((nTax>=40)&&(nTax<78)){
            System.out.println("The tax rate on $"+ nTax * 1000+" is "+(taxThree*1000)/10.0+"%, and the tax is $"+(Math.round(nTax*1000))*taxThree+".");
            } //if statement for third tax bracket
        if(nTax>=78){
            System.out.println("The tax rate on $"+ nTax * 1000+" is"+(taxFour*1000)/10.0+"%, and the tax is $"+(Math.round(nTax*1000))*taxFour+".");
            } //if statement for fourth tax bracket
        if(nTax<0){
            System.out.println("You did not enter a positive int.");
            return; //if statement to terminate program if a negative number is entered
        }
    else{
        System.out.println("You did not enter an int.");
        return; 
        } //else statement to terminate program if anything but ints are entered
    }
    } //end of main method
} //end of class