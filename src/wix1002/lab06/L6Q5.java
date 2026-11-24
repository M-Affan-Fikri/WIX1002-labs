/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wix1002.lab06;
import java.util.*;
/**
 *
 * @author User
 */
public class L6Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int num1,num2,num3,count=0;
        while(true){
            System.out.println("Enter negative to quit.");
            num1 = random.nextInt(13);
            num2 = random.nextInt(13);
            System.out.print(num1+" x "+num2+" = ");
            num3 = scanner.nextInt();
            if(num3<0) break;
              
            if(check(num1,num2,num3)) count++;
        }
        System.out.println("Your score: "+count);
    }
    static boolean check(int a, int b, int c){
        return true ? a*b==c : false;
    }
}
