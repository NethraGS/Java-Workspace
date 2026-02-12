package Core;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static int addition(int a, int b) {
        return a+b;
    }

    public static boolean checkPalindrome(int num) {
        int temp = num;
        int r = 0;
        while (num > 0) {
            int digit = num % 10;
            r = r * 10 + digit;
            num = num / 10;
        }
        return temp == r;
    }

    public static int sumOfArray(int[] arr) {
        int sumOfElements = 0;
        for (int i = 0; i < arr.length; i++) {
            sumOfElements = sumOfElements + arr[i];
        }
        return sumOfElements;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader temp = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(temp.readLine());

        if (checkPalindrome(input)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        int[] arr = {23, 45, 56, 7676};
        System.out.print("Sum of array elements: ");
        System.out.println(sumOfArray(arr));
    }
}