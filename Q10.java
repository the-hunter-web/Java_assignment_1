package assignment_1;

public class Q10 {
    public static void main(String[] args) {
        // Assume a string variable ruler1 contains “1” initially i.e. String ruler1=”1” Write a java 
        // program to print the following output using string concatenation. (You can take extra string 
        // variables)
        // 1
        // 1 2 1
        // 1 2 1 3 1 2 1
        // 1 2 1 3 1 2 1 4 1 2 1 3 1 2 1

//        String ruler1 = " 1 " ;
//        System.out.println(ruler1);
//        String ruler2 = ruler1 + " 2 " + ruler1;
//        System.out.println(ruler2);
//        String ruler3 = ruler2 + " 3 " + ruler2;
//        System.out.println(ruler3);
//        String ruler4 = ruler3 + " 4 " + ruler3;
//        System.out.println(ruler4);

        String ruler1 = " 1 " ;
        System.out.println(ruler1);
        ruler1 = ruler1 + " 2 " + ruler1;
        System.out.println(ruler1);
        ruler1 = ruler1 + " 3 " + ruler1;
        System.out.println(ruler1);
        ruler1 = ruler1 + " 4 " + ruler1;
        System.out.println(ruler1);
    }
}
