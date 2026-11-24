package wix1002.lab06;
import java.util.*;

public class L6Q3 {
    public static void main(String[] args) {
        int[] arr=new int[10];
        Random random = new Random();
        for(int i=0;i<arr.length;i++){
            arr[i]=random.nextInt(10);
        }
        System.out.print(Arrays.toString(arr));
        System.out.println(Arrays.toString(reverse(arr)));
    }
    static int[] reverse(int[] arr){
        int left=0;
        int right=arr.length-1;
        System.out.println();
        while(left<right){
            int temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        return arr;
    }
}