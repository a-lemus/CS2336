import java.util.Scanner;

// this program takes a given integer and reverses it purely with mathematical operations (no strings)
public class ReverseInt {
    public static void main(String[] args) {
        // scan input from user
        Scanner sc = new Scanner(System.in); // for input
        System.out.print("Enter an integer: "); // prompt
        int n = sc.nextInt(); // get input
        int reverse = 0; // what we will use to derive the reverse
        
// WRITE YOUR CODE HERE

        while (n > 0) { 
            // the loop takes the first digit of n via n&10, then appends it to the beginning of reverse,
            // then truncates the digit from n so that we can get the next digit with n%10. If we wanted to 
            // rewrite it without modifying n, we could keep track of an incrementing integer 'i' and using n&10^i
            reverse*=10; // bring all the digits in reverse up so the first digit is clear
            reverse+=n%10; // add the first digit of n to reverse
            n/=10; // remove the digit from n, so that we can use the next digit
        }
        System.out.println(reverse); // print answer
    }
}