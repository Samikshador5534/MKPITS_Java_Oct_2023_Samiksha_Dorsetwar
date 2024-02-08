package com.mkpits.controlflowstatement;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class SnakeGame {

    public String word[] = {"Snake", "Water", "Gun"};

    int value;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        SnakeGame game = new SnakeGame();
        game.randomWords(); // This line was removed to prevent displaying the random word.

        System.out.println("Guess the word (Snake, Water, or Gun):");
        String userGuess = reader.readLine();

        game.logic(userGuess);
    }

    public void randomWords() {
        Random random = new Random();
        int value = random.nextInt(word.length);
        this.value = value;
    }

    public void logic(String userGuess) {
        String selectedWord = word[value];

        if (userGuess.equalsIgnoreCase(selectedWord)) {
            System.out.println("Congratulations! Your guess is correct.");
        } else {
            System.out.println("Sorry! Your guess is incorrect. The correct word was: " + selectedWord);
        }
    }
}

