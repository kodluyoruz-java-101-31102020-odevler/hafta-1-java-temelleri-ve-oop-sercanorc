package kodluyoruz.soru2;

import java.util.Scanner;

public class soru2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("******* 4 Temel Matematiksel İslem ******* \n\nLütfen secim yapiniz\n"
        +"1.Toplama\n2.Cikarma\n3.Carpma\n4.Bölme");
        System.out.print("isleminiz :");
        int input =scanner.nextInt();
        System.out.println("2sayi giriniz");
        System.out.print("Sayi1 :");
        int sayi1 = scanner.nextInt();
        System.out.print("Sayi2 :");
        int sayi2 = scanner.nextInt();

        switch (input){
            case 1:
                System.out.println("Toplam islemi sonucu :"+ (sayi1+sayi2));
                break;
            case 2:
                System.out.println("Cikarma islemi sonucu :"+(sayi1-sayi2));
                break;
            case 3:
                System.out.println("Carpma islemi sonucu :"+(sayi1*sayi2));
                break;
            case 4:
                System.out.println("Cikarma islemi sonucu :"+(sayi1/sayi2));
                break;
            default:
                System.out.println("hatali giris");
        }



    }

}
