// here we will callculate the factorial by the help of loops and function in java //
import java.util.*;

public class fac{      // Here we made a class 

    public static void printfac(int n) {     // after making a class we have ti make a function with condition 

       if (n<0){

        System.out.println("invalid number");
        return;   

       }

        int factorial = 1 ; 

        for(int i = n; i >=1 ; i--){      //  this is loop mean the condiion 

            factorial = factorial*i;

        }

        System.out.println("your factorial is ::" + factorial);
        return ;
    }

    public static void main(String args[]){         //  this is the call function we call the above function after giving the input 
                                                // to the computer

        Scanner  chayan = new Scanner(System.in);
        int n = chayan.nextInt();

        printfac(n);
    }
}
