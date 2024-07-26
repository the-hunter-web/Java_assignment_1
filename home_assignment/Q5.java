package assignment_1.home_assignment;

public class Q5 {
    public static void main (String [] args ){
        int w = 10;         // w to a
        int a = 20;         // a to k
        int k = 30;         // k to g
        int g = 40;         // g to w

        w = w+a;
        a = w-a;
        w = w-a;
        System.out.println("a = " + a );

        w = w+k;
        k = w-k;
        w = w-k;
        System.out.println("k = " + k );

        w = w+g;
        g = w-g;
        w = w-g;
        System.out.println("g = " + g );

        w = w+g;
        w = w-g;
        g = w-g;
        System.out.println("w = " + w );

    }
}
