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
public class L4Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double min=Double.MAX_VALUE;
        double max=Double.MIN_VALUE;
        int count=-1,num=0,sum=0;
        double a=0,b,c;
        while(num>=0){
            count++;
            System.out.print("Enter a score[negative to quit]: ");
            num=scanner.nextInt();
            if(num<0)break;
            if(num<min){
                min=num;
            }else if(num>max){
                max=num;
            }
            sum+=num;
            a+=num*num;
        }
        double average = sum/count;
        b = (sum*sum)/count;
        c = count-1;
        double sd = Math.sqrt((a-b)/c);
        System.out.println("Minimum score: "+min);
        System.out.println("Maximum score: "+max);
        System.out.printf("Average score: %.2f %n",average);
        System.out.printf("Standard deviation: %.2f",sd);
    }
}
