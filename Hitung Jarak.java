public import java.util.Scanner;

public class HitungJarak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta input kecepatan dan waktu
        System.out.print("Masukkan kecepatan mobil (km/jam): ");
        double kecepatan = input.nextDouble();

        System.out.print("Masukkan waktu perjalanan (jam): ");
        double waktu = input.nextDouble();

        // Menghitung jarak dalam meter
        double jarakMeter = kecepatan * waktu * 1000;

        // Menampilkan hasil
        System.out.println("Jarak yang ditempuh adalah: " + jarakMeter + " meter");
    }
} {
    
}
