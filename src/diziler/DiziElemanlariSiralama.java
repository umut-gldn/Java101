package diziler;

import java.util.Scanner;

public class DiziElemanlariSiralama {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Dizinin boyutunu giriniz:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Dizinin elemanlarını giriniz: ");

        for (int i = 0; i < n; i++) {
            System.out.print(i+". elemanı: ");
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.print("Sıralama: ");
        for (int sayi : arr) {
            System.out.print(sayi+" ");
        }
        sc.close();
    }
}
