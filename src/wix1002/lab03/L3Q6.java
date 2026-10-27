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
public class L3Q6 {
    public static void main(String[] args) {
        System.out.print("Enter radius of circle: ");
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();
        
        System.out.println("Enter coordinate of a point (x,y): ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        
        int pointSquared = (x*x)+(y*y);
        int radiusSquared = radius*radius;
        
        if(pointSquared<=radiusSquared){
            System.out.println("The point is in the circle.");
        }else{
            System.out.println("The point is not in the circle.");
        }
        
    }
}
