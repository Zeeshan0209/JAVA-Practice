package Practice;

import java.util.Scanner;

public class Ques15 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int tab = 1;
        while(tab<=10){
        System.out.println(num + "x" + tab + " = " + (num*tab)) ; 
            tab++;
        }
    }
}
