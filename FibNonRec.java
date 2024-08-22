import java.util.Scanner;

public class FibNonRec {

    public static long fib(long n) {
        long a = 0;
        long b = 1;
        boolean flip = true;
        for (long i = 0; i<n; i++) {
            flip = !flip;
            if (flip) {
                a = a + b;
            }
            else {
                b = a + b;
            }
        }
        if (flip) {return a;} return b;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long n = input.nextInt();

        System.out.print(fib(n));
    }
}