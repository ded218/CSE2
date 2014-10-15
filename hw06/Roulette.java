////////////////////////////////////////////////////////////
//Deepshikha Das
//10.13.14
//CSE 2 SECT 111
//I'm writing a monte carlo simulation. 
//
//adding class
//
//
public class Roulette {
//adding the main method 
    public static void main(String[] args){
    
    int nFail = 0;//declaring int for number of times there is complete failure
    int nProfit = 0; //declaring int for the number of times profit is made
    int tWins = 0; //declaring int for the number of total wins
    
    int j=0;//declaring int to control loop
    while (j<1000){ // while loop for int j
    double nplayer = ((Math.random())*38); //defining random number in variable
    int nPlayer= (int) nplayer; //explicitly casting
    int wins = 0; //declaring int for number of wins within the 100 runs
    int nLoses = 0; //declaring int for the number of loses 
    
    int i = 0; //declaring int to control loop
    while(i < 100){ // while loop for int i
        double randomn = ((Math.random())*38); //defining random number in variable
        int randomN= (int) randomn; //explicitly casting
        if (nPlayer == randomN){ //if statement for when the player number matches
            wins++; //adding to number of times won
            tWins++; //adding to number of total wins
            i++; //adding to int that conrols the loop
        }//end of if statement 
        else{ //else statement for if the numbers don't match
            nLoses++; //adding the number of times lost
            i++; //adding to int that controls the loop
        }//end of else statement
    }//end of i loop
    
    int Winnings = wins*36; //calculating how much money is won
        if (Winnings > 100){ //if statement to determine if a profit is made
            nProfit++; //adding to the number of times profits are made
        }//end of profit if statement
        if (nLoses==100){ //if statement for if the player looses all the 100 runs
        nFail++; //adding to the number of times the player completely looses
        }//end of losing if statement
        j++;//adding to the int that controls the loop
    }//end of j loop
    
    int tWinnings = tWins*36; //calculating the total amount of money won
    System.out.println("You won "+tWins+" times."); //printing the number of times the player won
    System.out.println("You won $ "+tWinnings+"."); //printing the amount of money won
    System.out.println("You made a profit "+nProfit+" times."); //printing the number of times profit was  made
    System.out.println("You lost everything "+ nFail+" times."); //printing the number of times the player lost everything 
    }//end of main method
}//end of class