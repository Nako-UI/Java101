package Donguler;

import java.util.Scanner;

public class KuvvetBulanProgram {
    public static void main(String[] args) {
        int number;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sınır sayısını giriniz: ");
        number = scanner.nextInt();

        for (int i = 1; i <= number; i*=2){
            System.out.println(i);
        }
    }
}
