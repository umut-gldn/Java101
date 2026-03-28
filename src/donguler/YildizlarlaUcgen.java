package donguler;

import java.util.Scanner;

public class YildizlarlaUcgen {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int input = sc.nextInt();
        ustUcgen(input);
        altUcgen(input);
        /*
         * for (int i = 1; i <= input; i++) {
         * 
         * for (int j = 1; j <= input - i; j++) {
         * System.out.print(" ");
         * }
         * for (int k = 1; k < 2 * i; k++) {
         * System.out.print("*");
         * }
         * System.out.println();
         * }
         */
        /*
         * for (int i = input - 1; i >= 1; i--) {
         * 
         * for (int j = 0; j < input - i; j++) {
         * System.out.print(" ");
         * }
         * for (int k = 0; k < 2 * i - 1; k++) {
         * System.out.print("*");
         * }
         * 
         * System.out.println();
         * }
         */
        sc.close();
    }

    public static void ustUcgen(int number) {
        for (int i = 1; i <= number; i++) {

            for (int j = 1; j <= number - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < 2 * i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void altUcgen(int number) {
        for (int i = number - 1; i >= 1; i--) {
            for (int j = 1; j <= number - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < 2 * i; k++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
