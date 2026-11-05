// Write a Java program that takes a year from the user and print whether that
// year is a leap year or not.


package Practice;

import java.util.Scanner;

public class Ques11 {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        int A = sc.nextInt();
        if((A%4==0) && (A%100!=0)){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("not A leap year");
        }
}
}
