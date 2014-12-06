import java.util.Scanner; 
public class radius {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
       System.out.print("Enter a radius value: ");
       if(scan.hasNextDouble()){
           double radius = scan.nextDouble();
           if(radius < 0){
               System.out.println("Please enter a positive value.");
               return;
           }
           System.out.print("Enter a degree value: ");
           if(scan.hasNextDouble()){
               double degree = scan.nextDouble();
               if (degree < 0 || degree >360){
                   System.out.println("Invalid Entry.");
                   return;
               }
               double perimeter = 0; 
               double area = 0; 
               double wedge = 0; 
               double remain = 0; 
               if(degree > 0 && degree < 360){
                    perimeter = 2 * Math.PI * radius; 
                    area = Math.PI * radius * radius; 
                    wedge = (perimeter + (2*radius)) - (perimeter *(degree/(double)360));
                    remain = area - (area *(degree/(double)360));
                }
                if(degree == 0){
                    perimeter = 2 * Math.PI * radius; 
                    area = Math.PI * radius * radius; 
                    wedge = perimeter; 
                    remain = area; 
                }
                if(degree == 360){
                    perimeter = 2 * Math.PI * radius; 
                    area = Math.PI * radius * radius; 
                }
                 System.out.println("The perimeter of a circle with a radius "+radius+" is: "+Math.round(perimeter * 10.0)/10.0);
                System.out.println("The area of a circle with radius "+radius+" is: "+Math.round(area * 10.0)/10.0); 
                System.out.println("The perimeter of the shape after removing a wedge of "+degree+" degrees is: "+Math.round(wedge * 10.0)/10.0);
                System.out.println("The area of the shape after removing a wedge of "+degree+" degrees is: "+Math.round(remain * 10.0)/10.0);
           }
           else{
               System.out.println("Invalid Entry.");
               return;
           }
       }
       else{
           System.out.println("Invalid Entry.");
           return;
       }
    }
}
