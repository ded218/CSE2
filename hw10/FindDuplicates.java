/////////////////////////////////////////////////////////
//Deepshikha Das
//11.13.14
//CSE 2 sect 111
//I'm writing a program that checks user input for duplicates and if there is more than one duplicate
import java.util.Scanner; // improting scanner 
public class FindDuplicates{ // class 
  public static void main(String [] arg){ // main method 
    Scanner scan=new Scanner(System.in); // declaring/ callings the scanner 
    int num[]=new int[10]; // creating array of ten 
    String answer=""; // string for user's answer at "while"
    do{ // do while loop to run it once, then respond to user input
      System.out.print("Enter 10 ints- "); // prompting user to enter 10 ints
      for(int j=0;j<10;j++){ 
        num[j]=scan.nextInt(); // initializing num[] array with scanner input
      }
      String out="The array ";
      out+=listArray(num); //return a string of the form "{2, 3, -9}"   
      if(hasDups(num)){ // if has dups returns true 
        out+="has "; // "has" is added to string out. 
      }
      else{ // if hasdups is false
        out+="does not have "; //"does not have is" added to string out 
      }
      out+="duplicates."; // "duplicates is added to string out" 
      System.out.println(out); // printing string out 
      out="The array "; // " the array" is added to string out
      out+=listArray(num);    // the array is added to string out 
      if(exactlyOneDup(num)){ // if exactly one dup is true 
        out+="has "; // "has" is added to out
      }
      else{ // if exactly one dup is false
        out+="does not have "; // does not have is added to the string out
      }
      out+="exactly one duplicate."; // 'exactly one duplicate is added to the string out
      System.out.println(out); // printing out string out 
System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- "); // prompting user 
      answer=scan.next(); // accepting user input 
    }while(answer.equals("Y") || answer.equals("y")); // runs again if the user enters y or Y
  } // end of main method 

  public static String listArray(int num[]){ 
    String out="{"; // adds { to string out
    for(int j=0;j<num.length;j++){
      if(j>0){
        out+=", "; // prints commas when needed 
      }
      out+=num[j]; // adds each part of the array to string out 
    }
    out+="} "; // adds } to string out 
    return out; // send out back to the main method 
  } // end of list array method
  public static Boolean hasDups (int num[]){ 
    int[] ordered = new int[num.length]; // creating a new array so i can reorder it
    for (int i = 0; i < num.length; i++){ // initializing ordered array 
      ordered[i] = num [i];
    }
      java.util.Arrays.sort(ordered); // ordering array ordered 
      for(int j = 0; j<ordered.length-1; j++){ // checking if each matches
          if(num[j]==num[j+1]){
          return true;    // when match is made returns true
          }
      }
      return false; // if not returns false 
  } // end of hasDups
  public static Boolean exactlyOneDup (int num[]){
      java.util.Arrays.sort(num); //sorts the array 
      int w  = 0;  // counter for when it matches
      for(int j = 0; j<num.length-1; j++){ // checks if each value
          if(num[j]==num[j+1]){
          w++;    
          }
      }
      if(w==0){ // if there are no matches returns false 
          return false;
      }
      if(w>1){ // if there is more than one match returns false 
          return false; 
      }
      return true; //other wise returns true
  } // end of for loop

} // end of class 
