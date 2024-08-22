import java.util.Scanner;

public class fibo {
    public static int fib(int n) {
        if (n==1) {return 1;}
        if (n==0) {return 0;}
        return n+fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        System.out.print(fib(n));
    }
}