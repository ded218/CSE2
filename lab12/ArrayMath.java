/////////////////////////////////////////////
//Deepshikha Das
//11.12.14 
//I'm writing a program that does arithmetic using arrays
//
public class ArrayMath{
  public static void main(String [] arg){
    double x[]={2.3, 3, 4, -2.1, 82, 23},
      y[]={2.3, 3, 4, -2.1, 82, 23},
      z[]={2.3, 13, 14},
      w[]={2.3, 13, 14, 12}, 
      v[],
      u[]={2.3, 12, 14};
      v=addArrays(x,y); 
    System.out.println(display(x)+" \n  + " + display(y) + "\n   = " +display(v));
    System.out.println(display(x)+" \n  + " + display(z) + "\n   = " 
                         +display(addArrays(x,z)));
    System.out.println("It is " + equals(x,y)+" that "+display(x)+
                       " == "+display(y));
    System.out.println("It is " + equals(z,w)+" that "+display(z)+
                       " == "+display(w));
    System.out.println("It is " + equals(u,z)+" that "+display(u)+
                       " == "+display(z));

  } // end of main method 
  
  public static String display(double [] x){
    String out="{";
    for(int j=0;j<x.length;j++){
      if(j>0){
        out+=", ";
      } // end of j>0 if statment 
      out+=x[j];
    } //end of for loop that goes through entire array 
    return out+"}";
  } // end of display method 
  
  public static Boolean equals(double [] x, double [] y){
    
    if(x.length == y.length){
      Boolean v = java.util.Arrays.equals(x, y);
      return v;
    }
    return false; 
  } // end of equal method 
  
  public static double[] addArrays(double [] x, double [] y){
  double[] f = new double[x.length];
  if(x.length>y.length){
      int j = 0; 
      while(j<y.length){
        f[j] = x[j] + y[j];
        j++; 
      }
      for(int m=0; m<x.length-y.length; m++){
        f[j] = x[j];
        j++;
      }

  }
  if(y.length == x.length){
    for(int j=0; j<x.length; j++){
      f[j] = x[j] + y[j];
    }
  }
  return f; 
  } // end of addArrays method 
} //end of class 
