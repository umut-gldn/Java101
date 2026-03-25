package donguler;

import java.util.Scanner;

//suma göre de if yaptım ama orada ufak bir bug olabilir. 0 girdiğinde uygun bir değer ama istenilen değer girilmemiş gibi veriyor.
//ondan counta göre yaptım.öyle olunca 0 girse de ondan sonra tek girerse toplamı 0 olarak yazıyorum.
public class TekSayiBulma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        int sum = 0,count=0;
        do {
            System.out.print("Bir sayı giriniz: ");
            input = sc.nextInt();

            if (input % 4 == 0) {
                sum += input;
                count++;
            }
        } while (input % 2 == 0);

        if (count == 0) {
            System.out.println("İstenilen değer girilmedi");
        } else {
            System.out.println("Toplamı: " + sum);
        }
        sc.close();
    }
}
