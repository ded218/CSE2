///////////////////////////////////
//Deepshikha Das
//9.12.14
//CSE 2 sect. 111
//I'm making a program that computes the cost of buying a certain amount of big macs. 
//
import java.util.Scanner;
//I am now adding the class
//
//
public class BigMac {
        //adding in the main method which is required for every java program
        public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner( System.in );
        System.out.print(
            "Enter the number of Big Macs(an integer > 0): ");
            int nBigMacs=myScanner.nextInt();
            System.out.print("Enter the cost per big Mac as"+
            " a double (in the form xx.xx); " );
            double bigMac$ = myScanner.nextDouble();
                System.out.print(
                "Enter the percent tax as a whole number (xx): ");
                double taxRate = myScanner.nextDouble();
                taxRate/=100; //user enter percent, but I want
                    //proportion
                    double cost$;
                    int dollars, //whole dollar amount of cost
                        dimes, pennies; //for stroing digits
                            //to the right of decimal point
                            //for cost$
                    cost$ = nBigMacs*bigMac$*(1+taxRate);
                    //get the whole amount, dropping decimal fraction
                    dollars=(int)cost$;
                    //get dimes amount, e.g.,
                    // (int)(6.73 * 10) % -> 67 % 10 -> 7
                    // where tthe % (mod) operator returns the remainder
                    // after the division: 583%100 -> 83, 27%5 -> 2
                    dimes=(int)(cost$*10)%10;
                    pennies=(int)(cost$*100)%10;
                    System.out.println("The total cost of " +nBigMacs
                    +" BigMacs, at $"+bigMac$ +" per bigMac, with a" +
                    " sales tax of "+ (int)(taxRate*100) + "%, is"+
                        "$ "+dollars+'.' +dimes+pennies);
                
            
        } // end of main method
} //end of class