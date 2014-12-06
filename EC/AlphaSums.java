import java.util.Scanner; 
public class AlphaSums {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a word or a phrase: ");
        String word = scan.nextLine(); 
        int count = 0; 
        for(int i = 0; i < word.length(); i++){
            char check = word.charAt(i);
            if(check == 'a' || check == 'A'){
                count += 1; 
            }
            if(check == 'e'|| check == 'E'){
                count += 5; 
            }
            if(check == 'i' || check == 'I'){
                count += 9; 
            }
            if(check == 'o' || check == 'O'){
                count += 15; 
            }
            if(check == 'u' || check == 'U'){
                count += 21; 
            }
            else{
                continue; 
            }
        }
        System.out.println("The sum of all vowels' positions is "+count+".");
    }
}