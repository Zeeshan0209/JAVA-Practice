// Write a Java program to get a number from the user and print whether it is
// positive or negative.

package Practice;
import java.util.Scanner;

public class Ques9 {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        int A = sc.nextInt();
        if(A>0){
            System.out.println("the Number is Positive");
        }
        else if(A<0){
            System.out.println("The number is Negative");
        }
        else{
            System.out.println("the Number is not Positive nor Negative");
        }
}
}
