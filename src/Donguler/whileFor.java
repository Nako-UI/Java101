package Donguler;

import java.util.Scanner;

public class whileFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
                int sayi;
        for (boolean run = true; run; ){
            System.out.println("Sayı giriniz: ");
            sayi = input.nextInt();
            if (sayi < 0){
                run = false;
            }

        }

    }
}
