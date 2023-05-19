import java.util.*;

public class bubbleshort{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array::");
        int size = sc.nextInt();
        int Array[]=new int[size];

        System.out.println("enter array elements::");

        for(int i=0; i<size; i++){
            Array[i]=sc.nextInt();
        }

        for(int a=0; a<Array.length ; a++){
            for(int j=0; j<Array.length-a-1; j++){
                if(Array[j]>Array[j+1]){
                    //swap array
                    int temp = Array[j];
                    Array[j]=Array[j+1];
                    Array[j+1]= temp;

                }

            }
        }
        System.out.println("your shorted aarray::");

             for(int a=0; a<Array.length ; a++){
                  System.out.print(Array[a]+" ");
        }  
      
    }
}