//////////////////////////////
//Deepshikha Das
//10.20.14
//CSE 2 SECT 111
//I'm writing a program that prints out number stacks
//
import java.util.Scanner; //I am importing the scanner
//adding class
//
//
public class NumberStack {
    //adding the main method which is always required. 
    public static void main(String[] args){
    Scanner myScanner; //declaring instance of scanner object
    myScanner = new Scanner( System.in ); //calling the scanner
    System.out.print("Enter a number between 1 and 9: ");
    while(!myScanner.hasNextInt()){
	    System.out.print("You did not enter an int; try again- ");
	    return;
	}//end of non in while statment
    int n = myScanner.nextInt(); //accepting user input
    {System.out.println("Using for loops!");
    if(n>0 && n<=9) {//if statement to limit user input
    for(int j=0; j<=n; j++){//outer j loop
        for(int i=0; i<j; i++){ //outer i loop
            for(i=i; i<j; i++){ //inner i loop, controls number of times row printed
                for(int k=0; k<(j*2)-1; k++){ //k loop, controls number of times printed within row
                    System.out.print(j); //printing the number 
                }//closing the outside for loop
                System.out.println(""); //an enter to make the loop go to the next line.                  
            }//end of  i loop
                for(int h=0; h<(j*2)-1; h++){//h loop to control print of dashes
                    System.out.print("-"); //printing dashes
                }//end of i=0 for loop
                System.out.println("");//an enter for the - loop
        }// end of outer i loop
    }// end of j loop
    }//end of if statement
    else{ //else statement for if user enter out of range
        System.out.println("You did not enter an int between 1 & 9."); //telling user they entered an int out of range
    }//end of else statement
    }//end of for loops
    {System.out.println("Using while loops!");
    if(n>0 && n<=9){//if statment to limit user input
        int j=0; //declaring j
        while(j<=n){ //outer j loop
            int i=0; //declaring i
            while(i<j){ //outer i loop
                while(i<j){ //inner i loop, controls number of rows printed
                    int k=0;//declaring k 
                    while(k<(j*2)-1){ //k loop, controls number of time printed within row 
                        System.out.print(j); //printing the number
                        k++; //counter
                    }//end of (k<(j*2)-1) loop
                    System.out.println(""); //enter to make the loop go to the next line
                    i++; //counter
                }//end of i<j loop
            i++; //counter
            }//end of i<j loop
            int h=0; //declaring h 
            while(h<(j*2)-1){ //h loop to control printing of dashes
                System.out.print("-"); //printing dashes
                h++; //counter
            }//end of while
            System.out.println(""); //enter for dashes
            j++; //counter
        }//end of j<=n loop
    }//end of if statement
    else{ //else statement if number out of range is entered
        System.out.println("You did not enter an int between 1 & 9."); //informing user
    }//end of else statement
    }//end of while loops   
    {System.out.println("Using do while loops!");
    if(n>0 && n<=9){ //if statement to limit user input
    int j=1; //declaring j
    do{ //do for j<=n
        int i=0;//declaring i
        do{ //do for i<j
            do{ //do for i<j
                int k=0; //declaring k
                do{//do for k<(j*2)-1
                    System.out.print(j); //printing number
                    k++; //counter
                }while(k<(j*2)-1); //control number of times number printed within row
                System.out.println(""); //enter to make the loop go to the next line
                i++; //counter
            }while(i<j); //controls the number of rows printed
            i++; //counter
            int h=0; //declaring h
        do{ //do while loop for printing dashes
            System.out.print("-");//printing dashes
            h++;//counter
        }while(h<(j*2)-1); //controls number of times dashes are printed
        System.out.println("");//enter for dashes printed
        }while(i<j); //outer i loop
        j++; //counter
    }while(j<=n); //outer j loop
    }//end of if statment
    else{//else statement to limit user input
        System.out.println("You did not enter an int between 1 & 9."); //informing user
    }//end of else statement   
    }//end of do while loops
        
    
    }// end of class
}//end of main method

