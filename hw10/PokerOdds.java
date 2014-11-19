////////////////////////////////////////////////////////////////
//Deepshikha Das
//11.14.14
//CSE 2 Sect 111
//I'm writing a program generates poker hands/counts the frequency of 
import java.util.Random; //importing random
import java.util.Scanner; // importing scanner 
public class PokerOdds{ // class
  public static void main(String [] arg){ //method
    showHands(); // calling method showHands
    simulateOdds(); // calling method simulateOdds
  } // end of main method 
  
  public static void showHands(){ 
    Scanner scan=new Scanner(System.in); // declaring and calling the scanner
    String answer=""; // string to store users answer for if they want to continue
    do{
      int[] deck = new int[52]; // dclaring/creating/assigning referecent for the array for deck of cards
      for(int r = 0; r<deck.length; r++){ // initializing the array with a loop
                deck[r] = r; // accepting user input
      }//end of of loop
      int[] hand = new int[5]; // declaring/creating/assigning referecent for the array for a hand of cards
      for(int i = 0; i<hand.length; i++){ // initializing the array with a loop
                hand[i] = -1; 
      }//end of loop that creates hand array
      for(int f = 0; f<hand.length; f++){ // shuffing the deck 
        int index = (int)(Math.random() * (deck.length-f)); // generating random numbers
        hand[f] = deck[index]; // making value in hand [f] = value of deck at the random number
        deck[index] = deck[deck.length-f-1]; // shuffling numbers
        deck[deck.length-f-1] = -1; // setting end of the deck to -1 
        
      } // end of f for loop
      String Rank[]={"A", "K","Q", "J","10","9", "8", "7", "6", "5", "4", "3", "2"}; // string of ranks
      String clubs[]={"","","","",""}; // empty strings which will be filled with values later on
      String diamonds[]={"","","","",""}; // empty strings which will be filled with values later on
      String hearts[]={"","","","",""}; // empty strings which will be filled with values later on
      String spades[]={"","","","",""}; // empty strings which will be filled with values later on
      int nClubs = 0; // counters to move along the clubs...spades arrays
      int nDiamonds = 0; // counters to move along the clubs...spades arrays 
      int nHearts = 0; // counters to move along the clubs...spades arrays
      int nSpades = 0; // counters to move along the clubs...spades arrays
      for(int f = 0; f<hand.length; f++){ // for loop that runs through the entire hand 
      int suit = hand[f]/13; // converting hand number to a suit number 
      int rank = hand[f]%13; // converting hand number to a rank number 
      if(suit == 0){ // for when suit is 0
        for(int v = 0; v<13; v++){ // for loop runs through all 13 ranks 
          if(rank == v){ // checking if the rank of the card is equal to one of the 13 ranks 
            clubs[nClubs] = Rank[v]; // sentting the string that will display 
            nClubs++;  // adding to the counter so that the next time it hits this it'll go to the next value in the string array 
          }
        }
      } // end of clubs if statement
     
     if(suit == 1){ // for when suit is 1
        for(int v = 0; v<13; v++){ // for loop runs through all 13 ranks
          if(rank == v){ // checking if the rank of the card is equal to one of the 13 ranks
            diamonds[nDiamonds] = Rank[v]; // sentting the string that will display
            nDiamonds++;  // adding to the counter so that the next time it hits this it'll go to the next value in the string array
          }
        }
      } // end of diamonds if statement
      
     if(suit == 2){ // for when suit is 2
        for(int v = 0; v<13; v++){ // for loop runs through all 13 ranks
          if(rank == v){ // checking if the rank of the card is equal to one of the 13 ranks
            hearts[nHearts] = Rank[v]; // sentting the string that will display
            nHearts++;  // adding to the counter so that the next time it hits this it'll go to the next value in the string array
          }
        }
      } // end of hearts if statement
      
      if(suit == 3){ // for when suit is 3
        for(int v = 0; v<13; v++){ // for loop runs through all 13 ranks
          if(rank == v){ // checking if the rank of the card is equal to one of the 13 ranks
            spades[nSpades] = Rank[v]; // sentting the string that will display
            nSpades++;  // adding to the counter so that the next time it hits this it'll go to the next value in the string array
          }
        }
      } // end of spades if statement
    } // end of for loop
      System.out.print("Clubs: "); 
      for(int j = 0; j<clubs.length; j++){
        System.out.print(clubs[j]+" "); // printing out each part of the string array 
      }
      System.out.println(""); // enter
      System.out.print("Diamonds: ");
      for(int j = 0; j<diamonds.length; j++){
        System.out.print(diamonds[j]+" "); // printing out each part of the string array 
      }
      System.out.println(""); // enter
      System.out.print("Hearts: ");
      for(int j = 0; j<hearts.length; j++){
        System.out.print(hearts[j]+" "); // printing out each part of the string array 
      }
      System.out.println(""); // enter
      System.out.print("Spades: ");
      for(int j = 0; j<spades.length; j++){
          System.out.print(spades[j]+" "); // printing out each part of the string array 
      }
      System.out.println(""); // enter
      System.out.println("Go again? Enter 'y' or 'Y', anything else to quit: "); // promting user
      answer = scan.next(); // accepting user input 
      }while(answer.equals("Y") || answer.equals("y")); // end of do while loop that runs only after user enter y or Y
    } // end of method 
  
    public static void simulateOdds(){ 
      String Rank[]={"A", "K","Q", "J","10","9", "8", "7", "6", "5", "4", "3", "2"}; // string of ranks
      int[] doubles = new int[13]; // creating array to store the number of times there are doubles in each of the 13 ranks
      for(int x = 0; x<doubles.length; x++){  // initializing array 
                  doubles[x] = 0; // setting array values to zero 
      }
      int noMatch = 0; // counter for when it doesn't match 
  
     for(int w=0; w<10000; w++){ // runs the whole thing a 10,000 times    
        int[] deck = new int[52]; // declaring/ creating/ recnecing length of array 
        int[] hand = new int[5]; // declaring/creating refeerenceing length of array 
        for(int r = 0; r<deck.length; r++){ // initializing the array 
                  deck[r] = r;  // setting the array values 
        }//end of of loop that creates
        
        for(int i = 0; i<hand.length; i++){  // initializing the array 
                  hand[i] = -1;  //setting array to -1 
        }//end of loop that creates hand array
        
        for(int f = 0; f<hand.length; f++){ // shuffling the deck 
          int index = (int)(Math.random() * (deck.length-f)); //generating random numbers 
          hand[f] = deck[index]; // making value in hand [f] = value of deck at the random number
          deck[index] = deck[(deck.length-f)-1]; // shuffling numbers 
          deck[(deck.length-f)-1] = -1; // setting end of deck to -1
          
        }
        for(int i = 0; i<hand.length; i++){ // runs through hand array
          int rank = hand[i]%13;  // mod-ing each value of hand to get rank
          hand[i] = rank; // reassigning hand with the rank values 
        }
        int count = 0; // varible to transfer value to 
        if(exactlyOneDup(hand)){ // calling method and checking if true or false
          int[] ordered = new int[hand.length]; // declaring array 
          for (int i = 0; i < hand.length; i++){ // running through the length of hand array
            ordered[i] = hand[i]; // copying the values of hand to ordered
          }
          java.util.Arrays.sort(ordered); // sorting the array ordered 
          for(int j = 0; j<ordered.length-1; j++){ // running though the array 
            if(ordered[j]==ordered[j+1]){ // checking if they match 
              count = hand[j]; // assigning hand[j to count ]
              doubles[count] = doubles[count] + 1;  //incrementing doubles at count 
            }
          }
        }
        else{
          noMatch++; // incrementing no matches 
        }
    }
  
    System.out.printf("%-5s%-5s%n", "Rank", "Freq of exactly one pair"); // printing out rank and freq of one pair in two columns 
    for(int f = 0; f<doubles.length; f++){ // runninng through the doubles arrap 
      System.out.printf("%-5s%-5s%n", Rank[f], doubles[f]); // printing out the rank and corresponding number of doubles 
    }
    System.out.println("No Matches: "+noMatch); // printing out when it doesn't match 
    } // end of method simulateOdds
    
    public static Boolean exactlyOneDup (int num[]){ //exactlyOneDup method from first part 
      int[] ordered = new int[num.length];
      for (int i = 0; i < num.length; i++){
        ordered[i] = num [i];
      }
      java.util.Arrays.sort(ordered);
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
