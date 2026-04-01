package diziler;

import java.util.Scanner;

public class ElemanFrekans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Kaç elemanlı dizi gireceksiniz: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        boolean[] writed = new boolean[n];

        for (int i = 0; i < n; i++) {
            System.out.print(i + ". eleman: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Tekrar sayıları: ");
        for (int i = 0; i < n; i++) {
            if (writed[i])
                continue;

            int count=1;
            for (int j = i+1; j < n; j++) {
                if(arr[i]==arr[j]){
                    count++;
                    writed[j]=true;
                }
            }
            writed[i]=true;
            System.out.println(arr[i]+" sayısı "+count+" kere tekrar etti");
        }
        sc.close();
    }

}
