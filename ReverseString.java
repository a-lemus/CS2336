import java.util.Scanner;

// this program takes a string in as input, then returns that string reversed using the default StringBuilder class
public class ReverseString {
    public static void main(String[] args) {
        // scan input from user
        Scanner sc = new Scanner(System.in); // for input
        System.out.print("Enter a string: "); // prompt
        String s = sc.nextLine(); // get input
        StringBuilder sb = new StringBuilder(s); // initialize StringBuilder with input value
// WRITE YOUR CODE HERE

        sb.reverse(); // built in function to reverse string
        
        System.out.println(sb.toString()); // return value of string after reversal
    }
}
