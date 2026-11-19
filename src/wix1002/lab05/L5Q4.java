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
public class L5Q4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] matrix = new int[3][3];
        int num;
        System.out.println("3 by 3 matrix: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                num = rand.nextInt(10);
                matrix[i][j]=num;
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        
        System.out.println("After rotate 90 degrees clockwise: ");
        //rotate
        int[][] arr2 = new int[3][3];
        for(int m=0;m<3;m++){
            for(int n=0;n<3;n++){
                arr2[m][n]=matrix[2-n][m];
                System.out.print(arr2[m][n]+" ");
            }
            System.out.println();
        }
        
//        matrix2[0][0]=matrix[2][0];
//        matrix2[0][1]=matrix[1][0];
//        matrix2[0][2]=matrix[0][0];
//        matrix2[1][0]=matrix[2][1];
//        matrix2[1][1]=matrix[1][1];
//        matrix2[1][2]=matrix[0][1];
//        matrix2[2][0]=matrix[2][2];
//        matrix2[2][1]=matrix[1][2];
//        matrix2[2][2]=matrix[0][2];
        
    }
}
/*
00 01 02
10 11 12
20 21 22

20 10 00
21 11 01
22 12 02

temp=a
a=b
b=temp
*/