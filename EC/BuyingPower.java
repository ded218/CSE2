import java.util.Scanner; 
public class BuyingPower {
    public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter a US dollar amount: ");
      if(scan.hasNextDouble()){
        double dollar = scan.nextDouble(); 
        if(dollar < 0){
          System.out.println("Please enter a positive value.");
          return; 
        }
        System.out.print("Enter a year (2000-2013): ");
        if(scan.hasNextInt()){
          int year = scan.nextInt(); 
          double cpi = 0; 
          if(year >= 2000 && year <= 2013){
            switch (year) {
              case 2013: cpi = 1; break; 
              case 2012: cpi = 0.98; break;
              case 2011: cpi = 0.96; break;
              case 2010: cpi = 0.93; break;
              case 2009: cpi = 0.92; break;
              case 2008: cpi = 0.92; break;
              case 2007: cpi = 0.89; break;
              case 2006: cpi = 0.86; break;
              case 2005: cpi = 0.84; break;
              case 2004: cpi = 0.81; break;
              case 2003: cpi = 0.79; break;
              case 2002: cpi = 0.77; break;
              case 2001: cpi = 0.76; break;
              case 2000: cpi = 0.74; break;
            }
            double calc = dollar * cpi; 
            System.out.println("$ "+dollar+" today had a buying power of $ "+Math.round(calc * 100.0)/100.0+" in "+year+".");
          }
          else{
            System.out.println("Year is out of range.");
            return; 
          }
        }
        else{
          System.out.println("You did not enter valid input. ");
          return; 
        }
      }
      else{
        System.out.println("You did not enter valid input.");
        return; 
      }
    }
}