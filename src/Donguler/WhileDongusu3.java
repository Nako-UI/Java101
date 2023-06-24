package Donguler;

import java.util.Scanner;

public class WhileDongusu3 {
    public static void main(String[] args) {
        int password;
        boolean isPasswordSuccess = false;

        Scanner input = new Scanner(System.in);

        while (!isPasswordSuccess) {
            System.out.println("Şifre giriniz: ");
            password = input.nextInt();
            if (password == 123) {
                System.out.println("Doğru");
                isPasswordSuccess = true;
            } else {
                System.out.println("Yanlış");
            }

        }
    }
}
