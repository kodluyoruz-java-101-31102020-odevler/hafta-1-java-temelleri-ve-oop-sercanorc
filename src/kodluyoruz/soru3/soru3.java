package kodluyoruz.soru3;

import java.util.Random;

public class soru3 {
    public static void main(String[] args) {

        int[] array = new int[100];

        for(int i=0; i<100; i++) {
            Random rastgele = new Random();
            int number = rastgele.nextInt(100)+1;
            array[i] = number;
        }

        System.out.println("Ortalama : "+ mean(array));

    }
    public static double mean(int array[]){
        int sum=0;
        for(int number:array){
            sum+=number;
        }
        System.out.println("toplam : "+sum);
        double mean= (double)sum/array.length;

        return mean;
    }
}
