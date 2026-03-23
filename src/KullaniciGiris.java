import java.util.Scanner;

public class KullaniciGiris {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String realPassword="test";
        int remainAttempt=3;
        boolean logged=false;

        while(remainAttempt>0){
            System.out.print("Şifrenizi giriniz:");
            String inpPassword=sc.nextLine();

            if(realPassword.equals(inpPassword)){
                System.out.println("Giriş başarılı");
                logged=true;
                break;
            }
            else{
                remainAttempt--;
                if(remainAttempt>0){
                    System.out.println("Şifre yanlış. Kalan giriş hakkınız: "+remainAttempt);
                }
                else{
                    System.out.println("Şifre yanlış. Giriş hakkınız bitti");
                }
            }
        }
        if(!logged){
            System.out.print("Şifrenizi sıfırlamak ister misiniz? (evet/hayır)");
            String answer=sc.nextLine();
            //girilen değerin başından ve sonundaki boşlukları atıyorum. sonra stringi küçük harflere çevirip evet ile başlayıp başlamadığını kontrol ediyorum.
            //Evet ,evettt, evet . başında boşluk ya da evete,evet abi gibi değerleri de kabul ediyorum. 
            if(answer.trim().toLowerCase().startsWith("evet")){
                System.out.print("Yeni şifrenizi girin: ");
                String newPassword=sc.nextLine();
                if(newPassword.trim().isEmpty()){
                System.out.println("Şifre boş olamaz");
                }else if(newPassword.equals(realPassword)){
                    System.out.println("Eski şifre ile aynı olamaz");
                }else{
                    System.out.println("Şifre değiştirildi");
                    realPassword=newPassword;
                }
            }
            else{
                System.out.println("Şifre sıfırlama iptal oldu");
            }
        }
        sc.close();
    }

}
