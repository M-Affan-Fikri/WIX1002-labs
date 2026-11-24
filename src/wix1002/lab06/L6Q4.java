/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wix1002.lab06;

/**
 *
 * @author User
 */
public class L6Q4 {
    public static void main(String[] args) {
        System.out.println(euclidean(24,8));;
        System.out.println(euclidean(200,625));;
    }
    static int euclidean(int a, int b){
        if(a<b){
            int temp = a;
            a=b;
            b=temp;
        }
        while(b!=0){
            int temp = a;
            a=b;
            b=temp%b;
        }
        return a;
    }
}
