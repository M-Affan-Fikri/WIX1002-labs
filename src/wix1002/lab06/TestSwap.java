/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wix1002.lab06;

/**
 *
 * @author User
 */
public class TestSwap {
    public static void main(String[] args) {
        int a=5;
        int b=10;
        // 2nd case (1st case use temp)
        a = a + b; // a=15
        b = a - b; // b=15-10=5
        a = a - b; // a=15-5=10
        System.out.println(a+" "+b);
        
        // 3nd case
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println(a+" "+b);
    }
}
