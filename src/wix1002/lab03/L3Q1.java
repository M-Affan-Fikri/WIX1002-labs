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
public class L3Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 2 integer number: ");
        double num1 = scanner.nextInt();
        double num2 = scanner.nextInt();
        
        System.out.print("Enter the operand: ");
        var operator = scanner.next().charAt(0);
        
        double result = 0;
        
        switch(operator){
            case '+': 
                result = num1 + num2; 
                break;
            case '-': 
                result = num1 - num2; 
                break;
            case 'x': 
                result = num1 * num2; 
                break;
            case '/': 
                if(num2==0){
                    System.out.println("Cannot divide by zero.");
                    break;
                }else{
                    result = num1 / num2;
                    break;
                }
            default: 
                System.out.println("Invalid."); 
                break;
        }
        if(num2==0&&operator=='/') System.out.println("");
        else System.out.println("Result: "+result);
        
    }
}
