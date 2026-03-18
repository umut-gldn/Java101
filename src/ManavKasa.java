import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        double result;
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Kaç kilo armut: ");
        double armutKg = sc.nextDouble();

        System.out.print("Kaç kilo elma: ");
        double elmaKg = sc.nextDouble();

        System.out.print("Kaç kilo domates: ");
        double domatesKg = sc.nextDouble();

        System.out.print("Kaç kilo muz: ");
        double muzKg = sc.nextDouble();

        System.out.print("Kaç kilo patlıcan: ");
        double patlicanKg = sc.nextDouble();

        result = (armut * armutKg) + (elma * elmaKg) + (domates * domatesKg) + (muzKg * muz) + (patlican * patlicanKg);
        System.out.printf("Toplam tutar: %.2f ", result);
    }

}
