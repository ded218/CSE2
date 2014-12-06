import java.util.Scanner; 
public class TempConversion {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the current temperature outside: ");
        if(scan.hasNextDouble()){
            double temp = scan.nextDouble(); 
            System.out.print("Celcius or Farenheit? (C or F): ");
            String cf = scan.next(); 
            if(cf.equalsIgnoreCase("C")){
                double f = (temp * ((double)9/(double)5)  + 32); 
                System.out.println("The current temperature in Farenheit is: "+Math.round(f * 100.0) / 100.0+ " F");
            } 
            else if( cf.equalsIgnoreCase("F")){
                double c = ((temp - 32) * ((double)5/(double)9));
                System.out.println("The current temperature in Celcius is: "+Math.round(c * 100.0) / 100.0+ " C");
            }
            else{
                System.out.println("You did not enter valid input.");
                return; 
            }
            
        }
        else{
            System.out.println("You did not enter valid input.");
            return; 
        }
        
            
    }
    
    
}