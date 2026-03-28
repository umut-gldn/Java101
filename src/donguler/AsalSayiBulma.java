package donguler;

public class AsalSayiBulma {

    //bölenlerine 2 den başlayarak bakmak daha mantıklı. kodu daha az çalıştırır.
    public static void main(String[] args) {
        System.out.println("1 ile 100 arası asal sayılar: ");
        boolean asal=true;

        for (int i = 2; i <= 100; i++) {
            asal=true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                   asal=false;
                   break;
                }   
            }
            if(asal){
                System.out.print(i+" ");
            }
        }
    }
}
