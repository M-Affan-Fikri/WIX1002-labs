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
public class L5Q5 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[20];
        System.out.println("List of 20 random numbers: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=rand.nextInt(101);
            System.out.print(arr[i]);
            if(i!=arr.length-1){
                System.out.print(", ");
            }
        }
        //bubble sort
        for(int pass=1;pass<arr.length;pass++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    
                    
                    }
                }
            }
        System.out.println("\nIn descending order: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i!=arr.length-1){
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.print("Enter your number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int linear=0;
        System.out.print("Linear search: ");
        for(int m=0;m<arr.length;m++){
            linear++;
            if(arr[m]==num){
                System.out.println(linear);
            }
        }
        System.out.print("Binary search: ");
        int low=0;
        int high=arr.length-1;
        int middle;
        int binary=0;
        while(low<=high){
            binary++;
            middle=(high+low)/2;
            if(num==arr[middle]){
                System.out.println(binary);
                break;
            }else if(num>arr[middle]){
                high=middle-1;
            }else{
                low=middle+1;
            }
        }
        
    }
}
