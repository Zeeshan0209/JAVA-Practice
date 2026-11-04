package Conditional;
import java.util.*;
import java.util.Scanner;

public class Largest {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        if (A>B){
            System.out.println(A + " is the largest number");
        }
        else{
          System.out.println(B + " is the largest number"); 
        }
    }
}
