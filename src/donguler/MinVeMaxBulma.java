package donguler;

import java.util.Scanner;

public class MinVeMaxBulma {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int n;

        System.out.print("Kaç sayı gireceksiniz: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            int input = sc.nextInt();

            if (input > max) {
                max = input;
            }
            if (input < min) {
                min = input;
            }
        }
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
        sc.close();
    }
}
