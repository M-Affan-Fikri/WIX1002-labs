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
public class L3Q4 {
    public static void main(String[] args) {
        System.out.println("Roll dice twice for player 1");
        Random random = new Random();
        int roll1 = random.nextInt(6-1+1)+1;
        int roll2 = random.nextInt(6-1+1)+1;
        System.out.println("1st: "+roll1+"\n2nd: "+roll2);
        
        System.out.println("Roll dice for player 2");
        int roll3 = random.nextInt(6-1+1)+1;
        int roll4 = random.nextInt(6-1+1)+1;
        System.out.println("1st: "+roll3+"\n2nd: "+roll4);
        if((roll1+roll2)>(roll3+roll4)){
            System.out.println("Player 1 wins!");
        }else{
            System.out.println("Player 2 wins!");
        }

    }
}
