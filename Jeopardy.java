import java.util.Scanner;

public class Jeopardy {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    //let us array of 4, even though there are just 3 players
    //it enables us to use player number directly as index!
    int[] scores = {0,0,0,0}; 

    // WRITE YOUR CODE HERE
    int nextScore = 0;
    int playerNum = input.nextInt();
    if (playerNum!=0) {nextScore = input.nextInt();}

    while (playerNum!=0) {
        scores[playerNum] += nextScore;
        playerNum = input.nextInt();
        if (playerNum!=0) {nextScore = input.nextInt();}
    }
    System.out.println("Final scores:");
    System.out.println("Player 1: " + scores[1] + "\nPlayer 2: " + scores[2] + "Player 3: " + scores[3]);
    int winner = 0;
    for (int i = 1; i<4; i++) {
        if (scores[i]>scores[winner]) {winner = i;}
    }
    System.out.println("Player " + winner + " is the winner!");
  }
}