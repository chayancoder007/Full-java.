import java.util.Scanner;

public class userinput2 {
    public static void main(String[] args) {
        System.out.println("substraction of two numbers");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter bigger no. : ");
        int a = sc.nextInt();
        System.out.println("enter smallerr no. : ");
        int b = sc.nextInt();
        System.out.println("your answer is : ");
        int sum= a-b;
        System.out.println(sum);
    }
}