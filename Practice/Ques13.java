package Practice;

import java.util.Scanner;

public class Ques13 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int total = 0;
        while(total< 100){
            int num = sc.nextInt();
            total =total + num;
        }
        System.out.println(total);
}
}
