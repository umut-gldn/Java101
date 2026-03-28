package donguler;

import java.util.Scanner;

public class BasamakToplama {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int input = sc.nextInt();
        int original = input;
        int sum = 0, lastDigit;

        while (input > 0) {
            lastDigit = input % 10;

            sum += lastDigit;
            input /= 10;
        }
        System.out.println(original + " Sayısının rakamları toplamı: " + sum);
        sc.close();
    }

}
/* Test cases
4821-> 15
9275-> 23
3367-> 19 */
