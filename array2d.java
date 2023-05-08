import java.util.*;

public class array2d {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int colm = sc.nextInt();
        int matrix[][] = new int [rows][colm];

        for (int i=0; i<rows; i++)
        {
            for (int j=0; j<colm; j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        for (int i=0; i<rows; i++)
        {
            for (int j=0; j<colm; j++){
               System.out.print(matrix[i][j]);
            }

            System.out.println();
        }

       
    }
    
}
