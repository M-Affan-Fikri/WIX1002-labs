/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wix1002.lab02;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class L2Q1 {
    public static void main(String[] args) {
        System.out.print("Enter degree in Fahrenheit: ");
        Scanner scanner = new Scanner(System.in);
        int f = scanner.nextInt();
        
        double celsius = (f-32)/1.8;
        
        System.out.printf("\nIn Celsius: "+"%.2f",celsius);
        System.out.println("\n");
    }
}
