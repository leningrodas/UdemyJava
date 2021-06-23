package variables;

import java.util.HashMap;
import java.util.Scanner;

public class operands {
    public static void main(String[] args) {

        int highScorePosition = calculateHighScorePosition(1500);

        displayHighScorePosition("player1", highScorePosition);
        int secondScorePosition = calculateHighScorePosition(800);
        displayHighScorePosition("player2", secondScorePosition);
    }

    public static void displayHighScorePosition(String name, int score) {
        System.out.println(name + " you  managed to get into position " + score);

        calculateHighScorePosition(1400);
    }


    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore > 1000) {
            return 1;
        } else if (500 < playerScore && playerScore < 1000) {
       return 2;
        } else if (100 < playerScore && playerScore < 500) {
           return 3;
        } else {
            return 4;
        }
    }


//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        HashMap<Integer, Integer> colors = new HashMap<Integer, Integer>();
//
//        while(n-- > 0) {
//            int c = scan.nextInt();
//            Integer frequency = colors.get(c);
//
//            // If new color, add to map
//            if(frequency == null) {
//                colors.put(c, 1);
//            }
//            else { // Increment frequency of existing color
//                colors.put(c, frequency + 1);
//            }
//        }
//        scan.close();
//
//        // Count and print the number of pairs
//        int pairs = 0;
//        for(Integer frequency : colors.values()) {
//            pairs += frequency >> 1;
//        }
//        System.out.println(pairs);
}

