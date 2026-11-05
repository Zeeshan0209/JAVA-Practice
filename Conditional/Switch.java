package Conditional;
import java.util.*;
public class Switch {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch(num){
            case 1:System.out.println("you print number 1");
            break;
            case 2: System.out.println("you print number 2");
            break;
            case 3 :System.out.println("you print number 3");
            break;
            default:System.out.println("you print number more than 3");
        }
    }
}
