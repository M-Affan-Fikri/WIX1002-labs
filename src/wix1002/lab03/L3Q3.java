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
public class L3Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sales: ");
        int sales = scanner.nextInt();
        double commision;
        if(sales<=100){
            commision=sales*0.05;
        }else if(sales>100&&sales<=500){
            commision=sales*0.075;
        }else if(sales>500&&sales<=1000){
            commision=sales*0.1;
        }else{
            commision=sales*0.125;
        }
        System.out.printf("Commision: %.2f %n",commision);
    }
}
