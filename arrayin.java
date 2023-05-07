import java.util.Scanner;

public class arrayin {
    public static void main(String args[]){
        Scanner chayan = new Scanner(System.in);
        int size = chayan.nextInt();
        int marks[]=new int[size];
        
        for(int i= 0; i<size; i++){
            marks[i]= chayan.nextInt();
        }

        for(int i=0;i<size;i++){
            System.out.print("\nuour array is ::"+marks[i]);
        }
    }
}
