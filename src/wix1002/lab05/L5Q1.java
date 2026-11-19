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
public class L5Q1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = scanner.nextInt();
        int[] array = new int[N];
        System.out.println(N+" chosen");
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int sum=0;
        //start loop from 1 bcs 0 alrdy assigned
        for(int i=0;i<=array.length-1;i++){
            int score = random.nextInt(100);
            array[i]=score;
            
            if(array[i]<min){
                min=array[i];
            }else if(array[i]>max){
                max=array[i];
            }
            sum+=array[i];
            System.out.println(score);
        }
        System.out.println("Highest: "+max);
        System.out.println("Lowest: "+min);
        System.out.println("Average: "+sum/N);
        
    }
}
