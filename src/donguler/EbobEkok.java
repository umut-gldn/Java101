package donguler;

import java.util.Scanner;

//Öklid algoritması ile optimize şekilde çözdüm.
public class EbobEkok {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int n1 = sc.nextInt();
        System.out.print("Bir sayı giriniz: ");
        int n2 = sc.nextInt();

        int ebob = ebob(n1, n2);
        int ekok = ekok(n1, n2, ebob);

        System.out.println("Ebob: " + ebob);
        System.out.println("Ekok: " + ekok);

        sc.close();
    }

    public static int ebob(int a, int b) {
        int kalan;
        while (b != 0) {
            kalan = a % b;
            a = b;
            b = kalan;
        }
        return a;
    }

    public static int ekok(int a, int b, int ebob) {
        return (a * b) / ebob;
    }

}
