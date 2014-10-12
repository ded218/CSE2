////////////////////////////////////////////////////////////
//Deepshikha Das
//10.10.14
//CSE 2 SECT 111
//I'm writing a program that uses a loop to print out stars. 
//
import  java.util.Scanner; //I am importing the scanner
//adding the class
//
//
public class LoopTheLoop {
        //adding the main method which is always required. 
        public static void main(String[] args) {
        Scanner myScanner; //declaring instance of a scanner object
        myScanner = new Scanner( System.in ); //calling the scanner constructor
        while (true){//infinite loop
            System.out.println("Enter an int between 1 and 15 - "); //prompting the user for input between 1 and 15
            int k = 0; //declaring variable k
            int nStars = myScanner.nextInt(); //accepting user input
            while (k < nStars){ //while loop, which is limited by the sentinel nStars
                System.out.print("*"); //printing out the stars in one row 
                k++; //so the loop keeps going 
            }
            System.out.println("");
            int i=0;
            if(nStars>0 && nStars<16) {
            while (i < nStars){ //outer for loop
                i++;
                for(int j = 0; j<i; j++){ //nested for loop
                    System.out.print("*"); //printing the stars
                }//closing the outside for loop
                System.out.println(""); //an enter to make the loop go to the next line. 
            }//end of outer j loop  
                
            }//end of if statement 
            else{//else statement to reject output other than in range 1-15
                System.out.println("Your int was not in the range 1-15");
            }//end of else statement 
            System.out.println("Enter Y or y to go again: ");//prompting user for input
            String cont = myScanner.next();//accepting user input
            if (cont.equalsIgnoreCase("Y")){
                continue; //continues the loop back up
            }//end of continue if statement
            else{
                break; //breaks the loop
            }//end of break else statement
            
        }//end of infinite loop
        /*{int nStars = 10; //declaring variable nStars, which i use as the sentinel 
        int i = 0; //declaring variable i
        while (i < nStars){ //while loop, which is limited by the sentinel nStars
            System.out.print("*"); //printing out the stars, but using print instead of println to get a row of 10 stars 
            i++; //so the loop keeps going 
        }
        System.out.print("\n"); //an enter to go to the next line after printing the ten stars 
        }//END OF ********** SECTION */
        /*{for (int j = 0; j < 10; j++){ //outer for loop
            for(int i = 0; i<j; i++){ //nested for loop
                System.out.print("*"); //printing the stars
            }//closing the outside for loop
            System.out.println(""); //an enter to make the loop go to the next line. 
        }//end of outer j loop
        }//END OF *,**,***... SECTION
        */
        
        }// end of main method
}//end of class