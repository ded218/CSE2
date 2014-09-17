/////////////////////////////////////////////////////////
//Deepshikha Das
//9.16.14
//CSE 2 sect. 111
//I'm making a program that displays the four digits to the right of the decimal point
//
import java.util.Scanner;
//i am now adding the class
//
//
public class FourDigits {
    //adding the main method which is always required
    public static void main(String[] args) {
    Scanner myScanner; // declaring an instance of scanner objecct
    myScanner = new Scanner( System.in ); // calling the scanner constructor 
    System.out.print(
        "Enter a double and I display the four digits to the right of the decimal point-"); // prompting user for input
    double dub=myScanner.nextDouble(); //accepting user input
    int dub1= (int)(dub*10000); //defining each decimal
    int dub2= (int)(dub1 % 10); // defining each decimal
    int dub3= (int)(dub1/10) % 10; //defining each decimal
    int dub4= (int)(dub1/100 )% 10;// defining each decimal
    int dub5= (int)(dub1/1000) % 10; // defining each decimal
    System.out.printf("The four digits are "+dub5+dub4+dub3+dub2+"."); //out put with four digits
}// end of main method
    } //end of class