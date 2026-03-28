package donguler;

import java.util.Scanner;

public class Atm {
    static Scanner sc = new Scanner(System.in);
    static int balance = 1500;

    public static void main(String[] args) {
        System.out.println("Merhaba Bankamıza hoşgeldiniz");
        if (login()) {
            System.out.println("Merhaba giriş başarılı");
            menu();
        }
    }

    public static boolean login() {
        int right = 3;
        while (right > 0) {
            System.out.print("Kullanıcı adınız: ");
            String username = sc.nextLine();
            System.out.print("Şifreniz: ");
            String password = sc.nextLine();

            if (username.equals("patika") && password.equals("1234")) {
                return true;
            }
            right--;
            System.out.println("Hatalı kullanıcı adı veya şifre. ");

            if (right == 0) {
                System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçin");
            } else {
                System.out.println("Kalan hakkınız: " + right);
            }
        }
        return false;
    }

    public static void menu() {
        int select;

        do {
            System.out.println("\n1- Para Yatır");
            System.out.println("2- Para Çek");
            System.out.println("3- Bakiye Sorgula");
            System.out.println("4- Çıkış Yap");
            System.out.print("Seçiminiz: ");
            select = sc.nextInt();

            switch (select) {
                case 1:
                    paraYatir();
                    break;
                case 2:
                    paraCek();
                    break;
                case 3:
                    bakiyeSor();
                    break;
                case 4:
                    System.out.println("Görüşürüz. Çıkış yapıldı");
                    break;
                default:
                    System.out.println("Geçersiz seçim, tekrar deneyiniz");

            }

        } while (select != 4);

    }

    public static void paraYatir() {
        System.out.print("Yatırılacak miktar: ");
        int amount = sc.nextInt();
        balance += amount;
        System.out.println("İşlem başarılı. Bakiyeniz: " + balance);
    }

    public static void paraCek() {
        System.out.print("Çekmek istediğiniz miktar: ");
        int amount=sc.nextInt();

        if(amount>balance){
            System.out.println("Yetersiz bakiye");
        }
        else{
            balance -=amount;
            System.out.println("İşlem başarılı. Bakiyeniz: "+balance);
        }
    }

    public static void bakiyeSor(){
        System.out.println("Bakiyeniz: "+balance);
    }
}
