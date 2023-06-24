package Donguler;

import java.util.Scanner;

public class tekSayi {
    public static void main(String[] args) {
        int sayi;
        int total =0;

        Scanner input = new Scanner(System.in);

       do {
           System.out.println("Sayı giriniz: ");
           sayi = input.nextInt();
            if (sayi % 2 ==1 ){
                total += sayi;
            }
       } while (sayi > 0);

        System.out.println("Toplam : " + total);
    }
}
