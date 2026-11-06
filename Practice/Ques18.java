package Practice;
import java.util.*;
public class Ques18 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        do{ 
            if((n%2!=0) && (n%n==0)){
                System.out.println(n + " is prime number ");
                break;
            }
            System.out.println(n + " is not prime number");
            break;
        }while(true);
    }
}
