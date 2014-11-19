//////////////////////////////////////////////////////
//Deepshikha Das
//10.31.13
//CSE 2 sect 111
//i'm writing a program that adds/joins digits
//
public class MethodCalls{
    public static void main(String []  arg){
        int a=784,b=22,c;
        c=addDigit(a,3);
        System.out.println("Add 3 to "+a+" to get "+c);
        c=addDigit(addDigit(c,4),5);
        System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);
        System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));
        c=join(a,b);
        System.out.println("Join "+a+" to "+b+" to get "+c);
        System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));
        System.out.println("Join -9 and -90 to get "+join(-9,-90));
    } //end of main method 
    public static int addDigit(int x, int y){
    int siny=1;
    int sinx=1;
        if(y<0){
            siny=-1; 
            y=-y; 
        }
        if(x<0){
            sinx=-1; 
            x=-x; 
        }
            String one =""+x;
            String two =""+y;
            String add = one +two;
            int back=Integer.parseInt(add);
            back=back*siny*sinx;
            return back; 
        
    }  //end of method addDigit
    public static int join(int x, int y){
        int input = addDigit(x,y);
        return input; 
    }





} //end of class  
