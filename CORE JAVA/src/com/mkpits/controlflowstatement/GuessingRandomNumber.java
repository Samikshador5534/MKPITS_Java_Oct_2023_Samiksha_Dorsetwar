package com.mkpits.controlflowstatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GuessingRandomNumber {

    int no, value;

    public static void main(String[] args) throws NumberFormatException, IOException {
        GuessingRandomNumber GRN = new GuessingRandomNumber();
        GRN.randomNo();
        GRN.userInput();
    }

    public void randomNo() {
        int value = (int) Math.floor(Math.random() * 100) + 1; // Add 1 to make sure the random number is between 1 and 100
        this.value = value;
    }

    public void userInput() throws NumberFormatException, IOException {
        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter A Number in 10 Times");

        for (int i = 1; i <= 10; i++) { // Start the loop from 1 instead of 0

            int no = Integer.parseInt(BR.readLine());
            this.no = no;

            if (no < 1 || no > 100) {
                System.out.println("Number should be between 1 and 100. Try again.");
                i--; // Decrement i so that the current attempt is not counted
            } else if (no > value) {
                System.out.println("Number is Greater, Enter a Lesser No");
            } else if (no < value) {
                System.out.println("Number is Lesser, Enter a Greater No");
            } else if (no == value) {
                System.out.println("Number is matched with the Random Number");
                break;
            }

            if (i == 10) {
                System.out.println("Attempts are finished");
            }

        }
    }
}
