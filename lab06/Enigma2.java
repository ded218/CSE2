import java.util.Scanner;
public class Enigma2{
  public static void main(String [] arg){
    int n=40,k=60;
    String out="";
    switch(n){
      case 12: 
      case 13: out+=13;
      case 40: out+=40;
    }
    System.out.println(out);
  }
}

/*
 * Error Report: Explain how you can use the java.lang exception to
 *     identify the runtime error in the above code
 * The java.lang exception bascially told me that on line 9 there
 * was a problem dividing by zero. So I just got rid of the dividing
 * by zero to fix it. 
 * 
 * 
 */
