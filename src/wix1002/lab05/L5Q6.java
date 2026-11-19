/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wix1002.lab05;
import java.util.Scanner;

public class L5Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer for the size of Pascal's Triangle: ");
        int n = scanner.nextInt();

        int[][] pascal = new int[n][n];

        // Build Pascal's Triangle in the square matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                // The first column and diagonal elements are always 1
                if (j == 0 || j == i) {
                    pascal[i][j] = 1;
                } else {
                    // Sum of the element above and to the upper-left
                    pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
                }
            }
        }

        // Display the square matrix format
        System.out.println("\nPascal's Triangle in a square matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(pascal[i][j] + "\t");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}