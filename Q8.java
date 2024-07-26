package assignment_1;


public class Q8 {
    public static void main(String[] args) {
        
//     Write a java program to exchange the values of two variables of integer type X and Y without 
// using third temporary variable.
    int x = 6 ;
    int y = 9 ;
    System.out.println("Before Swapping value of x is : " + x +"\n" + "value of y is : " + y);
        // via multiuplication and division ;    
        y = x * y ;
        x = y / x ;
        y = y / x ; 

        System.out.println("After swapping value of x is : " + x + "\n" + " value of y is : " + y );

        // via addition and subtraction ;
        y = x + y ;
        x = y - x ;
        y = y - x;

        System.out.println("After swapping value of x is : " + x + "\n" + " value of y is : " + y );
        

   }
}
