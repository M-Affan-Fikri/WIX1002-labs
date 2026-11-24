/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wix1002.lab06;

/**
 *
 * @author User
 */
public class L6Q1 {
    public static void main(String[] args) {
        for(int i=1;i<=20;i++){
            System.out.print(triangular(i)+" ");
        }
    }
    static int triangular(int n){
        double T = 0.5*n*(n+1);
        return (int)T;
    }
        
}
