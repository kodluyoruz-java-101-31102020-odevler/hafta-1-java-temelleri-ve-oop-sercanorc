package kodluyoruz.soru4;

import java.util.Scanner;

public class soru4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Son basamak : ");
        int lastStep = scanner.nextInt();
        for(int i = 0; i<=lastStep; i++) {
            for(int j = 0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
