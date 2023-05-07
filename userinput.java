

import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        System.out.println("give your choice as a input");
        Scanner sc= new Scanner(System.in);
        System.out.print("enter no. 1: ");
        int a = sc.nextInt();
        System.out.print("enter no. 2 : ");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.print("sum of number is: ");
        System.out.println(sum);
    }
}