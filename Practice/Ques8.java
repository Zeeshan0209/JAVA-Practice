// make a program of calculator using switch statement.

package Practice;
import java.util.*;
public class Ques8 {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        switch(C){
            case 1 : System.out.println(A + B);
            break;
            case 2:System.out.println(A - B);
            break;
            case 3:System.out.println(A * B);
            break;
            case 4:System.out.println(A % B);
            break;
            default:System.out.println("try again");
        }
    }
}
