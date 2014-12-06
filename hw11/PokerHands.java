//////////////////////////////////////////////////
//Deepshikha Das
import java.util.Scanner;
import java.util.Arrays; 
public class PokerHands {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int hand[] = new int[5];
        System.out.println("Please enter a number that corresponds to a card vlaue: ");
        for(int i = 0; i<hand.length; i++){
            hand[i]= scan.nextInt(); 
        }
        int rank[] = new int[5];
        int suit[] = new int[5];
        for(int i=0; i<rank.length; i++){
            int rank[i] = (hand[i] % 13); 
        }
        for(int i=0; i<suit.length; i++){
            int suit[i] =(hand[i]/13); 
        }
        int freq[] = new int[13]; 
        for(int i=0; i<hand.length; i++){
            rank[]
        }
    }
     public static void showOneHand(int hand[]){
	String suit[]={"Clubs:	", "Diamonds: ", "Hearts:   ",              "Spades:   "};
	String face[]={
       "A ","K ","Q ","J ","10 ","9 ","8 ","7 ","6 ","5 ",
  	"4 ","3 ","2 "};
	String out="";
	for(int s=0;s<4;s++){
  	out+=suit[s];
  	for(int rank=0;rank<13;rank++)
    	for(int card=0;card<5;card++)
     	if(hand[card]/13==s && hand[card]%13==rank)
      	out+=face[rank];
  	out+='\n';
	}
	System.out.println(out);
  }
    
}