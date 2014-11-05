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
        System.out.print(m);
        /*    allBlocks(m); */
    }//end of main method
    
    public static int getInt(){
        System.out.print("Enter an int between 1 and 9, inclusive: ");
        Scanner scan=new Scanner(System.in);
        boolean check;
        boolean check2;
        int y;
        check = checkInt(scan);
        check2 = checkRange();
        return y; 
    }//end of getInt

    public static boolean checkInt(Scanner scan){
        boolean f; 
        while(!scan.hasNextInt()){
            System.out.print("You did not enter an int; try again: ");
            scan.next();
            f = checkInt(scan);
        }
        f = true;
        return f;
    }//end of checkInt
    public static boolean checkRange(int x){
        System.out.println("HEYYY");
        while (x<1 && x>9){
            System.out.print("You did not enter an int in the range [1,9], try again: ");
            int y = getInt(); 
        }
        return x;
             
    }//end of checkRange
    
}//end of class