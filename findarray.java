import java.util.*;
public class findarray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int marks[] = new int[size];

        for (int i = 0; i < size ; i++){
            marks[i]=sc.nextInt();
        }
        int x = sc.nextInt();
        for (int i = 0; i<size;i++){
            if(marks[i]==x){
              System.out.println("your array element is found ::"+ i);
            }
        }
          
    }
    
}
