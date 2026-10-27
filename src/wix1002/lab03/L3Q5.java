/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wix1002.lab03;
import java.util.*;
/**
 *
 * @author User
 */
public class L3Q5 {
    public static void main(String[] args) {
        System.out.println("Enter a, b, c, d, e, f:");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        double e = scanner.nextDouble();
        double f = scanner.nextDouble();
        
        double determinant = (a*d-b*c);
        double epsilon = 0.0000001;
        if(Math.abs(determinant)<epsilon){
            System.out.println("The equation has no solution");
        }else{
            double x,y;
        x = (e*d-b*f)/(a*d-b*c);
        y = (a*f-e*c)/(a*d-b*c);
        
            System.out.printf("x = %.2f %n",x);
            System.out.printf("y = %.2f %n",y);
        }
        

    }
}
