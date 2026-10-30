// Write a Java program that asks the user for two numbers, then prints their sum, difference, product, and quotient.

package Practice;
import java.util.*;
public class Ques1 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        int diff = a - b;
        int pro = a*b;
        double quo = (double)a/b;
        System.out.println(sum);
        System.out.println(diff);
        System.out.println(pro);
        System.out.println(quo);
    }
}
