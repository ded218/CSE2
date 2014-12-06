public class ragged {
    public static void main(String [] args){
        int [][] num = new int[5][];
        for (int i = 0; i <5; i++){
            num[i] = new int[5+(i*3)];
        }
        for (int row = 0; row < num.length; row++) {
            for(int column = 0; column < num[row].length; column++){
            num[row][column] = (int)(Math.random() * 40);    
            }
        }
        System.out.println("The array before sorting: ");
        for (int row = 0; row  < num.length; row++){
            for (int column = 0; column < num[row].length; column++){
                System.out.print(num[row][column]+" ");
            }
            System.out.println("");
        }
        for (int i = 0; i < num.length; i++){
            java.util.Arrays.sort(num[i]);
        }
        System.out.println("");
        System.out.println("The array after sorting: ");
        for (int row = 0; row  < num.length; row++){
            for (int column = 0; column < num[row].length; column++){
                System.out.print(num[row][column]+" ");
            }
            System.out.println("");
        }
    }
}