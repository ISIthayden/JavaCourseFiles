package com.company;
import java.io.*;

public class Main extends ScoreBoard {

    public static void main(String[] args) {

		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;
		int finalScore = 0;

		Class board1 = new Class(ScoreBoard);

        giveScore(board1);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

		giveScore(ScoreBoard);
    }

	private static void giveScore(Class ScoreBoard) {
		if (gameOver == true) {
			finalScore = score + (levelCompleted * bonus);
			System.out.println("Your final score was " + finalScore);
		}
	}
}
