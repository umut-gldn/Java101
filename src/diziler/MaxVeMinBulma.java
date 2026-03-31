package diziler;

import java.util.Scanner;

public class MaxVeMinBulma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Kaç elemanlı dizi gireceksiniz: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print(i + ". eleman: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Sayıyı giriniz: ");
        int sayi = sc.nextInt();

        int kucukEnYakin = Integer.MIN_VALUE;
        int buyukEnYakin = Integer.MAX_VALUE;

        for (int eleman : arr) {
            if (eleman < sayi && eleman > kucukEnYakin) {
                kucukEnYakin = eleman;
            }
            if (eleman > sayi && eleman < buyukEnYakin) {
                buyukEnYakin = eleman;
            }
        }

        if (kucukEnYakin == Integer.MIN_VALUE) {
            System.out.println("Girilen sayıdan küçük eleman bulunamadı");
        } else {
            System.out.println("Girilen sayıdan küçük en yakın sayı: " + kucukEnYakin);
        }

        if (buyukEnYakin == Integer.MAX_VALUE) {
            System.out.println("Girilen sayıdan büyük eleman bulunamadı");
        } else {
            System.out.println("Girilen sayıdan büyük en yakın sayı: " + buyukEnYakin);
        }

        sc.close();
    }
}
