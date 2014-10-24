//////////////////////////
//Deepshikha Das
//10.24.14
//CSE 2 SECT 111
//I'm writing a program that takes three ints fromt he user tells you about them.
//
import java.util.Scanner; //i am importing the scanner
public class Methods{ //adding class 
    public static void main(String [] arg){ //adding main method
        Scanner scan=new Scanner(System.in); //declaring the calling the scanner
        int a,b,c; //declaring int a, b and c
        System.out.println("Enter three ints:"); //prompting user for input
        a=getInt(scan); //accepting first int from user
        b=getInt(scan); //accepting second int from user
        c=getInt(scan); //accepting third int from user
        
        
        System.out.println("The larger of "+a+" and "+b+" is "+larger(a,b));
            //telling user  which number of the first two is larger
        System.out.println("The larger of "+a+","+b+", and "+c+" is "+larger
            (a,larger(b,c))); //telling user which number of the three numbers is larger
        System.out.println("It is "+ascending(a,b,c)+" that "+a+","+b+", and "
            +c+" are in ascending order"); //telling user if the numbers are in ascending order
    }//end of main method
    public static int getInt(Scanner x){ //adding getInt method
        System.out.print("Enter an int: "); //promting user for an int
        while(!x.hasNextInt()){ //forcing user to enter an int
            System.out.println("You did not enter an int"); //informing user they did not enter an int
            System.out.println("Enter an int: ");// prompting user for an int again
            x.next();//accepting user input
        }//end of while loop to force user to enter an int 
        return(x.nextInt());//accepting user input
    }// end of getInt method
    public static int larger(int num1, int num2){ //adding larger method
        int result; //declaring int for result 
        if(num1> num2) //checking if the first number is greater than the second
            result = num1; // result if the num1> num2
        else  //if num1 is not > num2
            result = num2; //result if num 2 is greater
        return result; //returing the result 
    }//end of larger method
    public static boolean ascending(int x, int y, int z){
        boolean conc; //declaring boolean for the conclusion 
        if(x<y && y<z) //if x is greater y and y is greater than z
            conc=true; // then number is ascending and returning result true
        else //for if the numbers are not in ascending order
            conc=false; //the result is false
        return conc; //returning the conclusion
    }//end of ascending method 
}//defining class 