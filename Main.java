import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kaç elemanlı bir dizi olsun:");
        int a = sc.nextInt();
        double toplam=0;
        double[] array = new double[a];
        for(int i=0; i<a; i++)
        {
            array[i]=i+1;
        }
        for(int i=0; i<a; i++)
        {
            toplam += 1/array[i];
        }
        toplam = a/toplam;
        System.out.println("Sonuc : "+toplam);
        sc.close();
    }
}