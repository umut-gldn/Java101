import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yıl, result;
        String burc;

        System.out.print("Doğum yılınızı giriniz: ");
        yıl = sc.nextInt();

        if (yıl <= 0) {
            System.out.println("Hatalı yıl girdiniz.");
        } else {
            result = yıl % 12;

            switch (result) {

                case 0:
                    burc = "Maymun";
                    break;

                case 1:
                    burc = "Horoz";
                    break;
                case 2:
                    burc = "Köpek";
                    break;
                case 3:
                    burc = "Domuz";
                    break;
                case 4:
                    burc = "Fare";
                    break;
                case 5:
                    burc = "Öküz";
                    break;
                case 6:
                    burc = "Kaplan";
                    break;
                case 7:
                    burc = "Tavşan";
                    break;
                case 8:
                    burc = "Ejderha";
                    break;
                case 9:
                    burc = "Yılan";
                    break;
                case 10:
                    burc = "At";
                    break;
                case 11:
                    burc = "Koyun";
                    break;
                default:
                    burc = "Hata";
            }
            System.out.println("Çin Zodyağı Burcunuz: " + burc);
        }

        sc.close();
    }
}
