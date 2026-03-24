import java.util.Scanner;

public class BurcBulma {
    public static boolean tarihGecerliMi(int ay, int gun) {
        if (ay < 1 || ay > 12)
            return false;

        int[] gunler = { 31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30 };

        return gun >= 1 && gun <= gunler[ay - 1];
    }

    public static String burc(int ay, int gun) {

        if ((ay == 3 && gun >= 21) || (ay == 4 && gun <= 20))
            return "Koç";
        else if ((ay == 4 && gun >= 21) || (ay == 5 && gun <= 21))
            return "Boğa";
        else if ((ay == 5 && gun >= 22) || (ay == 6 && gun <= 22))
            return "İkizler";
        else if ((ay == 6 && gun >= 23) || (ay == 7 && gun <= 22))
            return "Yengeç";
        else if ((ay == 7 && gun >= 23) || (ay == 8 && gun <= 22))
            return "Aslan";
        else if ((ay == 8 && gun >= 23) || (ay == 9 && gun <= 22))
            return "Başak";
        else if ((ay == 9 && gun >= 23) || (ay == 10 && gun <= 22))
            return "Terazi";
        else if ((ay == 10 && gun >= 23) || (ay == 11 && gun <= 21))
            return "Akrep";
        else if ((ay == 11 && gun >= 22) || (ay == 12 && gun <= 21))
            return "Yay";
        else if ((ay == 12 && gun >= 22) || (ay == 1 && gun <= 21))
            return "Oğlak";
        else if ((ay == 1 && gun >= 22) || (ay == 2 && gun <= 19))
            return "Kova";
        else
            return "Balık";
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ay,gün;

        System.out.print("Doğduğunuz ayı girin: ");
        ay=sc.nextInt();

        System.out.print("Doğduğunuz günü girin: ");
        gün=sc.nextInt();

        if(tarihGecerliMi(ay, gün)){
            System.out.println("Burcunuz: "+burc(ay, gün));
        }else{
            System.out.println("Geçersiz tarih girdiniz! ");
        }
        sc.close();
    }
}
