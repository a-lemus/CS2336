import java.util.Scanner;

public class MaxDiff {
  public static int abs(int a) {if (a<0) {return a*-1;} return a;}
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // WRITE YOUR CODE HERE
    System.out.print("Enter number: ");
    int inp = input.nextInt();
    int inpList[] = new int[512]; 

    int i = 0;
    int maxDiff = 0;
    while (inp!=-1) {
        inpList[i++] = inp;
        if (i>1) {
            for (int x=0; x<i; x++) {
                if (abs(inp-inpList[x])>maxDiff) {
                    maxDiff = abs(inp-inpList[x]);
                }
            }
        }
        System.out.println("Max Difference so far: " + maxDiff);
        System.out.print("Enter number: ");
        inp = input.nextInt();
    }
    System.out.println("Maximum difference: " + maxDiff);
  }
}