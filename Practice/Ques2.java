// Write a Java program that asks the user for their name and favorite number, then prints both.

package Practice;
import java.util.*;
public class Ques2 {
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter your name");
String name = sc.nextLine();
System.out.println("What is your favourite colour");
String colour = sc.nextLine();
System.out.println("Your name is " + name);
System.out.println(colour + " is your fav colour");
}  
}
