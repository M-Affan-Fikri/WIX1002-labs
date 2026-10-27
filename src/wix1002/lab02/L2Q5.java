/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wix1002.lab02;
import java.util.Random;

/**
 *
 * @author User
 */
public class L2Q5 {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(10000-0+1)+0;
        System.out.println("Number: "+num);
        int sum = 0;
        while(num>0){
            sum += num%10;
            num/=10;
        }
        System.out.println("Sum of all digits: "+sum);
    }
}
