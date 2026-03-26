package donguler;

import java.util.Scanner;

public class KombinasyonHesaplama {

    public static long faktoriyel(int n) {
        int sonuc = 1;
        for (int i = 2; i <= n; i++) {
            sonuc *= i;
        }
        return sonuc;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kombinasyon hesaplaması için 2 değer giriniz(5 3): ");

        int n = sc.nextInt();
        int r = sc.nextInt();

        if (n < 0 || r < 0 || r > n) {
            System.out.println("Hatalı değer girdiniz");
        } else {
            long kombinasyon = faktoriyel(n) / (faktoriyel(r) * faktoriyel(n - r));
            System.out.println("Sonuç: " + kombinasyon);
        }

     /*   matematikte basic hesaplamayı koda döktüm . 5 2 mesela (5*4)/1*2 nin formülize hali. 5/1 * 4/2 ile yapıyor kodda
        if (n < 0 || r < 0 || r > n) {
            System.out.println("Hatalı değer girdiniz");
        } else {
            int result=1;
            for(int i=1;i<=r;i++){
                result=(result*(n-i+1))/i;
            }
            System.out.println("Sonuç: "+result);
        }
            */
        sc.close();
    }
}
/*
 * Test case
 * 5 8 -> Hatalı değer girdiniz
 * 12 5 -> 792
 * 4 4 -> 1
 * 7 0 -> 1
 */
