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
public class L2Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Weight of water in gram: ");
        double m = scanner.nextDouble();
        
        System.out.print("Initial temp: ");
        double initialtemp = scanner.nextDouble();
        
        System.out.print("Final temp: ");
        double finaltemp = scanner.nextDouble();
        
        double tempc = ((finaltemp-32)/1.8-(initialtemp-32)/1.8);
        
        double q = (m/1000)*(tempc)*4184;
        
        System.out.printf("The energy needed is: %e",q);
    }
}
