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
        m = getInt();
        allBlocks(m); 
    }//end of main method
    
    public static int getInt(){
        int x;
        while(true){
            x = checkInt();
            boolean y = checkRange(x); 
            if (y==false){
                continue; 
            }
            break;
        }
        return x;
    }
    
    public static int checkInt(){
        int x;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an int from 1-9: ");
        while(true){
            if(scan.hasNextInt()){
                x = scan.nextInt();
                return x;
            }
            else{
                System.out.println("You didn't enter an int, try again: ");
                scan.next(); 
            }
        }
    }
   public static boolean checkRange(int x){
        if (x>=1 && x<=9){
            return true;
        }
        else{
           System.out.print("You did not enter an int in [1,9]; ");
            return false; 
        }
            
    }
    public static void allBlocks(int x){
        for(int j=0; j<=x; j++){
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