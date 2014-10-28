////////////////////////////////////////////////////
//Deepshikha Das
//10.24.14
//CSE2 sect 111
//I'm writing a driver program
//
import java.util.Scanner; //i am importing the scanner
public class HW8{ //adding class
    public static void main(String [] arg){ //adding main method
        char input; //declaring a char
        Scanner scan=new Scanner(System.in); //declaring and calling the scanner 
        System.out.print("Enter 'C' or 'c' to continue-"); //prompting the user
        input=getInput(scan,"Cc"); //calling the method getInput
        System.out.println("You entered '"+input+"'"); //telling the user what input they enter 
        System.out.print("Enter 'y','Y','n', or 'N'-"); //prompting the user
        input=getInput(scan,"yYnN",5);//calling the method getInput
        if(input!=' '){ //setting up an if statement for if the input=blank
            System.out.println("You entered'"+input+"'"); //telling the user what input they put in 
        }//end of if statement 
        input=getInput(scan,"Choose a digit.","0123456789"); //calling the method
        System.out.println("You entered'"+input+"'"); //telling user what input they put in 
    }//end of main method
    public static char getInput(Scanner x, String y){ //adding method getInput #1 
        String input1=x.next(); //accepting user input
        while(true){ //while loop to keep running it back around to check for the character number
            while(input1.length()!=1){ //while loop that forces user to enter 1 int
                System.out.print("You should enter exactly one character- "); //telling user they need to enter 1 character
                input1=x.next(); //accepting user input
            }//end of while loop for if user enter more than 1 input
            int i=0; //declaring int which will act as a sentinel 
            char test; //declaring char 
            while(i<y.length()){ //while loop that runs the number of times the length of the string is
                test=y.charAt(i); //making test equal to char method, to check each letter of string y
                if(test == input1.charAt(0)){//when the chars finally are equivalent
                    return input1.charAt(0); //returns the value
                }//end of if statement 
                i++; //counter to run the loop the length of the string
            }//end of while loop
            System.out.print("You should enter the right characters. try again- "); //informing user that they did not enter the right input
            input1=x.next(); //accepting user input
        }//end of while loop
    }//end of input method 1
    public static char getInput(Scanner x, String y, int z){ //adding method getInput #2
        String input2=x.next(); //accpeting user input
        int c=0; //declaring sentinel c 
        while(c<z){ //while statement that only runs for 5 tries 
                while(input2.length()!=1){//while loop that forces user to enter 1 int
                    System.out.print("You should enter exactly one character- "); //telling user they need to enter 1 character
                    input2=x.next(); //accepting user input
                    c++; //counter that limits the number of tries
                } //end of while loop that forces user to enter 1 int 
                int i=0; //declaring in that will act as a sentinel 
                char test; //declaring char 
                while(i<y.length()){ //while loop that runs the number of times the length of the string is
                    test=y.charAt(i); //making test equal to char method, to test each letter of string y 
                    if(test == input2.charAt(0)){//when the chars are finally equivalent
                        return input2.charAt(0); //returns the value
                    }//end of if statment 
                    i++; //counter to run the loop the length of the string 
                }//end of while loop
                System.out.print("You should enter the right characters. Try again- "); //telling user they need to enter the right character 
                input2=x.next(); //accepting user input 
                c++; //counter to limit the number of tries 
        }
        System.out.println("You failed after 5 tries"); //when the user fails after 5 tries 
        return ' '; //terminating the program 
    }//end of input method 2
    public static char getInput(Scanner x, String instruction, String posN){//adding method getInput #3
        System.out.println(instruction); //printing the instructions
        System.out.print("Enter one character in the following list "+posN+"- ");//prompting user to enter one of the list
        String input3=x.next(); //accepting user input
        while(true){ //while loop to keep running it back around to check for the character number
            while(input3.length()!=1){ //while loop that forces user to enter 1 int 
                System.out.print("You should enter exactly one character- "); //telling user they need to enter 1 character 
                input3=x.next(); //accepting user input
            } //end of while loop
            int i=0; //declaring int that will act as a sentinel 
            char test; //declaring char
            while(i<posN.length()){ //while loop that runs the number of times the length of the string is 
                test=posN.charAt(i); //making test equal to char method, to test each letter of string posN
                if(test == input3.charAt(0)){//when the chars are finally equivalent 
                    return input3.charAt(0); //returns the value 
                } //end of if statement 
                i++; //counter to run the loop the length of the string 
            } //end of while loop
            System.out.print("You should enter the right characters. try again- "); //telling user they need to enter the right characters 
            input3=x.next(); //accepting user input 
        }///end of infinite while loop
    }//end of input method 3
    
}//end of class