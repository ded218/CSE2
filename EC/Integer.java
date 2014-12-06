import java.util.Scanner; 
public class Integer {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        if(scan.hasNextInt()){
            int integer = scan.nextInt();
            if(integer == 0){
                System.out.println("You entered zero.");
            }
            else if(integer < 0){
                if(integer % 2 == 0){
                    System.out.println(integer+" is a negative, even integer.");    
                }
                else{
                    System.out.println(integer+" is a negative, odd integer.");
                }
            }
            else if(integer > 0){
                if(integer % 2 == 0){
                    System.out.println(integer+" is a positive, even integer.");
                }
                else{
                    System.out.println(integer+" is a positive, odd integer.");
                }
            }
        }
        else{
            String string = scan.next(); 
            System.out.println(string+" is not an integer.");
            return;
        }
    }
}