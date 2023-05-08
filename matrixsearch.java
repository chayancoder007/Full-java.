import java.util.*;
public class matrixsearch {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter matrix rows ::");
        int rows = sc.nextInt();
        System.out.println("enter matrix colm ::");
        int colm = sc.nextInt();
        int matrix[][] = new int [rows][colm];

        for (int i=0; i<rows ; i++){
            for (int j=0; j<colm; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("enter the x element to be searched for there index value");
        int x = sc.nextInt();

        for (int i=0; i<rows ; i++){
            for (int j=0; j<colm; j++){
                 if(matrix[i][j] == x ){
                    System.out.print("("+i+")"+"("+j+")");
                 }
            }
            System.out.println();
        }



    }
    
}
