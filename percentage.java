
import java.util.*;

public class percentage {
    public static void main(String[] args) {
        System.out.println("percentage calculator for student" );
        Scanner sc = new Scanner(System.in);
        extracted();
        int a = sc.nextInt();
        extracted();
        int b = sc.nextInt();
        extracted();
        int c = sc.nextInt();
        extracted();
        int d = sc.nextInt();
        extracted();
        int e = sc.nextInt();
        System.out.println("percentage is : ");
        float per = (a+b+c+d+e)*100/500;
        System.out.println(per);

    }

    private static void extracted() {
        System.out.println("enter 1st subject marks");
    }
}