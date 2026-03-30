package metotlar;

import java.util.Scanner;

//üssü double yapınca değeri ,0 ile girmezsem stackoverflowerror alıyorum.
public class RecursiveUsBulma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tabanı giriniz: ");
        double base = sc.nextDouble();

        System.out.print("Üssü giriniz: ");
        int exp = sc.nextInt();

        System.out.printf("Sonuç: %.6f ", usBulma(base, exp));

        sc.close();
    }

    public static double usBulma(double base, int exp) {
        if (exp == 0)
            return 1;
        if (exp < 0)
            return 1.0 / usBulma(base, -exp);
        return base * usBulma(base, exp - 1);
    }

}
