package com.company;

public class player {
    public static String computeGameState(String nameP1, String nameP2, String[] wins) {
        // Write your code here
        // To debug: System.err.println("Debug messages...")
        int p1 = 0;
        int p2 = 0;
        for (int i = 0; i < wins.length; i++) {
            if (wins[i].equals(nameP1)) p1++;
            if (wins[i].equals(nameP2)) p2++;
        }
        if (p1 > p2) return nameP1;
        if (p1 < p2) return nameP2;
        return "Draw";
    }
}
/*
 A tenish game is played as follows:
    fisrt score = 15 points
    second score = 30 points
    third score = 40 points

After a player reached the score of 40 points, he or she can
DEUCE state
ADVCANTED state if both palyers at least three times AND the player scored one more tahn his or her opponet
WIN the game if he or she has scored at lest four times AND two times more than the other player
*/
