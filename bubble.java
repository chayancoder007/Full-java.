import java.util.*;
public class bubble {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter size of array");
        int size = sc.nextInt();
        int arry[]=new int[size];

        System.out.println("enter array elements ::");

        for(int i=0; i< arry.length ; i++){
            arry[i] = sc.nextInt();
        }

        // condition for shorting arry in decending order 

        for(int i=0 ; i<arry.length ; i++){
            for(int j=0; j<arry.length-i-1; j++){
                if(arry[j]<arry[j+1]){  //// just we have change < to > thats it.
                    //swap array
                    int temp = arry[j];
                    arry[j]=arry[j+1];
                    arry[j+1]=temp;
                }
            }
        }

        System.out.println("your shorted aray::");
        for(int i=0; i<arry.length; i++){
            System.out.print(arry[i]+" ");
        }
    }
    
}
