package donguler;

import java.util.Scanner;

public class KuvvetBulma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int input = sc.nextInt();

        System.out.print("4'ün kuvvetleri: ");
        for (int i = 1; i <= input; i *= 4) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.print("5'in kuvvetleri: ");
        for (int i = 1; i <= input; i *= 5) {
            System.out.print(i + " ");
        }

        // ikinci yöntem tek döngüde
       /*  System.out.println();
        System.out.println("----------------");
        int a = 1, b = 1;

        while (a <= input || b <= input) {
            if (a <= input) {
                System.out.println("4'ün kuvveti: " + a);
                a = a * 4;
            }
             if (b <= input) {
                System.out.println("5'in kuvveti: " + b);
                b = b * 5;
            }
        }
        */
        sc.close();
    }
}
