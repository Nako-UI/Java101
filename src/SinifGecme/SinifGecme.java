package SinifGecme;

import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunu giriniz : ");
        mat = input.nextInt();
        if (mat<=0 || mat <=100){
            System.out.println("Geçersiz not girdiniz.");
        }

        System.out.println("Fizik notunu giriniz : ");
        fizik = input.nextInt();
        if (fizik<=0 || fizik <=100){
            System.out.println("Geçersiz not girdiniz.");
        }

        System.out.println("Türkçe notunu giriniz : ");
        turkce = input.nextInt();
        if (turkce<=0 || turkce <=100){
            System.out.println("Geçersiz not girdiniz.");
        }

        System.out.println("Kimya notunu giriniz : ");
        kimya = input.nextInt();
        if (kimya<=0 || kimya <=100){
            System.out.println("Geçersiz not girdiniz.");
        }

        System.out.println("Müzik notunu giriniz : ");
        muzik = input.nextInt();
        if (muzik<=0 || muzik <=100){
            System.out.println("Geçersiz not girdiniz.");
        }

        double average = (mat+fizik+turkce+kimya+muzik)/5;

        if (average<=55){
            System.out.println("Maalesef sınıfı geçemediniz.");
        }else{
            System.out.println("Sınıfı geçtiniz.");
        }
        System.out.println("Not ortalamanız: " + average);
    }
}
