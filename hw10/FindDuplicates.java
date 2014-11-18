/////////////////////////////////////////////////////////
//Deepshikha Das
//11.13.14
//CSE 2 sect 111
//I'm writing a program that checks user input for duplicates and if there is more than one duplicate
import java.util.Scanner;
public class FindDuplicates{
  public static void main(String [] arg){
    Scanner scan=new Scanner(System.in);
    int num[]=new int[10];
    String answer="";
    do{
      System.out.print("Enter 10 ints- ");
      for(int j=0;j<10;j++){
        num[j]=scan.nextInt();
      }
      String out="The array ";
      out+=listArray(num); //return a string of the form "{2, 3, -9}"   
      if(hasDups(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="duplicates.";
      System.out.println(out);
      out="The array ";
      out+=listArray(num);    
      if(exactlyOneDup(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="exactly one duplicate.";
      System.out.println(out);
System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
      answer=scan.next();
    }while(answer.equals("Y") || answer.equals("y"));
  } // end of main method 

  public static String listArray(int num[]){
    String out="{";
    for(int j=0;j<num.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=num[j];
    }
    out+="} ";
    return out;
  } // end of list array method
  public static Boolean hasDups (int num[]){
    int[] ordered = new int[num.length];
    for (int i = 0; i < num.length; i++){
      ordered[i] = num [i];
    }
      java.util.Arrays.sort(ordered);
      for(int j = 0; j<ordered.length-1; j++){
          if(num[j]==num[j+1]){
          return true;    
          }
      }
      return false; 
  } // end of hasDups
  public static Boolean exactlyOneDup (int num[]){
      java.util.Arrays.sort(num);
      int w  = 0;  
      for(int j = 0; j<num.length-1; j++){
          if(num[j]==num[j+1]){
          w++;    
          }
      }
      if(w==0){
          return false;
      }
      if(w>1){
          return false; 
      }
      return true; 
  }

} // end of class 
