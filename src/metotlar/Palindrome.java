package metotlar;

import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int input = sc.nextInt();

        printResult(input, "Reverse", isPalindromeReverse(input));
        printResult(input, "String", isPalindromeString(input));
        printResult(input, "Stack", isPalindromeStack(input));
        sc.close();

    }

    public static void printResult(int number, String method, boolean result) {
        if (result) {
            System.out.println("[" + method + "] " + number + " bir palindrome sayıdır ");
        } else {
            System.out.println("[" + method + "] " + number + " bir palindrome sayı değildir ");
        }
    }

    public static boolean isPalindromeReverse(int number) {
        int original = number;
        int reversed = 0;
        int digit;
        while (number > 0) {
            digit = number % 10;
            reversed = (reversed * 10) + digit;
            number /= 10;
        }
        return original == reversed;
    }

    public static boolean isPalindromeString(int number) {
        String s = String.valueOf(number);
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean isPalindromeStack(int number) {
        String s = String.valueOf(number);
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            stack.push(c);
        }
        for (char c : s.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }

}
