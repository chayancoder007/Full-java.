import java.util.Scanner;

public class multiply {
    public static void main(String[] args) {
        System.out.println("multiply funciton");
        try (Scanner chayan = new Scanner(System.in)) {
            System.out.print("enter first no.");

            int a = chayan.nextInt();

            System.out.print("enter second no.");

            int b = chayan.nextInt();

            int multi=a*b;

            System.out.print("your answer is ");

            System.out.println(multi);

        }

    }
}
