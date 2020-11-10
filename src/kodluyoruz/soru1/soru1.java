package kodluyoruz.soru1;

import java.util.Scanner;

public class soru1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String password = "12345";
        System.out.println("Klavyeden sifre giriniz...");
        String input = scanner.nextLine();

        if(input.equals(password)){
            System.out.println("Giris basarili");
        }else{
            System.out.println("Giris basarisiz");
        }

    }
}
