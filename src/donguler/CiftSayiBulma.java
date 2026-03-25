package donguler;

import java.util.Scanner;

public class CiftSayiBulma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int input = sc.nextInt();
        int sum = 0, count = 0;
        for (int i = 0; i < input; i++) {

            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
                count++;
            }
        }
        if (count > 0) {
            double result = (double) sum / count;
            System.out.println("Sayıların ortalaması: " + result);
        }else
            System.out.println("Uygun sayı yok");

            sc.close();
    }

}
/*
Test case
10 -> 0.0
100 -> 48.0
50 -> 24.0
*/
