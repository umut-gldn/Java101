package donguler;

import java.util.Scanner;

public class TersUcgen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int input = sc.nextInt();

        altUcgen(input);
        sc.close();
    }

    public static void altUcgen(int number) {
        for (int i = number; i >= 1; i--) {
            for (int k = 1; k < 2 * i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
