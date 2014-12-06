/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Deepshikha Das
//12.4.14
//CSE 2 Sect 111
// I'm writing a program that generate random slabs, and sorts them 
public class MatrixSorter{ // creating class 
  public static void main(String arg[]){ // main method
    int mat3d[][][]; // declaring 3d array 
    mat3d=buildMat3d(); // calling method & assigning it to the variable mat3d
    show(mat3d); // calling show method 
    System.out.println("The smallest entry in the 3D matrix is "+
  			findMin(mat3d)); // printing out smallest entry in 3d matrix 
    System.out.println("After sorting the 3rd matrix we get"); //
    sort(mat3d[2]);// calling sort for 3 slab of matrix
    show(mat3d); // showing matrix 
   } // end of main method 
   public static int[][][] buildMat3d(){ 
       int [][][] num = new int[3][][]; // declaring array with 3 slabs 
        for (int i = 0; i <num.length; i++){ // declaring the ragged rows
            num[i] = new int[3+2*i][]; 
            for(int j =0; j<num[i].length; j++){
                num[i][j]= new int[i+j+1]; //declaring the columns
            }
        }
        for(int slab = 0; slab<num.length; slab++){ // loop assigning random numbers to each member of array 
            for(int row = 0; row<num[slab].length; row++){ // loop assigning random numbers to each member of array 
                for(int column = 0; column<num[slab][row].length; column++){ // loop assigning random numbers to each member of array 
                    num[slab][row][column] = (int)(Math.random() * (100 - 1) + 1);
                }
            }
        }
        return num; // returning num back to main method  
   }
   public static void show(int[][][] num){ // void method show prints array
       for(int slab = 0; slab<num.length; slab++){ //for each slab
            System.out.println("------------------------Slab "+ (slab + 1)); // lines between slabs
            for(int row = 0; row<num[slab].length; row++){ //for each row
                for(int column = 0; column<num[slab][row].length; column++){ // for each column
                    System.out.print(num[slab][row][column]+" "); // prints each member
                } // end of column
                System.out.println(""); // enter 
            }// end of row
        } // end of slab
   } // end of num method
   public static int findMin(int[][][] num){ // method for finding minimum
       int min = num[0][0][0]; // int min that has first value of the array 
       for(int slab = 0; slab<num.length; slab++){ // going through slabs
            for(int row = 0; row<num[slab].length; row++){ // going through rows
                for(int column = 0; column<num[slab][row].length; column++){ // going through columns 
                    if(num[slab][row][column] < min){ // for when the next value is lower than the previous 
                        min = num[slab][row][column]; // reassigning the minimum value
                    } // end of colum for loop 
                } // end of row for loop
            } // end of slab for loop
        }
        return min; // returns minimum value
   }
   public static void sort(int[][] num){ //void method for sorts 
       for (int row = 0; row <num.length; row++){ // sorts each row w/ insertion sort
           sort(num[row]); // calling insertion sort method for each row
       }
       for(int row = 1; row < num.length; row++){ // gow through each row 
           int[] currentElement = num[row]; // each column element 
           int k; // counter 
           for(k = row -1; k>= 0 && num[k][0]>currentElement[0]; k--){ // runs through each of the first column elements 
               num[k+1] = num[k]; // switching elements 
           } // end of k for loop 
           num[k+1] = currentElement; // making the swapped element equal to the other swapped elements value 
       } // end of row for loop 
    } // end of sort method 
    public static void sort(int[] num){ // overloaded insertion sort method for rows 
        for(int column = 0; column<num.length-1; column++){ //gos through each column 
               int currentMin = num [column]; // first element
               int currentMinIndex = column; // min index to keep track of where in the array it is 
               for(int j = column + 1; j <num.length; j++){ // loops through each column element 
                   if (currentMin > num [j]){ // when the first number is greater than the one after it 
                       currentMin = num [j]; // swapping places 
                       currentMinIndex = j; //swapping places 
                   } // end of if statment 
               } // j loop 
               if(currentMinIndex != column){ // if for reassigning current min index value 
                   num [currentMinIndex] = num [column];  // swapping with column 
                   num [column] = currentMin;  // swapping with column 
               } // end of if statment 
           }
    } // end of sort method
    
}
