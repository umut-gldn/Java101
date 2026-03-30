package metotlar;

import java.util.Scanner;

public class RecursiveDesen {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        hesapla(sc.nextInt());
        sc.close();
    }
    public static void hesapla(int n){

        System.out.print(n+" ");
        if(n>0){
            hesapla(n-5);
            System.out.print(n+" ");
        }
    }
}
