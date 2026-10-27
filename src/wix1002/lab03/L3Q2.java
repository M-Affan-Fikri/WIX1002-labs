/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wix1002.lab03;
import java.util.Random;
/**
 *
 * @author User
 */
public class L3Q2 {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt((5-0+1)+0);
        String num="1";
        switch(number){
            case 0:
                num = "zero";
                break;
            case 1:
                num = "one";
                break;
            case 2:
                num = "two";
                break;
            case 3:
                num = "three";
                break;
            case 4:
                num = "four";
                break;
            case 5:
                num = "five";
                break;
            default:
                System.out.println("Invalid.");
        }
        System.out.println(number+" is "+num);
    }
}
