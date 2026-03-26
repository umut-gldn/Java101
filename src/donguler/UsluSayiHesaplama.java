package donguler;

import java.util.Scanner;

public class UsluSayiHesaplama {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int taban, us;
        System.out.print("Üssü alınacak sayı: ");
        taban = sc.nextInt();

        System.out.print("Üs olacak sayı: ");
        us = sc.nextInt();

      
        int mutlakUs=Math.abs(us);
        double result=1;
      
      
            for(int i=1;i<=mutlakUs;i++){
                result =result*taban;
            }
            if(us<0){
                result=1/result;
            }
            System.out.println("Sonuç: "+result);
      
        /*  if (us < 0) {

            double result = 1;
            for (int i = 1; i <= -us; i++) {
                result = result * taban;
            }
            System.out.println("Sonuç: "+(1.0/result));
        }
        else{
            int result=1;
             for (int i = 1; i <= us; i++) {
                result = result * taban;
            }
         System.out.println("Sonuç: " + result);
        }
        */
        sc.close();
    }
}
