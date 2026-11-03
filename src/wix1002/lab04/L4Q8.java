/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wix1002.lab04;
import java.util.*;
/**
 *
 * @author User
 */
public class L4Q8 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n= rand.nextInt(100-1+1)+1;
        System.out.println("n: "+n);
        System.out.println("First "+n+" primes: ");
        
        int count=0;
        int currentNum=2;
        
        while(count<n){
            boolean isPrime=true;
            
            for(int i=2;i*i<=currentNum;i++){
                if(currentNum%i==0){
                    isPrime=false;
                    break;
                }
            }
            
            if(isPrime){
                System.out.println(currentNum+" ");
                count++;
            }
            
            currentNum++;
        }
        
    }
}
