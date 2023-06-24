package Donguler;

import java.util.Scanner;

public class DoWhilePassword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pass;
        boolean askPassword = true;

        do {
            System.out.println("Şifre giriniz: ");
            pass = input.nextInt();
            if (pass==123){
                System.out.println("Doğru");
                askPassword = false;
            }else{
                System.out.println("Yanlış");
            }

        }while (askPassword);
    }
}
