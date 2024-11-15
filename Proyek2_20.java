import java.util.Scanner;

public class Proyek2_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilaitugas;
        int nilaiUTS;
        int nilaiUAS;
        Double rata_rata;

        System.out.println("Masukkan Nilai Tugas anda  : ");
        nilaitugas = sc.nextInt();

        System.out.println("Masukkan Nilai UTS anda : ");
        nilaiUTS = sc.nextInt();

        System.out.println("Masukkan Nilai UAS anda : ");
        nilaiUAS = sc.nextInt();

        rata_rata= (double) (nilaitugas + nilaiUTS + nilaiUAS /3);

        System.out.println("Rata-rata nilai anda adalah"+ rata_rata);
    }
}
