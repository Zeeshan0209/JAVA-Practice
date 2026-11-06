package Loops;
import java.util.*;
public class breakS {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter your number");
            int num = sc.nextInt();
             System.out.println(num);
            if(num%10==0){
                System.out.println("i am out your number is " + num);
                break;
            }
           
        } while(true);
        
    }
}
