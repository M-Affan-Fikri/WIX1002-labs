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
public class L2Q4 {
    public static void main(String[] args) {
        double hours,minutes,secondsfinal;
        System.out.print("Enter the number of seconds: ");
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        
        hours = seconds/3600.0;
        System.out.print(seconds+" seconds is ");
        System.out.print((int)hours+" hours, ");
        
        minutes = (hours-(int)hours)*60.0;
        System.out.println((int)minutes+" minutes and ");
        
        secondsfinal = (minutes-(int)minutes)*60.0;
        System.out.println((int)secondsfinal+" seconds.");
    }
}
