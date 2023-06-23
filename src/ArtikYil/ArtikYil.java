package ArtikYil;

import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        int year;

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir yıl giriniz: ");
        year = input.nextInt();

        if (year%4 == 0){
            System.out.println(year + " bir artık yıldır.");
        }else {
            System.out.println(year + " bir artık yıl değildir !");
        }

    }
}
