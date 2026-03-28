package donguler;

import java.util.Scanner;

public class MukemmelSayiBulma {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int input = sc.nextInt();
        int result = 0;
        
        if (input <= 0) {
            System.out.println(" Lütfen 0 dan büyük sayı giriniz");
            sc.close();
            return;
        }

        for (int i = 1; i < input; i++) {
            if (input % i == 0) {
                result += i;
            }
        }
        if (result == input) {
            System.out.println(input + " Mükemmel sayıdır");
        } else {
            System.out.println(input + " Mükemmel sayı değildir");
        }
        sc.close();
    }
}
/*
 * 1 mükemmel sayı değildir.
 * Mükemmel sayı örnekleri
 * 28
 * 496
 * 8128
 */
