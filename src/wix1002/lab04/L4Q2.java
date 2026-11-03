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
public class L4Q2 {
    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int finalsum=0,sum=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                sum+=1;
            }
            finalsum=finalsum+sum;
        }
        System.out.println("Sum of the series: "+finalsum);
    }
}
