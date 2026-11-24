package wix1002.lab06;

public class L6Q6 {
    public static void main(String[] args) {
        System.out.println("\nFirst 20 Palindromic Primes:");
        int count = 0, num = 2;
        while (count < 20) {
            if (palindrome(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
        System.out.println("\n\nFirst 20 Emirps:");
        count = 0;
        num = 2;
        while (count < 20) {
            if (emirp(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }
    static boolean palindrome(int n){
        //separate integer into char array
        char[] arr = String.valueOf(n).toCharArray();
        int left=0;
        int right=arr.length-left-1;
        while(left<right){
            if(arr[left]!=arr[right]) return false;
            left++;
            right--;
        }
        return true;
    }
    static boolean emirp(int n){
        //check primeness
        boolean isPrime=true, isPrime2=true;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) isPrime=false;
        }
        char[] arr = String.valueOf(n).toCharArray();
        int left=0;
        int right=arr.length-left-1;
        while(left<right){
            char temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        String str2 = new String(arr);
        int reversedPrime = Integer.parseInt(str2);
        for(int i=2;i*i<=reversedPrime;i++){
            if(reversedPrime%i==0) isPrime2=false;
        }
        return isPrime && isPrime2 && (reversedPrime != n);
    }
}