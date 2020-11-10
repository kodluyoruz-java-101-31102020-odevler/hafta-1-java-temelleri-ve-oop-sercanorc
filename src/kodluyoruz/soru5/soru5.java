package kodluyoruz.soru5;

import java.util.Random;

public class soru5 {
    public static void main(String[] args) {

        int[] array = new int[100];

        for(int i=0; i<100; i++) {
            Random rastgele = new Random();
            int number = rastgele.nextInt(100)+1;
            array[i] = number;
        }

        for(int i=0;i< array.length;i++){
            if(array[i]%2==0) {
                System.out.println(i+1 + ". eleman çift sayi " + array[i]);
                continue;
            }
            System.out.println(i+1+". eleman tek sayi "+array[i]);
        }


    }
}
