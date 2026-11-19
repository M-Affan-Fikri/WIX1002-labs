/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wix1002.lab05;
import java.util.*;
/**
 *
 * @author User
 */
public class L5Q3 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n=scanner.nextInt();
        int[][] arr = new int[n][7];
        int hour;
        for(int m=0;m<arr.length;m++){
            int sum=0,count=0;
            System.out.println("Employee "+(m+1)+": ");
            for(int i=0;i<7;i++){
                hour = rand.nextInt(8)+1;
                arr[m][i]=hour;
                System.out.print(arr[m][i]+"  ");
                sum+=hour;
                count++;
                if(count==7){
                    System.out.println("\nTotal hours for employee "+(m+1)+": "+sum);
                }
            }
            System.out.println();
            
        }
    }
}
