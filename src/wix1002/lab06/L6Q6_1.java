package wix1002.lab06;

public class L6Q6_1 {
    public static void main(String[] args) {
        int a = 123464321;
        System.out.println(palindrome(a)); // true

        int b = 18;
        System.out.println(emirp(b)); // false

        System.out.println(emirp(13)); // true (13 and 31 are both prime, and 13 != 31)
    }

    static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; (long) i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    static boolean palindrome(int n) {
        if (n < 0) {
            return false;
        }
        char[] arr = String.valueOf(n).toCharArray();
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[left] != arr[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    static boolean emirp(int n) {
        if (n < 2 || !isPrime(n)) {
            return false;
        }

        char[] arr = String.valueOf(n).toCharArray();
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        long reversedLong = Long.parseLong(new String(arr));
        if (reversedLong > Integer.MAX_VALUE) {
            return false;
        }

        int reversedPrime = (int) reversedLong;
        return reversedPrime != n && isPrime(reversedPrime);
    }
}