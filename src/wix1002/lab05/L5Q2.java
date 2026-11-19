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
public class L5Q2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[10];
        
        for(int i=0;i<array.length;i++){
            int num;
            boolean isDuplicate;
            do{
                num=rand.nextInt(21);
                isDuplicate=false;
                
                for(int j=0;j<i;j++){
                    if(array[j]==num){
                        isDuplicate=true;
                        break;
                    }
                }
            }while(isDuplicate);
            
            array[i]=num;
            System.out.println(array[i]);
        }
    }
}
