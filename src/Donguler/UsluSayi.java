package Donguler;

import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        int n,k;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Üssü alınacak sayı: ");
        n = scanner.nextInt();
        System.out.println("Üs olacak sayı: ");
        k = scanner.nextInt();
        int total = 1;

        int i = 1;
        while (i <= k){
            total *= n;
            i++;
        }
        System.out.println("Cevap : " + total);
    }
}
