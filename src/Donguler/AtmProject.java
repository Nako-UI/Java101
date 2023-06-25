package Donguler;

import java.util.Scanner;

public class AtmProject {
    public static void main(String[] args) {
        String userName, password;
        Scanner scanner = new Scanner(System.in);
        int right = 3;

        while (right > 0) {

            System.out.println("Kullanıcı adınız: ");
            userName = scanner.nextLine();

            System.out.println("Kullanıcı şifreniz: ");
            password = scanner.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Sisteme giriş yaptınız. ");
            } else {
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                System.out.println("Kalan hakkınız : " + --right);
            }

        }
    }
}
