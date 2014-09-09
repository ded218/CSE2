///////////////////////////////////////////////
//Deepshikha Das
//9.5.2014
//CSE 2 sect. 111
//I'm making a program to calculate the total costs plus tax while shopping .
//
public class Arithmetic {
    // this is the main method
    public static void main(String[] args) {
    int nSocks=3; //Number of pairs of socks
    double sockCost$=2.58; // cost per pair of socks
    int nGlasses=6; // Number of drinking glasses
    double glassCost$=2.29; //cost of each glass
    int nEnvelopes=1; // number of boxes of envelopes
    double envelopeCost$=3.25; //cost for each box of envelopes
    double taxPercent=0.06; //the percent for tax
    double totalSocks$=7.74; // total cost of all the socks together
    double totalGlasses$=13.74; // total cost of all the glasses together 
    double totalEnvelope$=3.25; // total cost of all the envelopes together
    double totalwotax$=24.73; // total cost of everything without the tax
    double totaltax$=1.48; // total tax paid
    System.out.println("I went on a trip to Walmart."); //I went on a trip to walmart
    System.out.println("I bought "+(nSocks)+" pairs of socks."); // the amount of socks I am buying.
    System.out.println("I bought "+(nGlasses)+" glasses."); // the amount of glasses i am buying.
    System.out.println("I bought "+(nEnvelopes)+" box of envelopes."); // the boxes of envelopes I am buying.
    System.out.println("Each pair of socks cost $"+(sockCost$)+ "."); // the cost of each pair of socks.
    System.out.println("Each glass cost $"+(glassCost$)+"."); // cost of each glass.
    System.out.println("Each box of envelopes $"+(envelopeCost$)+"."); // cost of each box of envelopes.
    System.out.println("The socks all cost $"+(nSocks*sockCost$)+"."); //the cost of the socks
    System.out.println("The glasses all cost $"+(nGlasses*glassCost$)+"."); // the cost of the glasses
    System.out.println("The envelopes all cost $"+(nEnvelopes*envelopeCost$)+"."); // the cost of the envelopes
    System.out.println("All the items cost $"+(totalSocks$+totalGlasses$+totalEnvelope$)+
        ", without tax."); // total cost of all the items
    System.out.println("The tax for just the socks is $"+(Math.round(100*totalSocks$*taxPercent))/100.00+"."); //This is just the tax for the socks.
    System.out.println("The tax for just the glasses is $"+(Math.round(100*totalGlasses$*taxPercent))/100.00+"."); //This is just the tax for the glasses
    System.out.println("The tax for just the envelopes is $"+(Math.round(100*totalEnvelope$*taxPercent))/100.00+"."); //This is just the tax for the envelopes.
    System.out.println("The tax for all the items is $"+(Math.round(100*totalwotax$*taxPercent))/100.00+"."); // tax for all the items
    System.out.println("The total for all items with tax is $"+(totalwotax$+totaltax$)+"."); // this is the total cost for all the items and the taxes. 
    } //end of main method
} //end of class
