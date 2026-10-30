// Write a Java program that asks the user for the length and width of a rectangle, then prints both values and its perimeter.


package Practice;
import java.util.*;
public class Ques3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the length");
        int len = sc.nextInt();
        System.out.println("Enter the width ");
        int wid = sc.nextInt();
        System.out.println("The length of Rectangle is " + len);
        System.out.println("The width of Rectangle is " + wid);
        int perimeter = 2*(len+wid);
        System.out.println(perimeter +" is perimeter of the rectangle");
    }
    
}
