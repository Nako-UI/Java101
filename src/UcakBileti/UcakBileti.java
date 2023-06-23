package UcakBileti;

import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {

        int mesafe, yas, yolculuktipi;
        double YasInOr = 0;
        double GidisDonus=0;

        Scanner input = new Scanner(System.in);
        System.out.println("Mesafeyi KM cinsinden tamsayı olarak giriniz: ");
        mesafe = input.nextInt();
        System.out.println("Yaşınızı giriniz: ");
        yas = input.nextInt();
        System.out.println("Tek yön için 1 , Gidiş-Dönüş için 2 giriniz: ");
        yolculuktipi = input.nextInt();

        if (yolculuktipi==1 || yolculuktipi==2){
            System.out.println("");
        }else {
            System.out.println("Hatalı veri girdiniz ! ");
        }

        if (mesafe<0){
            System.out.println("Hatalı veri girdiniz !");
        }

        if (yas<12){
            YasInOr =0.50;
        }else if(yas>=12 && yas<=24){
            YasInOr =0.1;
        }else if (yas>65){
            YasInOr =0.2;
        }

        if (yolculuktipi==1){
            GidisDonus=1;
        } else if (yolculuktipi==2) {
            GidisDonus=0.2;
        }


        double NormalTutar= mesafe*0.10;
        System.out.println("Normal tutar = " + NormalTutar);
        double Yasindirimi= NormalTutar* YasInOr;
        System.out.println("Yaş indirimi = " + Yasindirimi);
        double IndirimliTutar = NormalTutar-Yasindirimi;
        System.out.println("İndirimli tutar = "+ IndirimliTutar);
        double GidisDonusIndirim=IndirimliTutar*GidisDonus;
        System.out.println("Gidiş dönüş bilet indirimi = " + GidisDonusIndirim);
        Double ToplamTutar = (IndirimliTutar-GidisDonusIndirim)*2;
        System.out.println("Toplam tutar = " + ToplamTutar);
    }
}
