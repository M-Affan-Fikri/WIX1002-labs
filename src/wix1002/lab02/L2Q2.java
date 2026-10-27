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
public class L2Q2 {
    public static void main(String[] args) {
        System.out.println("MONTHLY PAYMENT CALCULATOR");
        System.out.print("Price of car: ");
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        
        System.out.print("Down payment: ");
        int d = scanner.nextInt();
        
        System.out.print("Interest rate in %: ");
        double r = scanner.nextDouble();
        
        System.out.print("Loan duration in year: ");
        int y = scanner.nextInt();
        
        double m_payment = (p-d)*(1+r*y/100)/(y*12);
        
        if(p<=0||d<=0||r<=0||y<=0||d>p){
            System.out.println("Invalid input!");
        }
        
        System.out.printf("Monthly payment: "+"%.2f",m_payment);
    }
}
