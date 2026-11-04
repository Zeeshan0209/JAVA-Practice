package Operators;

public class Logical {
    public static void main(String[]args){
        System.out.println( (5>3) && (7>0));  // it returns true because both conditions are true.
        System.out.println( (5>6) && (4>2)); //it returns false because condition 1 is false and the condition 2 is true. 
        System.out.println( (4>0) || (7<0)); //it return true . because OR Logical needs one condition to be true.
    }
}
