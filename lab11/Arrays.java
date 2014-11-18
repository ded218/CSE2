////////////////////////////////
//Deepshikha Das
//11.07.14
//I'm writing a program that uses arrays 
//
import java.util.Scanner; // importing the scanner
public class Arrays{ //class 
    public static void main(String [] arg){ // main method
         Scanner scan=new Scanner(System.in); // declaring and calling the scanner
        int[] input = new int[10];
        System.out.println("Enter ten ints: "); // prompting the user
        
        for(int r = 0; r<10; r++){ // runs ten times to accept 10 array variables
            input[r] = scan.nextInt(); // accepting user input
        }//enf of r for loop 
        
        int l = input[0]; // loop that checks each number in the array to find the lowest number
        for(int k = 1; k<10; k++){ // keeps it running for every number in the array 
            if(input[k]< l){  // compares the two numbers
                l = input[k]; // when a number is lower, it changes the value of l 
            } //end of if statement 
        } //end of k for loop 
        System.out.println("The lowest entry is "+l); // printing out the lowest entry 

        int t = input[0]; // loop that checks each number in the array to find the highest number
        for(int k = 1; k<10; k++){ // keeps it running for every number in the array 
            if(input[k]> t){ // compares the two numbers 
                t = input[k]; // when a number is higher, it changes the value of t 
            }//end of if statement 
        } //end of k for loop
        System.out.println("The highest entry is "+t); // printing out the highest entry 
        
        int sum = 0;
        for(int i = 0; i<10; i++){ // for loop that keeps running through the entire array 
            sum+= input[i]; //adding each number of the array and increasing sum every time
        }
        System.out.println("The sum is "+sum); //printing out the sum of the array 
        
        int x = 0; 
        int y = 9; 
        while(x<10){ //runs through the entire array  
            System.out.printf("%-5s  %-5s%n", input[x], input[y]); //prints out the value of each array variable in columns 
            x++; //increases count for array number 
            y--; //decreases count for array number 
        } //end of while loop 
        
    } //end of main method 
} // end of class