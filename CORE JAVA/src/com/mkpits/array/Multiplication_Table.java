package com.mkpits.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multiplication_Table {

    public static void main(String[] args) throws NumberFormatException, IOException {
        int n = 15;

        // Uncomment the following lines if you want to take input from the user
        // BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        // System.out.print("Enter N value: ");
        // int n = Integer.parseInt(input.readLine());

        // Create a 2D array to store the multiplication table
        int[][] table = new int[n][n];

        // Generate the multiplication table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                table[i - 1][j - 1] = i * j;
            }
        }

        // Display only the horizontal multiplication table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.printf("  %2d  ", table[i - 1][j - 1]);
            }
            System.out.println();
        }
    }
}
