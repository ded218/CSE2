//////////////////////////
//Deepshikha Das
//10.24.14
//CSE 2 SECT 111
//I'm writing a program that takes three ints fromt he user tells you about them.
//
import java.util.Scanner;
public class Methods{
    public static void main(String [] arg){
        Scanner scan=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter three ints:");
        a=getInt(scan);
        b=getInt(scan);
        c=getInt(scan);
        
        
        System.out.println("The larger of "+a+" and "+b+" is "+larger(a,b));
        System.out.println("The larger of "+a+","+b+", and "+c+" is "+larger(a,larger(b,c)));
        System.out.println("It is "+ascending(a,b,c)+" that "+a+","+b+", and "+c+" are in ascending order");
    }//defining main method
    public static int getInt(Scanner x){
        System.out.print("Enter an int: ");
        while(!x.hasNextInt()){
            System.out.println("You did not enter an int");
            System.out.println("Enter an int: ");
            x.next();
        }//end of ! statement 
        return(x.nextInt());
    }// end of getInt method
    public static int larger(int num1, int num2){
        int result;
        if(num1> num2)
            result = num1; 
        else 
            result = num2; 
        return result;
    }//end of larger method
    public static boolean ascending(int x, int y, int z){
        boolean conc; 
        if(x<y && y<z)
            conc=true;
        else 
            conc=false; 
        return conc; 
    }//end of ascending method 
}//defining class 