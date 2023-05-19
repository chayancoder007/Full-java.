import java.util.*;
public class selectionshort {
    public static void printArray(int arry[]){
        System.out.println("Your shorted array is::");
        for(int i=0 ; i<arry.length ; i++){
            System.out.print(arry[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size::");
        int size = sc.nextInt();
        int arry[]= new int[size];

        System.out.println("enter array elements::");
        for(int i=0 ; i<size ; i++){
            arry[i] = sc.nextInt();
        }

        for(int i=0; i<arry.length ; i++){
            int smallest =i;
            for(int j=i+1 ; j<arry.length ; j++){
                if(arry[smallest]>arry[j]){
                    smallest = j;
                }
            }
            int temp = arry[smallest];
            arry[smallest] = arry[i];
            arry[i]=temp;
        }
        printArray(arry);
    }
    
}
