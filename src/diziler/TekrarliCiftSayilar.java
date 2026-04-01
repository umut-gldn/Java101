package diziler;

import java.util.Scanner;

public class TekrarliCiftSayilar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Kaç elemanlı dizi gireceksiniz: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        boolean[] yazildi= new boolean[n];
        for (int i = 0; i < n; i++) {
            System.out.print(i + ". eleman: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Tekrar eden çift sayılar: ");
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0 ||yazildi[i]) {
                continue;
            }
            for (int j = i+1; j < n; j++) {
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]+" tekrar ediyor");
                    yazildi[i]=true;
                    yazildi[j]=true;
                    break;
                }
            }
        }
        sc.close();
    }
}
