import java.util.Scanner;

public class UcakBiletFiyatiHesaplama {

    public static void main(String[] args) {
        int yas, km, ucusTipi;
        double yasIndirimi=0,tipIndirimi=0,indirimliTutar,finalTutar;
        Scanner sc = new Scanner(System.in);

        System.out.print("Mesafeyi km cinsinden giriniz: ");
        km = sc.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        yas = sc.nextInt();

        System.out.print("Uçuş tipini seçin: 1->Tek Yön 2-> Gidiş-dönüş: ");
        ucusTipi = sc.nextInt();

        if (km <= 0 || yas <= 0 || !(ucusTipi == 1 || ucusTipi == 2)) {
            System.out.println("Hatalı Veri Girdiniz !");
        }
        else{
            double normalTutar=km*0.1;

            if(yas<12){
                yasIndirimi=normalTutar*0.5;
            }else if(yas<=24){
                yasIndirimi=normalTutar*0.1;
            }else if(yas>65){
                yasIndirimi=normalTutar*0.3;
            }
            indirimliTutar=normalTutar-yasIndirimi;
            finalTutar=indirimliTutar-tipIndirimi;

            if(ucusTipi==2){
                tipIndirimi=indirimliTutar*0.2;
                finalTutar= (indirimliTutar-tipIndirimi)*2;
            }
            System.out.println("Toplam Tutar: "+finalTutar+" TL");
        }

        sc.close();
    }
}
/*
TEST SENARYOLARI

1) Mesafe: 1500 | Yaş: 20 | Tip: 2
Beklenen: 216.0 TL

2) Mesafe: 1000 | Yaş: 10 | Tip: 1
Beklenen: 50.0 TL

3) Mesafe: 500 | Yaş: 30 | Tip: 1
Beklenen: 50.0 TL

4) Mesafe: 1000 | Yaş: 70 | Tip: 1
Beklenen: 70.0 TL

5) Mesafe: 800 | Yaş: 70 | Tip: 2
Beklenen: 89.6 TL

6) Mesafe: -500 | Yaş: 20 | Tip: 1
Beklenen: Hatalı Veri Girdiniz !

7) Mesafe: 500 | Yaş: 20 | Tip: 3
Beklenen: Hatalı Veri Girdiniz !

8) Mesafe: 1000 | Yaş: 12 | Tip: 1
Beklenen: 90.0 TL

9) Mesafe: 1000 | Yaş: 24 | Tip: 1
Beklenen: 90.0 TL

10) Mesafe: 1000 | Yaş: 65 | Tip: 1
Beklenen: 100.0 TL
*/
