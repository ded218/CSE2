//////////////////////////////////////
//Deepshikha Das
//11.01.13
//CSE 2 Sect 111
//I'm writing a program that prints blocks using nested methods
//
import java.util.Scanner; // I am importing the scanner
public class BlockedAgain{
    public static void main(String []s){
        int m; //force user to enter in in the range 1-9 inclusive.
        m = getInt(); //calls method getInt
        allBlocks(m); //callmethod allBlocks with value from getint
    }//end of main method
    
    public static int getInt(){ //method getINt
        int x; 
        while(true){ 
            x = checkInt(); //calling check int and assigning it to x 
            boolean y = checkRange(x); //calling check range; 
            if (y==false){ //for if check range is false it restarts the while(true) loop
                continue; 
            }//end of if false statement 
            break;//if the value isn't false, it exits the loop
        }//end of while loop
        return x; //returns value x which is the user's input
    }//end of get int method 
    
    public static int checkInt(){ //checkInt method 
        int x; //declaring int x where scanner input will be stored
        Scanner scan = new Scanner(System.in); //calling & declaring scanner 
        System.out.print("Enter an int from 1-9: "); //prompting the user 
        while(true){ //while loop that keeps running checkInt until it is right
            if(scan.hasNextInt()){ //if statment for if input is an int
                x = scan.nextInt(); //assigning scanner input to x
                return x; //returning int x to getInt; 
            } //end of if statment 
            else{ //for when input is not an int
                System.out.println("You didn't enter an int, try again: "); // telling user to try again
                scan.next(); //clearing out garbage, and reprompting 
            }//end of else statement
        }//end of infinite while loop
    }
   public static boolean checkRange(int x){ 
        if (x>=1 && x<=9){ //checking if x is in the range 1-9 inclusive
            return true; // returning boolean true 
        } //end of if statement 
        else{ //if x is not in the range 
           System.out.print("You did not enter an int in [1,9]; "); //telling the user they did not enter an int 
            return false; //returning boolean false 
        } //end of else statement 
            
    }
    public static void allBlocks(int x){ 
        for(int j=0; j<=x; j++){ //prints each block 
             for(int i=0; i<j; i++){ //outer i loop
            for(i=i; i<j; i++){ //inner i loop, controls number of times row printed
                for(int f=0; f<x-j; f++){
                System.out.print(" ");
                }
                for(int k=0; k<(j*2)-1; k++){ //k loop, controls number of times printed within row
                    System.out.print(j); //printing the number 
                }//closing the outside for loop
                System.out.println(""); //an enter to make the loop go to the next line.                  
            }//end of  i loop
                for(int u=0; u<x-j; u++){
                System.out.print(" ");
                }
                for(int h=0; h<(j*2)-1; h++){//h loop to control print of dashes
                    System.out.print("-"); //printing dashes
                }//end of i=0 for loop
                System.out.println("");//an enter for the - loop
        }// end of outer i loop
    }// end of j loop
    }//end of all blocks method
            
}//end of class