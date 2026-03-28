package donguler;

import java.util.Scanner;

public class HarmonikSeriHesaplma {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Bir sayı giriniz ");
        int input =sc.nextInt();
        double sum=0;

        for (int i = 1; i <=input; i++) {
            sum += (1.0/i);
        }
        System.out.printf("Harmonik seri sonucu: %.3f ",sum);
        sc.close();
    }
}
