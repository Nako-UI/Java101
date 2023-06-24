package Donguler;

import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println( "faktoriyel sayısını giriniz: ");
        int n = scanner.nextInt();
        int total = 1;

        for (int i = 1; i <= n; i++){
            total = total * i;
        }
        System.out.println(total);
    }
}
