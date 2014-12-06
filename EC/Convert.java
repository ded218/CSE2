import java.util.Scanner;
public class Convert {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter of of (0, 1, 10, 11, 100, 101, 110, or 111): ");
            int Int = scan.nextInt(); 
            if(Int == 0 || Int == 1 || Int == 10 || Int == 11 || Int == 100 || Int == 101 || Int == 110 || Int == 111){
                int binary = 0; 
                switch (Int){
                    case 0: binary = 0; break;
                    case 1: binary = 1; break;
                    case 10: binary = 2; break;
                    case 11: binary = 3; break;
                    case 100: binary = 4; break;
                    case 101: binary = 5; break;
                    case 110: binary = 6; break;
                    case 111: binary = 7; break;
                    
                }
                System.out.println(binary);
            }
            else{
                System.out.println("You did not enter one of (0, 1, 10, 11, 100, 101, 110, or 111).");
                return;
            }
        
    }
}