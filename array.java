/*  here we re going to learn array in java 
 dfine array format 
 type [] arrayname = type [size ];
 type = array type int , float etc 
 array name  = koi bhi nam 
 new  = keyword to make space in memory 
 type = same as above 
 size = size of array\\

 //////         ------- example int[]marks=newint[3];--------   ///////////////

 */


 import java.util.*;

 public class array{

    public static void main(String args[]){

        // define array 

        int[] marks = new int [5];
        marks[0]= 88;
        marks[1]= 88;
        marks[2]= 88;
        marks[3]= 88;
        marks[4]= 88;
       /*System.out.println(marks[0]);
        System.out.println(marks[1]);      /* here it take more spae in memory to store and more time to execute */
     /*    System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]); */

        //// so we make loops here to avoid this 

        for(int i = 0; i<5 ; i++){

            System.out.println(marks[i]);
        }
    }

 }


 // another way to declare the elemnt in array but less amount of array 

 // int[]marks = {1,2,3,4,5,6,7,8,9,0};


 