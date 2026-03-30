package metotlar;

import java.util.Scanner;

public class RecursiveAsalSayi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int number = sc.nextInt();

        if(isAsal(number, number/2)){
            System.out.println(number+" Asal sayıdır ");
        }
        else{
            System.out.println(number+" Asal değil ");
        }
        sc.close();
    }

    public static boolean isAsal(int number, int i) {
        if (number <= 1)
            return false;

        if (i == 1)
            return true;

        if (number % i == 0)
            return false;

        return isAsal(number, i -1);
    }
}
