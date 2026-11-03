/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wix1002.lab04;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class L4Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int integer = scanner.nextInt();
        int i=0;
        while(i<integer){
            ++i;
            if(integer%i==0){
                System.out.print(i);
                if(i!=integer) System.out.print(", ");
            }
        }
        
    }
}
