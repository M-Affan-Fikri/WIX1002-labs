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
public class L2Q3 {
    public static void main(String[] args) {
        int sum = 0;
        
        System.out.println("3 random numbers: ");
        for(int i=0;i<3;i++){
            Random random = new Random();
            int randomint = random.nextInt(50-10+1)+10;
            System.out.println(randomint);
            
            sum+=randomint;
        }
        System.out.println("Sum: "+sum);
        System.out.println("Average: "+(sum/3));
    }
}
