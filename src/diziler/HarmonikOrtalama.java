package diziler;

import java.util.Scanner;

public class HarmonikOrtalama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Kaç elemanlı dizi gireceksiniz: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print(i + ". eleman: ");
            arr[i] = sc.nextInt();
        }

        double sum = 0;
        for (int sayi : arr) {
            sum = sum + (1.0 / sayi);
        }
        double harmonikOrt = n / sum;
        System.out.printf("Harmonik Ortalama: %.3f" , harmonikOrt);

        sc.close();

    }

}
