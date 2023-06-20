package Login;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);

        System.out.println("Kullanıcı adınız: ");
        userName = input.nextLine();

        System.out.println("Şifreniz: ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş yaptınız.");
        }else {
            System.out.println("Bilgileriniz yanlış. ");
        }
    }
}
