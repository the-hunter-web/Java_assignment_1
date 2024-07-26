package assignment_1;

public class Q7 {
    public static void main(String[] args) {
    //     Write a java program to exchange the values of two variables of integer type X and Y using 
    // third temporary variable Z
        int x = 6 ; 
        int y = 9 ;
        System.out.println("Before swapping the value of x is : " + x + "\n" + "value of y is : " + y);
        int z = x ;
        x = y;
        y = z;
        System.out.println("After swapping the value of x is : " + x + "\n" + "value of y is : " + y);
     }
    
}
