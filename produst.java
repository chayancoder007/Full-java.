import java.util.*;

public class produst {
    public static int produst(int a , int b) {
        return a * b ;
        
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("product iof two number"+ produst(a,b));
        
    }
    
}
