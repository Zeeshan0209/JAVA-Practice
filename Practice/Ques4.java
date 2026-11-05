// In a program, input 3 numbers : A, B and C. You have to output the average of
// these 3 numbers.

package Practice;
import java.util.*;
public class Ques4 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int Avg = (a + b + c) /3;
        System.out.println("The Average of the 3 numbers");
        System.out.println(Avg);

    }
    
}
