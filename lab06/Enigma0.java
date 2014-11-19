/*Sample of expected output:
 *   Enter an int- 9
 *   You entered 9
 *   sum is 25
 *   Again, you entered 9
 */

import java.util.Scanner;
public class Enigma0{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter an int- "); 
    int n=scan.nextInt();  
    System.out.println("You entered "+n);
    
    int k=4,p=6,q=7,r=8;
    switch(k+p+q+r){
      case 24: 
      case 25: System.out.println("sum is 25");
      default:
        System.out.println("Again, you entered "+n);
    }
    
  }
}

/* Error report:
 *   Expand this comment:
 *   Explain the error(s) that occurred here, and then fix them
 *The first error that I fixed was the main method which was not properly formatted. 
 *I switched the location of the [] and made arg args 
 *Originally the command to call the scanner and declare it was mixed into one 
 *statement and I seperated them. 
 *I eliminated the if else statement entirely and just used the output from the 
 *if statement. 
 *Before the switch statement a bunch of variables were declared, and n was declared again
 *but wasn't given a value, so I deleted it. 
 *lastly, this wasn't necessarily an error, but the out put read "To repeat, you entered" 
 *so I changed it to match the expected output. 
 */

