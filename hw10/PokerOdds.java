////////////////////////////////////////////////////////////////
//Deepshikha Das
//11.14.14
//CSE 2 Sect 111
//I'm writing a program generates poker hands/counts the frequency of 
import java.util.Random;
import java.util.Scanner;
public class PokerOdds{
  public static void main(String [] arg){
    showHands();
    simulateOdds();
  } // end of main method 
  
  public static void showHands(){
    Scanner scan=new Scanner(System.in);
    String answer="";
    do{
      int[] deck = new int[52];
      for(int r = 0; r<deck.length; r++){ 
                deck[r] = r; // accepting user input
      }//end of of loop that creates  
      int[] hand = new int[5];
      for(int i = 0; i<hand.length; i++){ 
                hand[i] = -1; 
      }//end of loop that creates hand array
      for(int f = 0; f<hand.length; f++){
        int index = (int)(Math.random() * (deck.length-f));
        hand[f] = deck[index];
        deck[index] = deck[deck.length-f-1];
        deck[deck.length-f-1] = -1;
        
      } // end of f for loop
      String clubs[]={"","","","",""};
      String diamonds[]={"","","","",""};
      String hearts[]={"","","","",""};
      String spades[]={"","","","",""};
      int nClubs = 0;
      int nDiamonds = 0; 
      int nHearts = 0; 
      int nSpades = 0; 
      for(int f = 0; f<hand.length; f++){
      int suit = hand[f]/13;
      int rank = hand[f]%13; 
      if(suit == 0){
        switch(rank){
          case 0: clubs[nClubs] = "A"; nClubs++; break;
          case 1: clubs[nClubs] = "K"; nClubs++; break;
          case 2: clubs[nClubs] = "Q"; nClubs++; break;
          case 3: clubs[nClubs] = "J"; nClubs++; break;
          case 4: clubs[nClubs] = "10"; nClubs++; break;
          case 5: clubs[nClubs] = "9"; nClubs++; break;
          case 6: clubs[nClubs] = "8"; nClubs++; break;
          case 7: clubs[nClubs] = "7"; nClubs++; break;
          case 8: clubs[nClubs] = "6"; nClubs++; break;
          case 9: clubs[nClubs] = "5"; nClubs++; break;
          case 10: clubs[nClubs] = "4"; nClubs++; break;
          case 11: clubs[nClubs] = "3"; nClubs++; break;
          case 12: clubs[nClubs] = "2"; nClubs++; break;
          
        } // end of switch statement
      } // end of clubs if statement
     
      if(suit == 1){
        switch(rank){
          case 0: diamonds[nDiamonds] = "A"; nDiamonds++; break;
          case 1: diamonds[nDiamonds] = "K"; nDiamonds++; break;
          case 2: diamonds[nDiamonds] = "Q"; nDiamonds++; break;
          case 3: diamonds[nDiamonds] = "J"; nDiamonds++; break;
          case 4: diamonds[nDiamonds] = "10"; nDiamonds++; break;
          case 5: diamonds[nDiamonds] = "9"; nDiamonds++; break;
          case 6: diamonds[nDiamonds] = "8"; nDiamonds++; break;
          case 7: diamonds[nDiamonds] = "7"; nDiamonds++; break;
          case 8: diamonds[nDiamonds] = "6"; nDiamonds++; break;
          case 9: diamonds[nDiamonds] = "5"; nDiamonds++; break;
          case 10: diamonds[nDiamonds] = "4"; nDiamonds++; break;
          case 11: diamonds[nDiamonds] = "3"; nDiamonds++; break;
          case 12: diamonds[nDiamonds] = "2"; nDiamonds++; break;
          
        } // end of switch statement
        
      } // end of diamonds if statement
      if(suit == 2){
        switch(rank){
          case 0: hearts[nHearts] = "A"; nHearts++; break;
          case 1: hearts[nHearts] = "K"; nHearts++; break;
          case 2: hearts[nHearts] = "Q"; nHearts++; break;
          case 3: hearts[nHearts] = "J"; nHearts++; break;
          case 4: hearts[nHearts] = "10"; nHearts++; break;
          case 5: hearts[nHearts] = "9"; nHearts++; break;
          case 6: hearts[nHearts] = "8"; nHearts++; break;
          case 7: hearts[nHearts] = "7"; nHearts++; break;
          case 8: hearts[nHearts] = "6"; nHearts++; break;
          case 9: hearts[nHearts] = "5"; nHearts++; break;
          case 10: hearts[nHearts] = "4"; nHearts++; break;
          case 11: hearts[nHearts] = "3"; nHearts++; break;
          case 12: hearts[nHearts] = "2"; nHearts++; break;
          
        } // end of switch statement
        
      } // end of hearts if statement
      if(suit == 3){
        switch(rank){
          case 0: spades[nSpades] = "A"; nSpades++; break;
          case 1: spades[nSpades] = "K"; nSpades++; break;
          case 2: spades[nSpades] = "Q"; nSpades++; break;
          case 3: spades[nSpades] = "J"; nSpades++; break;
          case 4: spades[nSpades] = "10"; nSpades++; break;
          case 5: spades[nSpades] = "9"; nSpades++; break;
          case 6: spades[nSpades] = "8"; nSpades++; break;
          case 7: spades[nSpades] = "7"; nSpades++; break;
          case 8: spades[nSpades] = "6"; nSpades++; break;
          case 9: spades[nSpades] = "5"; nSpades++; break;
          case 10: spades[nSpades] = "4"; nSpades++; break;
          case 11: spades[nSpades] = "3"; nSpades++; break;
          case 12: spades[nSpades] = "2"; nSpades++; break;
          
        } // end of switch statement
      } // end of spades if statement
      } // end of for loop
      System.out.print("Clubs: ");
      for(int j = 0; j<clubs.length; j++){
        System.out.print(clubs[j]+" ");
      }
      System.out.println("");
      System.out.print("Diamonds: ");
      for(int j = 0; j<diamonds.length; j++){
        System.out.print(diamonds[j]+" ");
      }
      System.out.println("");
      System.out.print("Hearts: ");
      for(int j = 0; j<hearts.length; j++){
        System.out.print(hearts[j]+" ");
      }
      System.out.println("");
      System.out.print("Spades: ");
      for(int j = 0; j<spades.length; j++){
          System.out.print(spades[j]+" ");
      }
      System.out.println("");
      System.out.println("Go again? Enter 'y' or 'Y', anything else to quit: ");
      answer = scan.next();
      }while(answer.equals("Y") || answer.equals("y"));
    } // end of method
  
    public static void simulateOdds(){
      String Rank[]={"A", "K","Q", "J","10","9", "8", "7", "6", "5", "4", "3", "2"};
      int[] doubles = new int[13];
      for(int x = 0; x<doubles.length; x++){ 
                  doubles[x] = 0;
      }
      int noMatch =0; 
  
     for(int w=0; w<100; w++){   
        int[] deck = new int[52];
        int[] hand = new int[5];
        for(int r = 0; r<deck.length; r++){ 
                  deck[r] = r; 
        }//end of of loop that creates
        
        for(int i = 0; i<hand.length; i++){ 
                  hand[i] = -1; 
        }//end of loop that creates hand array
        
        for(int f = 0; f<hand.length; f++){
          int index = (int)(Math.random() * (deck.length-f));
          hand[f] = deck[index];
          deck[index] = deck[(deck.length-f)-1];
          deck[(deck.length-f)-1] = -1;
          
        }
        for(int i = 0; i<hand.length; i++){
        int rank = hand[i]%13; 
        hand[i] = rank;
        }
        int count = 0; 
        int f;
        int q;
        if(exactlyOneDup(hand)){
          for(f = 0; f<hand.length; f++){
            for(q = 1 + f; q<hand.length; q++){
              if(hand[f] == hand[q]){
                count = hand[f];
                doubles[count] = doubles[count] + 1; 
                
              }
            }
          }
        }
        else{
          noMatch++;
        }
    }
  
    System.out.printf("%-5s%-5s%n", "Rank", "Freq of exactly one pair");
    for(int f = 0; f<doubles.length; f++){
      System.out.printf("%-5s%-5s%n", Rank[f], doubles[f]);
    }
    System.out.println("No Matches: "+noMatch);
    } // end of method simulateOdds
    
    public static Boolean exactlyOneDup (int num[]){
     int[] ordered = new int[num.length];
      for (int i = 0; i < num.length; i++){
        ordered[i] = num [i];
      }
      int w  = 0;  
      for(int j = 0; j<ordered.length-1; j++){
          if(ordered[j]==ordered[j+1]){
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
