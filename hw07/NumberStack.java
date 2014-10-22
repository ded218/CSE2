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
    int n = myScanner.nextInt(); //accepting user input
    {System.out.println("Using for loops!");
    if(n>0 && n<=9) {
    for(int j=0; j<=n; j++){
        for(int i=0; i<j; i++){ //outer for loop
            for(i=i; i<j; i++){ //controls number of times row printed
                for(int k=0; k<(j*2)-1; k++){ //controls number of times printed within row
                    System.out.print(j); //printing the number 
                }//closing the outside for loop
                System.out.println(""); //an enter to make the loop go to the next line.                  
            }//end of  i loop
                for(int h=0; h<(j*2)-1; h++){
                    System.out.print("-");
                }//end of i=0 for loop
                System.out.println("");//an enter for the - loop
        }// end of outer i loop
    }// end of j loop
    }//end of if statement
    }//end of for loops
    {System.out.println("Using while loops!");
    if(n>0 && n<=9){
        int j=0;
        while(j<=n){
            int i=0;
            while(i<j){
                while(i<j){
                    int k=0;
                    while(k<(j*2)-1){
                        System.out.print(j);
                        k++;
                    }//end of (k<(j*2)-1) loop
                    System.out.println("");
                    i++;
                }//end of i<j loop
            i++;
            }//end of i<j loop
            int h=0;
            while(h<(j*2)-1){
                System.out.print("-");
                h++;
            }//end of while
            System.out.println("");
            j++;
        }//end of j<=n loop
    }//end of if statement
    }//end of while loops   
    {System.out.println("Using do while loops!");
        if(n>0 && n<=9){
    int j=1;
    do{
        int i=0;
        do{
            do{
                int k=0;
                do{
                    System.out.print(j);
                    k++;
                }while(k<(j*2)-1);
                System.out.println("");
                i++;
            }while(i<j);
            i++;
            int h=0;
        do{
            System.out.print("-");
            h++;
        }while(h<(j*2)-1);
        System.out.println("");
        }while(i<j);
        j++;
    }while(j<=n);
    }//end of do while loops
        
    }//end of if statement
        
    
    }// end of class
}//end of main method

